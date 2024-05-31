package org.hotel.model;

public class CityMasterModel {
	private int cityid;
	private String cityname;
	
	public CityMasterModel() {
		
	}
	public CityMasterModel(int cityid, String cityname) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
	}
	
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
}
