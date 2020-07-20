package com.mat.model;

public class SelectKey {
	String management_num;
	String dong_name;
	String dong_sub_name;
	public String getManagement_num() {
		return management_num;
	}
	public void setManagement_num(String management_num) {
		this.management_num = management_num;
	}
	public String getDong_name() {
		return dong_name;
	}
	public void setDong_name(String dong_name) {
		this.dong_name = dong_name;
	}
	public String getDong_sub_name() {
		return dong_sub_name;
	}
	public void setDong_sub_name(String dong_sub_name) {
		this.dong_sub_name = dong_sub_name;
	}
	
	@Override
	public String toString() {
		return "SelectKey [management_num=" + management_num + ", dong_name=" + dong_name + ", dong_sub_name="
				+ dong_sub_name + "]";
	}
	
}
