package com.mat.model;

public class DongSubInfoVO {
	private int dong_id;
	private String dong_sub_name;
	
	public DongSubInfoVO() {}

	public DongSubInfoVO(int dong_id, String dong_sub_name) {
		this.dong_id = dong_id;
		this.dong_sub_name = dong_sub_name;
	}

	public int getDong_id() {
		return dong_id;
	}

	public void setDong_id(int dong_id) {
		this.dong_id = dong_id;
	}

	public String getDong_sub_name() {
		return dong_sub_name;
	}

	public void setDong_sub_name(String dong_sub_name) {
		this.dong_sub_name = dong_sub_name;
	}

	@Override
	public String toString() {
		return "DongSubInfoVO [dong_id=" + dong_id + ", dong_sub_name=" + dong_sub_name + "]";
	}
}
