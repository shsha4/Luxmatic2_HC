package com.mat.model;

public class DongInfoVO {
	int dong_id;
	String dong_name;
	
	public DongInfoVO() {}
	
	public DongInfoVO(int dong_id, String dong_name) {
		this.dong_id = dong_id;
		this.dong_name = dong_name;
	}
	public int getDong_id() {
		return dong_id;
	}
	public void setDong_id(int dong_id) {
		this.dong_id = dong_id;
	}
	public String getDong_name() {
		return dong_name;
	}
	public void setDong_name(String dong_name) {
		this.dong_name = dong_name;
	}
	
	@Override
	public String toString() {
		return "Dong_info [dong_id=" + dong_id + ", dong_name=" + dong_name + "]";
	}
	
}
