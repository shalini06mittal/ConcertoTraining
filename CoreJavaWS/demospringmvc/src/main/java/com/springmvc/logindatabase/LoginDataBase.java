package com.springmvc.logindatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.LoginUser;

@Repository
public class LoginDataBase {
	
	@Autowired
	private JdbcTemplate template;
	
	public boolean validateUser(LoginUser user) {
		
		String sql = "select password from loginuser where email=?";
		try{
			String password = template.queryForObject(sql, String.class,user.getEmail());
			if(password!=null&&password.equals(user.getPassword())) {
				return true;
			}
		}
		catch(Exception e) {return false;}
		return false;
	}
	
	public boolean insertUser(LoginUser user) {
		
		try {
		String sql="insert into loginuser values(?,?,?)";
	   int a=template.update(sql,user.getUsername(),user.getEmail(),user.getPassword());
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
