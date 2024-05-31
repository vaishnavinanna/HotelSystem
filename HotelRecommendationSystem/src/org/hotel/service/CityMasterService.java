package org.hotel.service;

import org.hotel.model.CityMasterModel;
import org.hotel.repository.CityMasterRepository;

public class CityMasterService {
	
	CityMasterRepository cityRepo=new CityMasterRepository();
	
	public boolean isAddNewCity(CityMasterModel cmodel) {
		return cityRepo.isAddNewCity(cmodel);
	}
	public boolean isAddBulkData() {
		return cityRepo.isAddBulkData();
	}
	public int getCityId(String cityname) {
		return cityRepo.getCityId(cityname);
	}

}