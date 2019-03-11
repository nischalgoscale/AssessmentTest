/*
 * @author Nischal
 */

package com.test.common;
import org.openqa.selenium.WebDriver;

public abstract class CommonPageFunctions {
	
	protected WebDriver driver;

//	protected String title;
//	protected static final int DEFAULT_WAIT_4_ELEMENT = 30;
//	protected static final int DEFAULT_WAIT_4_PAGE = 30;
//	protected static final int DEFAULT_WAIT_MAXTIME = 60;
//	protected static WebDriverWait ajaxWait;
//	protected long timeout = 30;
	/*
	 * @Inject
	 * 
	 * @Named("framework.implicitTimeout") protected long timeout;
	 */

	public CommonPageFunctions(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Click action performed and then wait
	 */

	

	
}