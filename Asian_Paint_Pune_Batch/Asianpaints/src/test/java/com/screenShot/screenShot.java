package com.screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot {
	public static void screenShot(WebDriver driver, String filename) throws IOException
    {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);        
         FileUtils.copyFile(src, new File("./Screenshots/"+filename+".png"));

    }    
}
