package com.techment.modal;

public class Bank {
String name;
String ifscCode;
String branch;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIfscCode() {
	return ifscCode;
}
public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
Bank(String branch){
	this.branch=branch;
}
@Override
public String toString() {
	return "Bank [name=" + name + ", ifscCode=" + ifscCode + ", branch=" + branch + "]";
}






}
