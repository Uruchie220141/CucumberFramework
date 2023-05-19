package com.GCMS.testbase;

import com.GCMS.pages.DashBoardPageElement;
import com.GCMS.pages.FindCase;
import com.GCMS.pages.LoginPage;
import com.GCMS.pages.UpdateProfileElements;
import com.GCMS.pages.VeriDashboardPages;
import com.GCMS.pages.VeriLoginPage;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;

	public static void Initialize() {

		loginPage = new LoginPage();
		
	}
}
