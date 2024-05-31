package org.hotel.service;

import org.hotel.model.ReviewMasterModel;
import org.hotel.repository.ReviewMasterRepository;

public class ReviewMasterService {

	ReviewMasterRepository rrepo=new ReviewMasterRepository();
	public boolean isAddNewReview(ReviewMasterModel rmodel) {
		return rrepo.isAddNewReview(rmodel);
	}

}
