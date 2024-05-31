package org.hotel.repository;

import org.hotel.config.DBHelper;
import org.hotel.model.CustomerMasterModel;

public class CustomerMasterRepository extends DBHelper{
	int val;
	public boolean isAddNewCustomer(CustomerMasterModel custmodel) {
		try {
			pstmt=conn.prepareStatement("insert into customermaster values('0',?,?,?)");
			pstmt.setString(1, custmodel.getCustname());
			pstmt.setString(2, custmodel.getCustcontact());
			pstmt.setString(3, custmodel.getCustemail());
			val=pstmt.executeUpdate();
			if(val>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			System.out.println("the error is "+e);
			return false;
		}
	}
	public int getCustId(String custname) {
		try {
			pstmt=conn.prepareStatement("select custid from customermaster where custname=?");
			pstmt.setString(1, custname);
			res=pstmt.executeQuery();
			while(res.next()) {
				return res.getInt(1);
			}
		}
		catch(Exception e) {
			System.out.println("The error is "+e);
		}
		return 0;
	}
	public boolean ViewCustomer() {
		try {
			pstmt=conn.prepareStatement("select * from customermaster");
			res=pstmt.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
			}
			return true;
		}
		catch(Exception e) {
			System.out.println("The error is "+e);
			return false;
		}
	}
	public boolean DeleteCustByName(String dname) {
		try {
			pstmt=conn.prepareStatement("delete from customermaster where custname=?");
			pstmt.setString(1, dname);
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
	public boolean UpdateNameByEmail(String uname, String newname) {
		try {
			pstmt=conn.prepareStatement("update customermaster set custname=? where custemail=?");
			pstmt.setString(1, newname);
			pstmt.setString(2, uname);
			val=pstmt.executeUpdate();
			if(val>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			System.out.println("The error is "+e);
			return false;
		}
	}
	public boolean UpdateContactByName(String uname, String newcontact) {
		try {
			pstmt=conn.prepareStatement("Update customermaster set custcontact=? where custname=?");
			pstmt.setString(1, newcontact);
			pstmt.setString(2, uname);
			val=pstmt.executeUpdate();
			if(val>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			System.out.println("The error is "+e);
			return false;
		}
	}
	public boolean UpdateEmailByName(String uname, String newemail) {
	    try
	    {
	    	pstmt=conn.prepareStatement("Update customermaster set custemail=? where custname=?");
	    	pstmt.setString(1, newemail);
	    	pstmt.setString(2,uname);
	    	val=pstmt.executeUpdate();
	    	if(val>0) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error is"+e);
	    	return false;
	    }
	}

}
