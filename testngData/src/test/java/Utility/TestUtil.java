package Utility;

import java.util.ArrayList;

import javax.sql.rowset.spi.XmlReader;

public class TestUtil {

	public static  ArrayList<Object[]> getDatafromExcel() {
		
		
		Xls_reader reader;
		
		ArrayList<Object[]> mydata= new ArrayList<Object[]>();
		
		try {
			reader= new Xls_Reader("/Users/iftakerahmed/eclipse-workspace/testngData/src/test/java/TestData/ruman.exel.xlsx");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for( int rowNum = 2; rowNum<= reader.getrowCount("Sheet1"); rowNum++) {
			String firstname=reader.getcell
			String lastname=		
			
		}
		return mydata;
	}
	
}
