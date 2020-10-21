package com.asiazeu.databaselayer;
import java.sql.*;
import com.asiazeu.entity.StudentEntity;
public class StudentService extends DBUtilitity implements IStudentDAO{
   
    
	@Override
	public void create(StudentEntity entity) {
		String sql="insert into student(name,email,phone,address,gender,dob,createddate) values(?,?,?,?,?,?,?)";
		Connection con=this.getConnection();
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,entity.getName());
			pstmt.setString(2, entity.getEmail());
			pstmt.setString(3,entity.getPhone());
			pstmt.setString(4, entity.getAddress());
			pstmt.setString(5, entity.getGender());
			pstmt.setObject(6, entity.getDob());
			pstmt.setObject(7, entity.getCreatedDate());
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
		String sql="select * from student";
		Connection con=this.getConnection();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(String.format("%-5s%-10s%-15s%-20s%-10s%-25s%-25s%s","id","name","email","phone","address","gender","DOB",
					"createdDate"));
			while(rs.next()) {
				
				System.out.println(String.format("%-5s%-10s%-15s%-20s%-10s%-25s%-25s%s",
						rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8)));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void update(int id, StudentEntity entity) {
		String sql="update student set name=?,email=?,phone=?,address=?,gender=?,dob=? where id=?";
		Connection con=this.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,entity.getName());
			pstmt.setString(2,entity.getEmail());
			pstmt.setString(3,entity.getPhone());
			pstmt.setString(4,entity.getAddress());
			pstmt.setString(5,entity.getGender());
			pstmt.setObject(6,entity.getDob());
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
		String sql="delete from student where id=?";	
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
