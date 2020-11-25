package com.asiazeu.databaselayer;

import com.asiazeu.entity.ExamScoreEntity;
import java.sql.*;
public class ExamScoreService extends DBUtilitity implements IExamScoreDAO{
	String userid="s001";
	int age=20;//" Single Double +varName+ Double Single " ;
	String sql="Select * from user '"+userid+ "' and '" +age+"'  ";
	@Override
	public void create(ExamScoreEntity entity) {
		String sql="insert into score(studentid,examtypeid,mark,remark,createdDate) values(?,?,?,?,?)";
		Connection con=super.getConnection();
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, entity.getStudent().getId());
			pstmt.setInt(2, entity.getExamtype().getId());
			pstmt.setInt(3, entity.getMark());
			pstmt.setString(4, entity.getRemark());
			pstmt.setObject(5, entity.getCreatedDate());
			int insertedrows=pstmt.executeUpdate();
			if(insertedrows>0) {
				System.out.println("Score insert successfully!!");
			}
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public void getAll() {
		try {
			Connection con=this.getConnection();
			String sql="SELECT student.name,student.email,examtype.name,score.mark,examtype.totalQuestions,examtype.examdate FROM score inner join student on score.studentid=student.id inner join examtype on score.examtypeid=examtype.id;";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(String.format("%-20s%-20s%-20s%-10s%-20s%-20s","Student Name","Email","Exam Type","Mark","Total Question","Exam Date"));
		    while(rs.next()) {
		    	System.out.println(String.format("%-20s%-20s%-20s%-10s%-20s%-20s",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));	
		    }
		    rs.close();
		    stmt.close();
		    con.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void update(int id, ExamScoreEntity entity) {
		
		
	}

	@Override
	public void delete(int id) {
		
		
	}

}
