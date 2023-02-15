package adaction.com.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
        public static  WebDriver driver;
        public static  void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver =  new ChromeDriver();
            
           }	
        public static void getUrl(String Url) {
			driver.get(Url);
		}
        public static void window_max() {
			try {
				driver.manage().window().maximize();
			} catch (Exception e) {
				System.out.println("Unable to maimize:"+e.getMessage());
			}
			
		}
        
        
        
        
        
        
        
        
}
