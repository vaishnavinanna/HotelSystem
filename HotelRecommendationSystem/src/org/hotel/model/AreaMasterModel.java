package org.hotel.model;

public class AreaMasterModel extends CityMasterModel {
	
		int areaid;
		String areaname;
		
		public AreaMasterModel() {
			
		}
		public AreaMasterModel(int areaid, String areaname) {
			super();
			this.areaid = areaid;
			this.areaname = areaname;
		}
		
		
		public int getAreaid() {
			return areaid;
		}
		public void setAreaid(int areaid) {
			this.areaid = areaid;
		}
		public String getAreaname() {
			return areaname;
		}
		public void setAreaname(String areaname) {
			this.areaname = areaname;
		}


}
