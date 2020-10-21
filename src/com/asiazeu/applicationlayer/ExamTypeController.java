package com.asiazeu.applicationlayer;
import com.asiazeu.databaselayer.*;
import com.asiazeu.entity.*;
public class ExamTypeController {
	 
		IExamTypeDAO dao=null;
		
		public ExamTypeController() {
			dao=new ExamTypeService();//composition  relationship
		}
		//association relationship
		public void create(ExamTypeEntity entity) {
			//PVP,IRR,
			dao.create(entity);
		}
		
		public void getAll() {
			dao.getAll();
		}
		
		public void update(int id, ExamTypeEntity entity) {
			dao.update(id, entity);
		}
		public void delete(int id) {
			dao.delete(id);
		}
}
