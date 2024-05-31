package org.hotel.repository;

import org.hotel.config.DBHelper;
import org.hotel.model.ReviewMasterModel;

public class ReviewMasterRepository extends DBHelper {
	int val;
	public boolean isAddNewReview(ReviewMasterModel rmodel) {
		try {
			pstmt=conn.prepareStatement("insert into reviewmaster values('0',?,?,?,?)");
			pstmt.setInt(1, rmodel.getCustid());
			pstmt.setInt(2, rmodel.getHid());
			pstmt.setString(3, rmodel.getRtext());
			pstmt.setInt(4, rmodel.getRating());
			val=pstmt.executeUpdate();
			if(val>0) {
				return true;
			}
			return false;
		}
		catch(Exception e) {
			System.out.println("The error is "+e);
			return false;
		}
	}

}
