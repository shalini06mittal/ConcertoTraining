package com.concerto.demos.SpringCoreDemo.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.concerto.demos.SpringCoreDemo.entity.Student;
import com.concerto.demos.SpringCoreDemo.utility.DatabaseConstants;

@Repository
// CRUD operations for Student table
public class StudentDatabase {

	@Autowired
	private JdbcTemplate template;
	
	public int count()
	{
		String sql = "select count(*) from "+DatabaseConstants.tablename;
		return this.template.queryForObject(sql, Integer.class);
	}
	
	public boolean insertStudent(Student student) throws Exception
	{
		String sql ="insert into student values(?,?)";
		try {
			this.template.update(sql, student.getRno(), student.getName());
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			throw new Exception("Student with "+student.getRno()+" already exists");
		}
		return true;
	}
	// update and delete
	public Student getStudentByRNo(int rno)
	{
		Student student = null;
		String sql = "select * from student where rno=?";
		student = this.template.queryForObject(sql, new StudRowMapper(), rno);
		return student;
	}
	public List<Student> getAllStudents()
	{
		String sql = "select * from student";
		return this.template.query(sql, new StudRowMapper());
	}
	class StudRowMapper implements RowMapper<Student>
	{
		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Student student = new Student();
			student.setRno(rs.getInt(1));
			student.setName(rs.getString(2));
			return student;
		}
	}
}





