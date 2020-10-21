package com.asiazeu.databaselayer;

import com.asiazeu.entity.ExamScoreEntity;

public interface IExamScoreDAO {
	void create(ExamScoreEntity entity);
	void getAll();
	void update(int id,ExamScoreEntity entity);
	void delete(int id);
}
