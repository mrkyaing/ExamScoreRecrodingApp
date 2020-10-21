package com.asiazeu.databaselayer;

import com.asiazeu.entity.StudentEntity;

public interface IStudentDAO {
void create(StudentEntity entity);
void getAll();
void update(int id,StudentEntity entity);
void delete(int id);
}
