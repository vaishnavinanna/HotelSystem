package org.hotel.service;

import org.hotel.model.CustomerMasterModel;
import org.hotel.repository.CustomerMasterRepository;

public class CustomerMasterService {

	CustomerMasterRepository custRepo=new CustomerMasterRepository();
	
	public boolean isAddNewCustomer(CustomerMasterModel custmodel) {
		return custRepo.isAddNewCustomer(custmodel);
	}

	public int getCustId(String custname) {
		return custRepo.getCustId(custname);
	}

	public boolean ViewCustomer() {
		return custRepo.ViewCustomer();
	}

	public boolean DeleteCustByName(String dname) {
		return custRepo.DeleteCustByName(dname);
	}

	public boolean UpdateNameByEmail(String uname, String newname) {
		return custRepo.UpdateNameByEmail(uname,newname);
	}

	public boolean UpdateContactByName(String uname, String newcontact) {
		return custRepo.UpdateContactByName(uname,newcontact);
	}

	public boolean UpdateEmailByName(String uname, String newemail) {
		return custRepo.UpdateEmailByName(uname,newemail);
	}
	
}
