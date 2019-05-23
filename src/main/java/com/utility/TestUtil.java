package com.utility;

import java.util.ArrayList;

public class TestUtil {
	

		static Xls_Reader xl;
		
		
		public static ArrayList<Object[]> getDataFromExcel(){

				ArrayList<Object[]> myData = new ArrayList<Object[]>();
				
				try {
				 xl = new Xls_Reader(
							"C:\\Users\\welcome\\eclipse-workspace\\DataDrivenFrameWorks\\src\\main\\java\\com\\testdata\\TestDataRediff.xlsx");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				for (int rowNum = 2; rowNum <= xl.getRowCount("RegTestData"); rowNum++) {
					
						String fullname = xl.getCellData("RegTestData", "fullname", rowNum);
						String rediffid = xl.getCellData("RegTestData", "rediffid", rowNum);
						String password = xl.getCellData("RegTestData", "password", rowNum);
						String retypepassword = xl.getCellData("RegTestData", "retypepassword", rowNum);
						String emailaddress = xl.getCellData("RegTestData", "emailaddress", rowNum);
						String mobilenumber = xl.getCellData("RegTestData", "mobilenumber", rowNum);
						
						Object ob[] = {fullname, rediffid, password, retypepassword, emailaddress, mobilenumber};
						myData.add(ob);
						
				}
				return myData;
			
		}
		
		
		
		

	}
