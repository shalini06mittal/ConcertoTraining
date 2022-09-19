package com.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import mock.Portfolio;
import mock.Stock;
import mock.StockService;

class PortfolioTest {

	Portfolio portfolio;
	StockService stockService;
	
	@BeforeEach
	 void setUpBeforeEach() throws Exception {
		portfolio = new  Portfolio();
		
		stockService = Mockito.mock(StockService.class);
		
		portfolio.setStockService(stockService);
	}

	@AfterEach
	 void tearDownAfterEach() throws Exception {
	}

	@Test
	void test() {
		Stock s1 = new Stock("S1", "Stock 1", 3); // 50 = 150
		Stock s2 = new Stock("S2", "Stock 2", 1);// 100 = 100
		Stock s3 = new Stock("S3", "Stock 3", 5);// 70 = 350
		List<Stock> list = Arrays.asList(s1, s2, s3);
		portfolio.setStocks(list);
		
		when(stockService.getPrice(s1)).thenReturn(50.0);
		when(stockService.getPrice(s2)).thenReturn(100.0);
		when(stockService.getPrice(s3)).thenReturn(70.0);
		
		double expectedValue = 600.0;
		double actualValue = portfolio.getMarketValue();
		assertEquals(expectedValue, actualValue);
		
		verify(stockService, Mockito.atLeastOnce()).getPrice(s1);
		verify(stockService, Mockito.atLeast(2)).getPrice(s2);
	}

}
