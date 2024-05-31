package org.hotel.config;
import java.io.*;

public class PathHelper {
//	public static void main(String args[]) {
		public static FileInputStream fin=null;
		public static File f=new File(".");
		public static String path=(f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-1));//C:\Users\Vaishu\HotelRecommendationSystem\HotelRecommendationSystem\.
		
		static {
			String newPath=path+"References\\db.properties";
			try {
				fin=new FileInputStream(newPath);
			} catch (FileNotFoundException e) {
				System.out.println("The error is "+e);
			}
		}
//	}
}
