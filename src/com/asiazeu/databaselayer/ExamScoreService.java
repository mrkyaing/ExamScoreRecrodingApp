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
				System.out.println("insert sucess !!");
			}
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, ExamScoreEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
