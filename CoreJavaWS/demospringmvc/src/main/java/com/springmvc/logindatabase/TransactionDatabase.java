package com.springmvc.logindatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.LoginUser;
import com.springmvc.entity.TransactionDetails;

@Repository
public class TransactionDatabase {
	@Autowired
	private JdbcTemplate template;
	
	public List<TransactionDetails> getAllTransactions(String email)
	{
		String sql = "select * from Transaction where email=?";
		return this.template.query(sql, new TranRowMapper(),email);
	}
	class TranRowMapper implements RowMapper<TransactionDetails>
	{
		@Override
		public TransactionDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			TransactionDetails td = new TransactionDetails();
			td.setTid(rs.getInt(1));
			td.setAmount(rs.getInt(2));
			td.setEmail(rs.getString(3));
			return td;
		}
	}
		
}
