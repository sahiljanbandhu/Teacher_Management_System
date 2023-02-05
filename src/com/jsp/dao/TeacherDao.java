package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Teacher;
import com.jsp.helper.HelpherClass;

public class TeacherDao 
{
	HelpherClass helpherclass= new HelpherClass();

	public Teacher saveTeacher(Teacher teacher) throws SQLException 
	{
		Connection connection=helpherclass.getConnection();
		String sql="INSERT INTO TEACHER VALUES(?,?,?,?)"; 
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.setString(2, teacher.getName());
			preparedStatement.setString(3, teacher.getGmail());
			preparedStatement.setLong(4, teacher.getPhoneno());
			
			preparedStatement.execute();
			connection.close();
			System.out.println("closed");
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			
		}
	
		return teacher;
	}
	
	
	public Teacher deleteTeacher(Teacher teacher)
	{
		Connection connection=helpherclass.getConnection();
		String sql="DELETE FROM TEACHER WHERE ID=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.executeUpdate();
			connection.close();
			System.out.println("closed");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return teacher;
	}
	
	public Teacher updateTeacher(Teacher teacher)
	{
		Connection connection=helpherclass.getConnection();
		String sql="UPDATE TEACHER SET NAME=? WHERE ID=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.executeUpdate();
			connection.close();
			System.out.println("closed");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return teacher;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}