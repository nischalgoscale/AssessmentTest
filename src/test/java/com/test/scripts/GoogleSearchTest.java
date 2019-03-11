package com.test.scripts;


import org.testng.annotations.Test;

import com.test.common.CommonTestFunctions;

public class GoogleSearchTest extends CommonTestFunctions{
	
	
	
  @Test
  public void googletest() throws InterruptedException 
  {
	
	reportLog("Navigate to Google");
	googlepage.openApplication();
	
	reportLog("Enter Wedding Keyword");
	googlepage.enterTextInSearchBox("wedding");
	
	reportLog("Select all options in list and assert that all option contain search keyword");
	googlepage.findDataInSuggestionList("wedding");
  }


}