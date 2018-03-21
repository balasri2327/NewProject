package com.test.TestNg;


import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNg extends TestBase  {
	TestPom page;
	@Test
	public void test0() {
		// TODO Auto-generated method stub
		page=new TestPom();
		scrollDown(driver, page.getImg());
	}
	@Test(description="This TestCase will perform Valid login")
	public void test1() throws IOException {
		// TODO Auto-generated method stub
		page=new TestPom();
		setText(page.getUserName(), "Balasri23");
		setText(page.getPassword(), "92LT36");
		btnClick(page.getBtnLogin());
		takeScreenShot(driver, "Valid user name and password ");

	}
	@Test(description="This is Will Perform ?Wrong User name and Correct Password")
	public void test4() throws IOException {
		// TODO Auto-generated method stub
		page=new TestPom();
		setText(page.getUserName(), "Bala");
		setText(page.getPassword(), "92LT36");
		btnClick(page.getBtnLogin());
		takeScreenShot(driver, "Wrong Username and correct password");

	}
	@Test(description="This is Will Perform ?User name and Password Empty")
	public void test5() throws IOException {
		// TODO Auto-generated method stub
		page=new TestPom();
		setText(page.getUserName(), " ");
		setText(page.getPassword(), " ");
		btnClick(page.getBtnLogin());
		takeScreenShot(driver, "emptyuserName and empty password");

	}
	@Test(description="This is Will Perform ?Wrong User name and Wrong Password Empty")
	public void test6() throws IOException {
		// TODO Auto-generated method stub
		page=new TestPom();
		setText(page.getUserName(), "Bala");
		setText(page.getPassword(), "Bala");
		btnClick(page.getBtnLogin());
		takeScreenShot(driver, "Wrong Username and Wrong password");

	}

	@BeforeMethod
    public void test2() {
		// TODO Auto-generated method stub
		getDriver("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=73934d64-c8fa-4088-87b7-01b30cadeed4&ie=UTF8");
		
	}
	@AfterMethod
	public void test3() {
		// TODO Auto-generated method stub
		//driver.quit();
	}
	@Test(description="This is Will Perform Search Hotel page ?All mandatory fields are filled suceesfully")
	public void test7() throws IOException {
		// TODO Auto-generated method stub
		page=new TestPom();
		setText(page.getUserName(), "Balasri23");
		setText(page.getPassword(), "92LT36");
		btnClick(page.getBtnLogin());
		setText(page.getLocation(), "Sydney");
		setText(page.getNumberOfRooms(), "1 - One");
		setText(page.getCheckInDate(), "13/03/2018");
		setText(page.getCheckOutDate(), "19/03/2018");
		setText(page.getAdultsPerRoom(), "1 - One");
		btnSubmit(page.getBtnSearch());
		takeScreenShot(driver, "All Fields Correctly Filled");

	}
	@Test(description="User miss some mandatory fields")
	public void test8() throws IOException {
		// TODO Auto-generated method stub
		page=new TestPom();
		setText(page.getUserName(), "Balasri23");
		setText(page.getPassword(), "92LT36");
		btnClick(page.getBtnLogin());
		setText(page.getLocation(), "- Select Location -");
		setText(page.getNumberOfRooms(), "1 - One");
		setText(page.getCheckInDate(), "13/03/2018");
		setText(page.getCheckOutDate(), "19/03/2018");
		setText(page.getAdultsPerRoom(), "1 - One");
		btnSubmit(page.getBtnSearch());
		takeScreenShot(driver, "User miss some mandatory fields");

	}
	
	@Test(description="All the fields empty and click search button")
	public void test9() throws IOException {
		// TODO Auto-generated method stub
		page=new TestPom();
		setText(page.getUserName(), "Balasri23");
		setText(page.getPassword(), "92LT36");
		btnClick(page.getBtnLogin());
		setText(page.getLocation(), "- Select Location -");
		setText(page.getNumberOfRooms(), "- Select Number of Rooms -");
		setText(page.getCheckInDate(), " ");
		setText(page.getCheckOutDate(), " ");
		setText(page.getAdultsPerRoom(), "- Select Adults per Room -");
		btnSubmit(page.getBtnSearch());
		takeScreenShot(driver, "mandatory fields are empty");

	}
	@Test(description="Click Reset button to reset the values in Search hotel page")
	public void test10() throws IOException {
		// TODO Auto-generated method stub
		page=new TestPom();
		setText(page.getUserName(), "Balasri23");
		setText(page.getPassword(), "92LT36");
		btnClick(page.getBtnLogin());
		setText(page.getLocation(), "- Select Location -");
		setText(page.getNumberOfRooms(), "- Select Number of Rooms -");
		setText(page.getCheckInDate(), " ");
		setText(page.getCheckOutDate(), " ");
		setText(page.getAdultsPerRoom(), "- Select Adults per Room -");
		btnSubmit(page.getBtnReset());
		takeScreenShot(driver, "Click Reset Button to clear or reset the values");

	}
	
	


	
}
