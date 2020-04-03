package com.base;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static void cpaturescreenshot( WebDriver driver,String screenname) throws IOException  {
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+ "/Screenshot/"+System.currentTimeMillis();
		File desti=new File(path);
		FileUtils.copyFile(f, desti);
		
		
		
		
		
}

}
