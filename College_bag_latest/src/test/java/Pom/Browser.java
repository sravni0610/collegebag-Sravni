package Pom;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public WebDriver wd;
	public void Browsername(String name) {
		
		if (name.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            wd = new ChromeDriver();

	}
	 
    else if (name.equalsIgnoreCase("Firefox")){
        WebDriverManager.firefoxdriver().setup();
        wd = new FirefoxDriver();
    }
    else if (name.equalsIgnoreCase("Edge")){
        WebDriverManager.edgedriver().setup();
        wd = new EdgeDriver();
    }
	}
	 public void Validating_Titlepage(){

	    }
		
	}

