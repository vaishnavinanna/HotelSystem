package org.hotel.model;

public class ReviewMasterModel {
	int rid;
	int custid;
	int hid;
	String rtext;
	int rating;
	
	public ReviewMasterModel() {
		
	}
	public ReviewMasterModel(int rid, int custid, int hid, String rtext, int rating) {
		super();
		this.rid = rid;
		this.custid = custid;
		this.hid = hid;
		this.rtext = rtext;
		this.rating = rating;
	}
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getRtext() {
		return rtext;
	}
	public void setRtext(String rtext) {
		this.rtext = rtext;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
