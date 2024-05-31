package org.hotel.repository;

import java.sql.SQLException;

import org.hotel.config.DBHelper;
import org.hotel.model.AreaMasterModel;

public class AreaMasterRepository extends DBHelper {

	public boolean isAddNewArea(AreaMasterModel amodel) {
		try {
			pstmt = conn.prepareStatement("insert into areamaster values('0',?,?)");
			pstmt.setString(1, amodel.getAreaname());
			pstmt.setInt(2, amodel.getCityid());
			int val = pstmt.executeUpdate();
			if (val > 0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			System.out.println("The error is " + e);
			return false;
		}
	}
	
	public int getAreaId(String areaname) {
		try {
			pstmt = conn.prepareStatement("select areaid from areamaster where areaname=?");
			pstmt.setString(1, areaname);
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
