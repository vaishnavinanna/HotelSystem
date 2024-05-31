package org.hotel.repository;

import java.sql.*;

import org.hotel.config.DBHelper;
import org.hotel.model.HotelMasterModel;

public class HotelMasterRepository extends DBHelper{
	int val;
	public boolean isAddNewHotel(HotelMasterModel hmodel) {
		try {
			pstmt=conn.prepareStatement("insert into hotelmaster values('0',?,?,?,?,?,?)");
			pstmt.setString(1, hmodel.getHname());
			pstmt.setString(2, hmodel.getAddress());
			pstmt.setString(3, hmodel.getContact());
			pstmt.setString(4, hmodel.getEmail());
			pstmt.setInt(5, hmodel.getAreaid());
			pstmt.setInt(6,hmodel.getFid());
			val=pstmt.executeUpdate();
			if(val>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("The error is "+e);
			return false;
		}
	}
	public int getHid(String hname) {
		try {
			pstmt=conn.prepareStatement("select hid from hotelmaster where hname=?");
			pstmt.setString(1, hname);
			res=pstmt.executeQuery();
			while(res.next()) {
				return res.getInt(1);
			}
			return 0;
		}
		catch(Exception e) {
			System.out.println("The error is "+e);
			return 0;
		}
	}
	public boolean ViewHotel() {
		try {
			pstmt=conn.prepareStatement("select * from hotelmaster");
			res=pstmt.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4)+"\t"+res.getString(5)+"\t"+res.getInt(6)+"\t"+res.getInt(7));
			}
			return true;
		}
		catch(Exception e) {
			System.out.println("the error is "+e);
			return false;
		}
	}

}
