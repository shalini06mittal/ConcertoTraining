package com.ms;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CurrencyExchangeController {

	@Autowired
	private RestTemplate template;
	
	@RequestMapping("/exchange/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean calculateAmount(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity){
		
		String uri = "http://FOREX-SERVICE/currency-exchange/from/{from}/to/{to}";
		Map<String, String> map = new HashMap();
		map.put("from", from);
		map.put("to", to);
		//RestTemplate template = new RestTemplate();
		//ConversionBean bean = template.getForObject(uri, ConversionBean.class, map);
		
		ResponseEntity<ConversionBean> resp = template.getForEntity(uri, ConversionBean.class,map);
		ConversionBean bean = resp.getBody();
		System.out.println(resp.getStatusCode());
		bean.setQuantity(quantity);
		bean.setTotalCalculatedAmount(quantity.multiply(bean.getConversionMultiple()));
		return bean;
	}	
	
	@Autowired
	private ForexFeignCleint feignCleint;
	
	@RequestMapping("/exchange-feign/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean calculateAmountWithFeign(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity)
	{	
		ConversionBean bean = feignCleint.fetchMultiple(from, to);
		bean.setQuantity(quantity);
		bean.setTotalCalculatedAmount(quantity.multiply(bean.getConversionMultiple()));
		return bean;
	}	
	
}
