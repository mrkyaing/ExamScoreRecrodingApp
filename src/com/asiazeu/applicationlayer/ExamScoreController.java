package com.asiazeu.applicationlayer;

import com.asiazeu.databaselayer.ExamScoreService;
import com.asiazeu.databaselayer.IExamScoreDAO;
import com.asiazeu.entity.ExamScoreEntity;

public class ExamScoreController {

	IExamScoreDAO dao=null;
	
	public ExamScoreController() {
		dao=new ExamScoreService();//composition  relationship
	}
	//association relationship
	public void create(ExamScoreEntity entity) {
		//PVP,IRR,
		dao.create(entity);
	}
}
