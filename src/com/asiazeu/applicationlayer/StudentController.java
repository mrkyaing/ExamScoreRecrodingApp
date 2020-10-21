package com.asiazeu.applicationlayer;
import com.asiazeu.databaselayer.IStudentDAO;
import com.asiazeu.databaselayer.StudentService;
import com.asiazeu.entity.StudentEntity;
public class StudentController {
	IStudentDAO dao=null;
	public StudentController() {
		dao=new StudentService();//composition  relationship
	}
	//association relationship
	public void create(StudentEntity entity) {
		//PVP,IRR,
		dao.create(entity);
	}
	
	public void getAll() {
		dao.getAll();
	}
	
	public void update(int id, StudentEntity entity) {
		dao.update(id, entity);
	}
	public void delete(int id) {
		dao.delete(id);
	}
}
