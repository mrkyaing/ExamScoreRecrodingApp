package com.asiazeu.entity;

import java.util.Date;
public class ExamTypeEntity extends CommonEntity{
private String name,type,remark;
private int duration,totalQuestions;
private Date examDate,createdDate;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public Date getExamDate() {
	return examDate;
}
public void setExamDate(Date examDate) {
	this.examDate = examDate;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public int getTotalQuestions() {
	return totalQuestions;
}
public void setTotalQuestions(int totalQuestions) {
	this.totalQuestions = totalQuestions;
}

}
