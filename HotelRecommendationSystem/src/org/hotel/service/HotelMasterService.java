package org.hotel.service;

import org.hotel.model.HotelMasterModel;
import org.hotel.repository.HotelMasterRepository;

public class HotelMasterService {
	HotelMasterRepository hrepo=new HotelMasterRepository();
	public boolean isAddNewHotel(HotelMasterModel hmodel) {
		return hrepo.isAddNewHotel(hmodel);
	}
	public int getHid(String hname) {
		return hrepo.getHid(hname);
	}
	public boolean ViewHotel() {
		return hrepo.ViewHotel();
	}

}
