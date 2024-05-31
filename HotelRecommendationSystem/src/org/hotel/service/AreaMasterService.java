package org.hotel.service;

import org.hotel.model.AreaMasterModel;
import org.hotel.repository.AreaMasterRepository;

public class AreaMasterService {
	AreaMasterRepository areaRepo=new AreaMasterRepository();
	public boolean isAddNewArea(AreaMasterModel amodel) {
		return areaRepo.isAddNewArea(amodel);
	}
	public int getAreaId(String areaname) {
		return areaRepo.getAreaId(areaname);
	}
}

