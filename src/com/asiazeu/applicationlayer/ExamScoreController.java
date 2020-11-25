package com.asiazeu.applicationlayer;

import com.asiazeu.databaselayer.ExamScoreService;
import com.asiazeu.databaselayer.IExamScoreDAO;
import com.asiazeu.entity.ExamScoreEntity;

public class ExamScoreController {

	IExamScoreDAO dao=null;
	
	public ExamScoreController() {
		//has-A relationship
		dao=new ExamScoreService();//composition  relationship
	}
	//association relationship
	public void create(ExamScoreEntity entity) {
		//(Application/Business logic  will be here)
		dao.create(entity);
	}
	public void getAll() {
		dao.getAll();
	}
}
