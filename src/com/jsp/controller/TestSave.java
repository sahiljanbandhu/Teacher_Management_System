package com.jsp.controller;

import java.sql.SQLException;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TestSave {

	public static void main(String[] args) throws SQLException 
	
	{
		Teacher teacher=new Teacher();
		teacher.setId(12);
//		teacher.setName("Sahil");
//		teacher.setGmail("sahil@gmail.com");
//		teacher.setPhoneno(9892734138l);

		TeacherDao teacherdao=new TeacherDao();
		
		Teacher t1 = teacherdao.deleteTeacher(teacher);
		System.out.println(t1.getId()+ "data delete successfully");
		
	}

}
