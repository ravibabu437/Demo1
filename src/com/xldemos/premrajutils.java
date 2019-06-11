package com.xldemos;

import java.io.IOException;

public class premrajutils extends XlUtils {

	public static void main(String[] args) throws IOException {
		

		int rwc=premrajutils.getRowCount("C:\\utilspath\\Book11.xlsx", "demosheet");
		System.out.println(rwc);
		
		int clc=premrajutils.getColumnCount("C:\\utilspath\\Book11.xlsx", "demosheet", 2);
		System.out.println(clc);
		
		String str=premrajutils.getCellData("C:\\utilspath\\Book11.xlsx", "demosheet", 1, 3);
		System.out.println(str);
		
		premrajutils.setCellData("C:\\utilspath\\Book11.xlsx", "demosheet", 1, 3, "pass");
		
		premrajutils.fillGreenColor("C:\\utilspath\\Book11.xlsx", "demosheet", 1, 3);
		
		premrajutils.fillRedColor("C:\\utilspath\\Book11.xlsx", "demosheet", 2, 3);
		
		
		
	}

}
