package org.hotel.repository;

import java.sql.SQLException;
import java.io.*;

import org.hotel.config.DBHelper;
import org.hotel.config.PathHelper;
import org.hotel.model.FacilityMasterModel;

public class FacilityMasterRepository extends DBHelper {

	int val;

	public boolean isAddNewFacility(FacilityMasterModel fmodel) {
		try {
			pstmt = conn.prepareStatement("insert into facilitymaster values('0',?)");
			pstmt.setString(1, fmodel.getFname());
			val = pstmt.executeUpdate();
			if (val > 0) {
				return true;
			}
			return false;

		} catch (SQLException e) {
			System.out.println("Error while adding facility is " + e);
			return false;
		}
	}

	public boolean isAddBulkData() {
		try {
			FileReader fr=new FileReader(PathHelper.path+"References\\FacilityMaster.csv");
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				String[] str=line.split(",");
				pstmt=conn.prepareStatement("insert into facilitymaster values('0',?)");
				pstmt.setString(1, str[1]);
				val=pstmt.executeUpdate();
			}
			if(val>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			System.out.println("Error while adding bulk data is "+e);
			return false;
		}
	}

	public int getFid(String fname) {
		try {
			pstmt=conn.prepareStatement("select fid from facilitymaster where fname=?");
			pstmt.setString(1, fname);
			res=pstmt.executeQuery();
			while(res.next()) {
//				System.out.println("The fid is "+res.getInt(1));
				return res.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}