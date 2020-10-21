package com.asiazeu.databaselayer;
import com.asiazeu.entity.ExamTypeEntity;
public interface IExamTypeDAO {
		void create(ExamTypeEntity entity);
		void getAll();
		void update(int id,ExamTypeEntity entity);
		void delete(int id);
}
