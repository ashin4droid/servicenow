package com.wipro.automation.snow.pages;

import org.openqa.selenium.By;

public class HomePageTest
{
	public static final By allAppsTab		= By.id("allApps_tab");
	public static final By favouritesTab	= By.id("favorites_tab");
	public static final By historyTab		= By.id("history_tab");
	public static AllApps allApps;
	
	
	public static class Favourites
	{
		public static By incidentsLink	= By.xpath("//div[@id='gsft_nav']/div/magellan-favorites-list/div[2]/div/div/a[child::div/span[text()='Incidents']]");
		public static By incidentsHeader = By.xpath("//h1[text()='Incidents']");
	}
	
	
}

class AllApps
{
	public static final By homePageLink	= By.xpath("//a[child::div/div[text()='Homepage']]");
	//public static final By incMapArea	= By.xpath("//map/area[@shape='rect'][2]");
	public static final By incMapArea		= By.xpath("//map/area[@shape='rect'][contains(@data-original-title,'empty')]");
	public static final By incidentsHeader = By.xpath("//h1[text()='Incidents']");
	
	
	
	public static class SelfService
	{
		public static final By myWork	= By.xpath("//div[@id='gsft_nav']/div/concourse-application-tree/ul/li/a[child::span[text()='Self-Service']]/following-sibling::ul/li//a[child::div/div[text()='My Work']]");
		//public static By incidentsHeader = By.xpath("//h1[text()='Incidents']");
	}
	
}