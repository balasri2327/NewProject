package com.test.TestNg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPom extends TestBase {

	public TestPom() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='login']")
	private WebElement btnLogin;
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement numberOfRooms;
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkInDate;
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOutDate;
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement AdultsPerRoom;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement btnSearch;
	@FindBy(xpath="//input[@id='Reset']")
	private WebElement btnReset;
	@FindBy(xpath="//img[@alt='Start selling on Amazon']")
	private WebElement img;
	
	public WebElement getImg() {
		return img;
	}
	public void setImg(WebElement img) {
		this.img = img;
	}
	public WebElement getBtnReset() {
		return btnReset;
	}
	public void setBtnReset(WebElement btnReset) {
		this.btnReset = btnReset;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(WebElement numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(WebElement checkInDate) {
		this.checkInDate = checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(WebElement checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}
	public void setAdultsPerRoom(WebElement adultsPerRoom) {
		AdultsPerRoom = adultsPerRoom;
	}
	public WebElement getLocation() {
		return location;
	}
	public void setLocation(WebElement location) {
		this.location = location;
	}
	public WebElement getUserName() {
		return userName;
	}
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
	
}
