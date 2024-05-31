package org.hotel.repository;

import java.sql.SQLException;

import org.hotel.config.DBHelper;
import org.hotel.config.PathHelper;
import org.hotel.model.CityMasterModel;
import java.io.*;

public class CityMasterRepository extends DBHelper {
	int val;

	public boolean isAddNewCity(CityMasterModel cmodel) {
		try {
			pstmt = conn.prepareStatement("insert into citymaster values('0',?)");
			pstmt.setString(1, cmodel.getCityname());
			val = pstmt.executeUpdate();
			if (val > 0) {
				return true;
			}
			return false;

		} catch (SQLException e) {
			System.out.println("Error while adding city is " + e);
			return false;
		}
	}

	public boolean isAddBulkData() {
		try {
			FileReader fr = new FileReader(PathHelper.path + "References\\CityMaster.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] str = line.split(",");
				pstmt = conn.prepareStatement("insert into citymaster values('0',?)");
				pstmt.setString(1, str[1]);
				val = pstmt.executeUpdate();
			}
			if (val > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Error while adding bulk data is " + e);
			return false;
		}
	}

	public int getCityId(String cityname) {
		try {
			pstmt = conn.prepareStatement("select cityid from citymaster where cityname=?");
			pstmt.setString(1, cityname);
			res = pstmt.executeQuery();
			while (res.next()) {
				return res.getInt(1);
			}
			return -1;
		} catch (SQLException e) {
			System.out.println("Error is " + e);
			return -1;
		}
	}
}
