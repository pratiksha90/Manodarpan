import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Manodarpan\\Resources\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.manodarpan.com/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		WebElement uName = driver.findElement(By.xpath("//*[@id='username']"));
		WebElement pswd = driver.findElement(By.xpath("//*[@id='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		uName.sendKeys("pratiksha11th@yopmail.com");
		pswd.sendKeys("Abc@12345678");
		//loginBtn.click();
		try {
			WebElement logoutBtn = driver.findElement(By.xpath(""));
													
			if(loginBtn.isDisplayed()){
				
			   System.out.println("Login Successful!");
			 }
			} 
			catch (Exception e) {
			     System.out.println("Incorrect login....");
			}
		loginBtn.click();
		//driver.quit();
		//driver.close();


	}

}
