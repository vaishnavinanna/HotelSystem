package org.hotel.service;

import org.hotel.model.FacilityMasterModel;
import org.hotel.repository.FacilityMasterRepository;

public class FacilityMasterService {

	FacilityMasterRepository frepo=new FacilityMasterRepository();
	public boolean isAddNewFacility(FacilityMasterModel fmodel) {
		return frepo.isAddNewFacility(fmodel);
	}
	public boolean isAddBulkData() {
		return frepo.isAddBulkData();
	}
	public int getFid(String fname) {
		return frepo.getFid(fname);
	}

}
