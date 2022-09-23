package com.springmvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.entity.TransactionDetails;
import com.springmvc.logindatabase.TransactionDatabase;



@Controller
public class DashboardController {
	@Autowired
	private TransactionDatabase trans; 
	
	@GetMapping("/dashboard")
	public  String dashboard(Map<String, List<TransactionDetails>> map,HttpSession session) {
		String email = (String)session.getAttribute("email");
		if(email==null) {
			return "redirect:login";
		}
		List<TransactionDetails> tran=trans.getAllTransactions(email);
		map.put("tr", tran);
		return "dashboard";
	}
	

}
