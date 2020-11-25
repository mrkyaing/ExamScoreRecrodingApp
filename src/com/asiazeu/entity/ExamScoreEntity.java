package com.asiazeu.entity;

public class ExamScoreEntity extends CommonEntity{

//Composition (part of relationship) 
private StudentEntity student;
private ExamTypeEntity examtype;

private int mark;
private String remark;
//getter of student 
public StudentEntity getStudent() {
	return student;
}
//setter of student
public void setStudent(StudentEntity student) {
	this.student = student;
}
//getter of Exam Type
public ExamTypeEntity getExamtype() {
	return examtype;
}
//setter of exam Type
public void setExamtype(ExamTypeEntity examtype) {
	this.examtype = examtype;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}

}
