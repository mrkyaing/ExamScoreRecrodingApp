package com.asiazeu.entity;

import java.util.Date;

public abstract class CommonEntity {
private int id;
private Date createdDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

}
