package com.test.scripts;


import org.testng.annotations.Test;

import com.test.common.CommonTestFunctions;

public class GoogleSearchTest extends CommonTestFunctions{
	
	
	
  @Test
  public void googletest() throws InterruptedException 
  {
	String keyToSearch = "wedding";
	//Navigate to Google
	googlepage.openApplication();
	
	//Enter Wedding Keyword
	googlepage.enterTextInSearchBox(keyToSearch);
	
	//Select all options in list and assert that all option contain search keyword
	googlepage.verifyAutoSuggestions(keyToSearch);
  }


}