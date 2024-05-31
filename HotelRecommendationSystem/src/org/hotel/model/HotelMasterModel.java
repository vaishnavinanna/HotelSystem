package org.hotel.model;

public class HotelMasterModel extends AreaMasterModel {
	int hid;
	String hname;
	String address;
	String contact;
	String email;
	int areaid;
	int fid;
	
	public HotelMasterModel() {
		
	}
	public HotelMasterModel(int hid, String hname, String address, String contact, String email, int areaid, int fid) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.areaid = areaid;
		this.fid = fid;
	}
	
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAreaid() {
		return areaid;
	}
	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
}
