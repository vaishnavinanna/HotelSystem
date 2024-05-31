package org.hotel.client;
import java.util.*;

import org.hotel.model.*;
import org.hotel.service.*;

public class HotelRecommendationClient {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			
			CityMasterModel cmodel=new CityMasterModel();
			AreaMasterModel amodel=new AreaMasterModel();
			FacilityMasterModel fmodel = new FacilityMasterModel();
			HotelMasterModel hmodel=new HotelMasterModel();
			CustomerMasterModel custmodel=new CustomerMasterModel();
			ReviewMasterModel rmodel=new ReviewMasterModel();
			
			CityMasterService cms=new CityMasterService();
			AreaMasterService ams=new AreaMasterService();
			FacilityMasterService fms = new FacilityMasterService();
			HotelMasterService hms=new HotelMasterService();
			CustomerMasterService custms=new CustomerMasterService();
			ReviewMasterService rms=new ReviewMasterService();
			
			do {
				boolean b;
				System.out.println("\n1.Add New City");
				System.out.println("2.Add New Area");
				System.out.println("3.Add Facilities");
				System.out.println("4.Hotel Section");
				System.out.println("5.Customer Section");
				System.out.println("6.Book Hotels By Customer");
				System.out.println("7.Add review");
				System.out.println("Enter a choice");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					int ch;
					int c;
					do {
						System.out.println("\n1.Add Single city in Database");
						System.out.println("2.Add Bulk Cities ");
						System.out.println("3.Exit");
						System.out.println("Enter Your choice");
						ch=sc.nextInt();
						switch(ch) {
						case 1:
							System.out.println("Enter cityname");
							sc.nextLine();
							String cityname=sc.nextLine();
							cmodel.setCityname(cityname);
							b=cms.isAddNewCity(cmodel);
							if(b) {
								System.out.println("City Added Successfully ");
							}
							else {
								System.out.println("Error while addding city in database");
							}
							break;
						case 2:
							b=cms.isAddBulkData();
							if(b) {
								System.out.println("Bulk Data Added sucessfully");
							}
							else {
								System.out.println("Error");
							}
							break;
						}
					}while(ch<3);
					break;
				case 2:
					boolean a;
					System.out.println("Eneter a city to add area");
					sc.nextLine();
					String cityname=sc.nextLine();
					int cityid=cms.getCityId(cityname);
					if(cityid !=-1) {
						do {
							System.out.println("Enter Area Name");
							String areaName=sc.nextLine();
							amodel.setAreaname(areaName);
							amodel.setCityid(cityid);
							b=ams.isAddNewArea(amodel);
							if(b) {
								System.out.println("Area Added Successfully");
							}
							else {
								System.out.println("Area Not added");
							}
							System.out.println("Want to add more areas");
							String ans=sc.nextLine();
							a=ans.equals("yes");
							}while(a);
					}
					else {
						System.out.println("City is not present");
						System.out.println("Want to add city in database");
						String msg=sc.nextLine();
						if(msg.equals("yes")) {
							cmodel.setCityname(cityname);
							b=cms.isAddNewCity(cmodel);
							if(b) {
								System.out.println("City Added Successfully ");
							}
							else {
								System.out.println("Error while addding city in database");
							}
						}
					}
					break;
				case 3:
					int ch1;
					do
					{
						System.out.println("\n1.Add single facility in databases");
						System.out.println("2.Add Bulk facilities.");
						System.out.println("3.to exit");
						System.out.println("Enter choice:");
						ch1=sc.nextInt();
						switch(ch1)
						{
						case 1:
							System.out.println("Enter facility");
							sc.nextLine();
							String fname=sc.nextLine();
							fmodel.setFname(fname);

							b=fms.isAddNewFacility(fmodel);
							if(b) {
								System.out.println("Facitlity Added Successfully ");
							}
							else {
								System.out.println("Error while addding facitlity in database");
							}
							break;
						case 2:
							b=fms.isAddBulkData();
							if(b) {
								System.out.println("Bulk Data Added sucessfully");
							}
							else {
								System.out.println("Error");
							}
							break;
						}
					}while(ch1<3);
					break;
				case 4:
					do {
						System.out.println("\n1.Add Hotel");
						System.out.println("2.View Hotel");
						System.out.println("3.Delete Hotel");
						System.out.println("4.Update Hotel");
						System.out.println("5.Exit");
						c=sc.nextInt();
						switch(c) {
						case 1:
							System.out.println("Enter in which area you want to add hotel");
							sc.nextLine();
							String areaname=sc.nextLine();
							int areaid=ams.getAreaId(areaname);
							if(areaid!=-1) {
								System.out.println("Enter Hotel Name");
								String hname=sc.nextLine();
								System.out.println("Enter Hotel Address");
								String address=sc.nextLine();
								System.out.println("Enter Contact No");
								String contact=sc.nextLine();
								System.out.println("Enter Hotel email address");
								String email=sc.nextLine();
								System.out.println("Enter hotel facilities");
								String fname=sc.nextLine();
								fmodel.setFname(fname);
								b=fms.isAddNewFacility(fmodel);
								if(b) {
									System.out.println("Facility added sucessfully");
								}
								else {
									System.out.println("Facility not added");
								}
								int fid=fms.getFid(fname);
								hmodel.setHname(hname);
								hmodel.setAddress(address);
								hmodel.setContact(contact);
								hmodel.setEmail(email);
								hmodel.setAreaid(areaid);
								hmodel.setFid(fid);
								b=hms.isAddNewHotel(hmodel);
								if(b) {
									System.out.println("Hotel Added Successfully in area");
								}
								else {
									System.out.println("Error while adding hotel");
								}
							}
							else {
								System.out.println("Area is not present do you want to add");
								String msg=sc.nextLine();
								if(msg.equals("yes")) {
									System.out.println("In which city the area is ");
									cityname=sc.nextLine();
									cmodel.setCityname(cityname);
									b=cms.isAddNewCity(cmodel);
									if(b) {
										System.out.println("City added");
									}
									else {
										System.out.println("city not added");
									}
									cityid=cms.getCityId(cityname);
									amodel.setAreaname(areaname);
									amodel.setCityid(cityid);
									b=ams.isAddNewArea(amodel);
									if(b) {
										System.out.println("Area Added Successfully in city");
									}
									else {
										System.out.println("Error while addding Area in database");
									}
								}
								else {
									System.out.println("Thank You");
								}
							}
							break;
						case 2:
							b=hms.ViewHotel();
							if(b) {
								System.out.println("Hotel data Fetched Successfully");
							}
							else {
								System.out.println("Error while Fetching Data");
							}
							break;
						case 3:
							break;
						case 4:
							break;
						}
					}while(c<5);
					break;
				case 5:
					sc.nextLine();
					do {
						System.out.println("\n1.Add Customer");
						System.out.println("2.View Customer");
						System.out.println("3.Delete Customer");
						System.out.println("4.Update Customer");
						System.out.println("5.Exit");
						ch=sc.nextInt();
						switch(ch) {
						case 1:
							boolean s;
							do {
								System.out.println("Enter customer name");
								String custname=sc.nextLine();
								System.out.println("Enter customer contact");
								String custcontact = sc.nextLine();
								System.out.println("Enter customer email");
								String custemail = sc.nextLine();
								custmodel.setCustname(custname);
								custmodel.setCustcontact(custcontact);
								custmodel.setCustemail(custemail);
								
							    b=custms.isAddNewCustomer(custmodel);
							    if(b) {
									System.out.println("Customer Added Successfully ");
								}
								else {
									System.out.println("Error while addding customer in database");
								}
							    System.out.println("Want to add one more customer");
							    String ans=sc.nextLine();
							    s=ans.equals("yes");
							}while(s);
							System.out.println("Ok Thank you");
							break;
						case 2:
							b=custms.ViewCustomer();
							if(b) {
								System.out.println("Customer Details fetched successfully");
							}
							else {
								System.out.println("Error while fetching customer detail");
							}
							break;
						case 3:
							System.out.println("Enter the name of customer which you want to delete");
							sc.nextLine();
							String dname=sc.nextLine();
							b=custms.DeleteCustByName(dname);
							if(b) {
								System.out.println("Customer deleted successfully");
							}
							else {
								System.out.println("customer not deleted");
							}
							break;
						case 4:
							do {
								System.out.println("\n1.Update Name");
								System.out.println("2.Update Contact");
								System.out.println("3.Update Email");
								System.out.println("4.Exit");
								System.out.println("Enter your choice");
								c=sc.nextInt();
								switch(c) {
								case 1:
									System.out.println("Enter email of an customer to update a name");
									sc.nextLine();
									String uname=sc.nextLine();
									System.out.println("Enter new name");
									String newname=sc.nextLine();
									b=custms.UpdateNameByEmail(uname,newname);
									if(b) {
										System.out.println("Name updated successfully");
									}
									else {
										System.out.println("Name Not Updated");
									}
									break;
								case 2:
									sc.nextLine();
									System.out.println("Enter name of an customer to update contact");
									uname=sc.nextLine();
									System.out.println("Enter new Contact Number");
									String newcontact=sc.nextLine();
									b=custms.UpdateContactByName(uname,newcontact);
									if(b) {
										System.out.println("Contact Updated successfully");
									}
									else {
										System.out.println("Contact Not Updated");
									}
									break;
								case 3:
									sc.nextLine();
									System.out.println("Enter name of customer to update email");
									uname=sc.nextLine();
									System.out.println("Enter new email");
									String newemail=sc.nextLine();
									b=custms.UpdateEmailByName(uname,newemail);
									if(b)
									{
										System.out.println("email updtaed succesfully");
									}
									else
									{
										System.out.println("email not updated");
									}
									break;
								}
							}while(c<4);
							break;
						}
					}while(ch<5);
					break;
				case 6:
					
					break;
				case 7:
					sc.nextLine();
					System.out.println("Enter name of the customer");
					String custname=sc.nextLine();
					int custid=custms.getCustId(custname);
					rmodel.setCustid(custid);
					System.out.println("Enter name of hotel");
					String hname=sc.nextLine();
					int hid=hms.getHid(hname);
					rmodel.setHid(hid);
					System.out.println("Enter text review");
					String rtext=sc.nextLine();
					rmodel.setRtext(rtext);
					System.out.println("Enter rating");
					int rating=sc.nextInt();
					rmodel.setRating(rating);
					b=rms.isAddNewReview(rmodel);
					if(b) {
						System.out.println("Review Added");
					}
					else {
						System.out.println("Error while adding review");
					}
					break;
				}
			}while(true);
	}
}
