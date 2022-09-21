package com.concerto.demos.SpringCoreDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.concerto.demos.SpringCoreDemo.database.StudentDatabase;
import com.concerto.demos.SpringCoreDemo.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDatabase studentDatabase;
	
	public int getStudentCount()
	{
		return this.studentDatabase.count();
	}
	@Transactional
	public boolean insertStudent(Student st) throws Exception
	{
		// student , address
//		studentDatabase.insertStudent(new Student(4,"first"));
//		studentDatabase.insertStudent(new Student(3,"second"));
		studentDatabase.insertStudent(st);
		return true;
	}
	public Student getStudentByRNo(int rno)
	{	
		return this.studentDatabase.getStudentByRNo(rno);
	}
}
