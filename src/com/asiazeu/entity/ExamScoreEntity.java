package com.asiazeu.entity;

public class ExamScoreEntity extends CommonEntity{
	
private StudentEntity student;
private ExamTypeEntity examtype;


private int mark;
private String remark;

public StudentEntity getStudent() {
	return student;
}
public void setStudent(StudentEntity student) {
	this.student = student;
}
public ExamTypeEntity getExamtype() {
	return examtype;
}
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
