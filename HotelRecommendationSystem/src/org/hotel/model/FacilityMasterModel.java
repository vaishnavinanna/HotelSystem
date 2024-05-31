package org.hotel.model;

public class FacilityMasterModel {
	private int fid;
	private String fname;
	
	public FacilityMasterModel(int fid, String fname) {
		super();
		this.fid = fid;
		this.fname = fname;
	}
   public FacilityMasterModel() {
   	
		
	}
	
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
}
