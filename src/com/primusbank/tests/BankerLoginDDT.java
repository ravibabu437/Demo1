package com.primusbank.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.primusbank.constants.PrimusBankConstants;
import com.primusbank.library.Bankerhomepage;
import com.primusbank.library.PrimusBankHomePage;
import com.utils.eUIUtils;
import com.xldemos.XlUtils;







public class BankerLoginDDT extends PrimusBankConstants

{
	@Test
	public void bankerLoginTest() throws IOException
	{
		String xlfile="C:\\premraj\\premraj1\\src\\com\\primusbank\\tests\\Book11.xlsx";
		String xlsheet="demosheet";		
		String brname,uid,pwd;
		int rc=XlUtils.getRowCount(xlfile, xlsheet);
		PrimusBankHomePage phome=new PrimusBankHomePage();
		Bankerhomepage bhome=new Bankerhomepage();
		for (int i = 1; i <=rc ; i++) 
		{
			brname=XlUtils.getCellData(xlfile, xlsheet, i, 0);
			uid=XlUtils.getCellData(xlfile, xlsheet, i, 1);
			pwd=XlUtils.getCellData(xlfile, xlsheet, i, 2);
			boolean res=phome.bankerlogin(brname, uid, pwd);
			if (res) 
			{
				XlUtils.setCellData(xlfile, xlsheet, i, 3, "Pass");	
				XlUtils.fillGreenColor(xlfile, xlsheet, i, 3);
			} else 
			{
				XlUtils.setCellData(xlfile, xlsheet, i, 3, "Fail");
				XlUtils.fillRedColor(xlfile, xlsheet, i, 3);
			}
			bhome.bankerlogout();
		}		
		
	}
	
	

}
