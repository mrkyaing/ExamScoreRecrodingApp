package com.asiazeu.databaselayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.asiazeu.entity.ExamTypeEntity;

public class ExamTypeService extends DBUtilitity implements IExamTypeDAO{
	
	
	@Override
	public void create(ExamTypeEntity entity) {
		String sql="insert into examtype(type,name,duration,examdate,createddate,totalquestions,remark) values(?,?,?,?,?,?,?)";
		Connection con=this.getConnection();
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, entity.getType());
			pstmt.setString(2, entity.getName());
			pstmt.setInt(3, entity.getDuration());
			pstmt.setObject(4, entity.getExamDate());
			pstmt.setObject(5, entity.getCreatedDate());
			pstmt.setInt(6, entity.getTotalQuestions());
			pstmt.setString(7, entity.getType());
			int insertedrow=pstmt.executeUpdate();
			if(insertedrow>0) {
				System.out.println("insert succcess!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	@Override
	public void getAll() {
		String sql="select * from examtype";
		Connection con=this.getConnection();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(String.format("%-5s%-10s%-15s%-20s%-10s%-25s%-25s%s","id","type","name","duration","examdate","createddate","totalquestions","remark"));
			while(rs.next()) {			
				System.out.println(String.format("%-5s%-10s%-15s%-20s%-10s%-25s%-25s%s",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	@Override
	public void update(int id, ExamTypeEntity entity) {
		String sql="update examtype set type=?,name=?,duration=?,examdate=?,totalQuestions=?,remark=? where id=?";
		Connection con=this.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,entity.getType());
			pstmt.setString(2,entity.getName());
			pstmt.setInt(3,entity.getDuration());
			pstmt.setObject(4,entity.getExamDate());
			pstmt.setInt(5,entity.getTotalQuestions());
			pstmt.setString(6,entity.getRemark());
			pstmt.setInt(7, id);//where condition 
			int updatedrowcount=pstmt.executeUpdate();
			if(updatedrowcount>0) {
			   System.out.println("update success!!");
			}
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql="delete from examtype where id=?";	
		Connection con=this.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);//where condition 
			int deletedrows=pstmt.executeUpdate();
			if(deletedrows>0) {
			   System.out.println("delete success!!");
			}
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
