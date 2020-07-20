package com.mat.model;

public class SecurityLightVO {

	private int dong_id;
	private int dong_sub_id;
	private int management_num;
	private double latitude;
	private double longitude;
	private String install_street_address;
	private String telegraph_pole_num;
	private String pole_type;
	private int wattage;
	private String search_date;
	private String kepco_num;
	private String thumbnail_photo2;
	private String thumbnail_photo3;
	private String thumbnail_photo4;
	
	private DongInfoVO dongInfo;
	private DongSubInfoVO dongSubInfo;
	
	public SecurityLightVO(){}

	public SecurityLightVO(int dong_id, int dong_sub_id, int management_num, double latitude, double longitude,
			String install_street_address, String telegraph_pole_num, String pole_type, int wattage, String search_date,
			String kepco_num, String thumbnail_photo2, String thumbnail_photo3, String thumbnail_photo4,
			DongInfoVO dongInfo, DongSubInfoVO dongSubInfo) {
		super();
		this.dong_id = dong_id;
		this.dong_sub_id = dong_sub_id;
		this.management_num = management_num;
		this.latitude = latitude;
		this.longitude = longitude;
		this.install_street_address = install_street_address;
		this.telegraph_pole_num = telegraph_pole_num;
		this.pole_type = pole_type;
		this.wattage = wattage;
		this.search_date = search_date;
		this.kepco_num = kepco_num;
		this.thumbnail_photo2 = thumbnail_photo2;
		this.thumbnail_photo3 = thumbnail_photo3;
		this.thumbnail_photo4 = thumbnail_photo4;
		this.dongInfo = dongInfo;
		this.dongSubInfo = dongSubInfo;
	}

	public int getDong_id() {
		return dong_id;
	}

	public void setDong_id(int dong_id) {
		this.dong_id = dong_id;
	}

	public int getDong_sub_id() {
		return dong_sub_id;
	}

	public void setDong_sub_id(int dong_sub_id) {
		this.dong_sub_id = dong_sub_id;
	}

	public int getManagement_num() {
		return management_num;
	}

	public void setManagement_num(int management_num) {
		this.management_num = management_num;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getInstall_street_address() {
		return install_street_address;
	}

	public void setInstall_street_address(String install_street_address) {
		this.install_street_address = install_street_address;
	}

	public String getTelegraph_pole_num() {
		return telegraph_pole_num;
	}

	public void setTelegraph_pole_num(String telegraph_pole_num) {
		this.telegraph_pole_num = telegraph_pole_num;
	}

	public String getPole_type() {
		return pole_type;
	}

	public void setPole_type(String pole_type) {
		this.pole_type = pole_type;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) {
		this.wattage = wattage;
	}

	public String getSearch_date() {
		return search_date;
	}

	public void setSearch_date(String search_date) {
		this.search_date = search_date;
	}

	public String getKepco_num() {
		return kepco_num;
	}

	public void setKepco_num(String kepco_num) {
		this.kepco_num = kepco_num;
	}

	public String getThumbnail_photo2() {
		return thumbnail_photo2;
	}

	public void setThumbnail_photo2(String thumbnail_photo2) {
		this.thumbnail_photo2 = thumbnail_photo2;
	}

	public String getThumbnail_photo3() {
		return thumbnail_photo3;
	}

	public void setThumbnail_photo3(String thumbnail_photo3) {
		this.thumbnail_photo3 = thumbnail_photo3;
	}

	public String getThumbnail_photo4() {
		return thumbnail_photo4;
	}

	public void setThumbnail_photo4(String thumbnail_photo4) {
		this.thumbnail_photo4 = thumbnail_photo4;
	}

	public DongInfoVO getDongInfo() {
		return dongInfo;
	}

	public void setDongInfo(DongInfoVO dongInfo) {
		this.dongInfo = dongInfo;
	}

	public DongSubInfoVO getDongSubInfo() {
		return dongSubInfo;
	}

	public void setDongSubInfo(DongSubInfoVO dongSubInfo) {
		this.dongSubInfo = dongSubInfo;
	}

	@Override
	public String toString() {
		return "SecurityLightVO [dong_id=" + dong_id + ", dong_sub_id=" + dong_sub_id + ", management_num="
				+ management_num + ", latitude=" + latitude + ", longitude=" + longitude + ", install_street_address="
				+ install_street_address + ", telegraph_pole_num=" + telegraph_pole_num + ", pole_type=" + pole_type
				+ ", wattage=" + wattage + ", search_date=" + search_date + ", kepco_num=" + kepco_num
				+ ", thumbnail_photo2=" + thumbnail_photo2 + ", thumbnail_photo3=" + thumbnail_photo3
				+ ", thumbnail_photo4=" + thumbnail_photo4 + ", dongInfo=" + dongInfo + ", dongSubInfo=" + dongSubInfo
				+ "]";
	}
	
}
