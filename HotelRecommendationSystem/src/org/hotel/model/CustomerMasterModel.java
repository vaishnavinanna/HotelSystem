package org.hotel.model;

public class CustomerMasterModel {
	int custid;
	String custname;
	String custcontact;
	String custemail;

	public CustomerMasterModel() {

	}

	public CustomerMasterModel(int custid, String custname, String custcontact, String custemail) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custcontact = custcontact;
		this.custemail = custemail;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustcontact() {
		return custcontact;
	}

	public void setCustcontact(String custcontact) {
		this.custcontact = custcontact;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
}
