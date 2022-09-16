package com.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Login {

	Map<String, String> data = new HashMap<>();
	public void prepare()
	{
		data.put("abc", "abc");
		data.put("abc1", "abc1");
		data.put("abc2", "abc2");
		data.put("abc3", "abc3");
		
	}
	public boolean validateLogin(String u,String p) {
		
		for(String username:data.keySet()) 
		{
			
			if(username.equals(u)) {
				String password = data.get(username);
				System.out.println(password);
				if(password.equals(p))
					return true;
			}
		}
		return false;
	}
	
	
}
