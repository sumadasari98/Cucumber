package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import utilities.utility;

public class signin {
	WebDriver driver=null;
	//WebDriver driver = utility.driver ;
	@Given("^User opens the link$")
	public void user_opens_the_link() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");	
		 driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://elearningm1.upskills.in/");		   
	}

	@When("^User click on Sign Up link$")
	public void user_click_on_Sign_Up_link() {
		driver.findElement(By.partialLinkText( "Sign up!")).click();
	    
	}

	@Then("^Registration Page should display$")
	public void registration_Page_should_display() {
	    
	}
	
	@Given("^User enter firstname \"([^\"]*)\"$")
	public void user_enter_firstname(String FirstName) {
		
			driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys(FirstName);
	   		
	   
	}

	@Given("^User enter lastname \"([^\"]*)\"$")
	public void user_enter_lastname(String LastName) {
			
	   	    driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys(LastName);	   		   	

	    
	}

	@Given("^User enter emailid \"([^\"]*)\"$")
	public void user_enter_emailid(String email) {
	
	driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys(email);	   		 

	    
	}

	@Given("^User enter username \"([^\"]*)\"$")
	public void user_enter_username(String username) {
			
	   		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);	   	    	   	

	   
	}

	@Given("^User enter password \"([^\"]*)\"$")
	public void user_enter_password(String pwd) {
				
	       		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys(pwd);   	

	}

	@Given("^User enter confirm password \"([^\"]*)\"$")
	public void user_enter_confirm_password(String confirmpwd)  {
		
	    driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys(confirmpwd);
	        
	}

	@Given("^User clicks on Register button$")
	public void user_clicks_on_Register_button()  {
			
			driver.findElement(By.xpath("//button[@id='registration_submit']")).click();
	}

	@Given("^User click on Inbox link$")
	public void user_click_on_Inbox_link()  {
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//em[@class='fa fa-envelope']")).click();
	    
	}

	@Given("^User click on Compose message icon$")
	public void user_click_on_Compose_message_icon() throws InterruptedException {
			
			driver.findElement(By.xpath("//a/img[@title='Compose message']")).click();
			Thread.sleep(3000);
	    	   
	}

	@Given("^User enters Send to email \"([^\"]*)\"$")
	public void user_enters_Send_to_email(String SendTo) throws InterruptedException  {
		
	   driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(SendTo);
		//driver.findElement(By.xpath("//span/[@class='select2-selection select2-selection--multiple']")).sendKeys(SendTo);
		Thread.sleep(5000); 
		//driver.findElement(By.xpath("//span/[@class='select2-selection__choice']")).click();
		//driver.findElement(By.xpath("//span/ul/li[contains (text(), '"+SendTo+"')]")).click();
		driver.findElement(By.xpath("//span/ul/li[@class='select2-results__option select2-results__option--highlighted']")).click();
	}

	@Given("^user enters Subject \"([^\"]*)\"$")
	public void user_enters_Subject(String Subject)  {
			driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys(Subject); 	   		
		
	}

	@Given("^user enters Message to be sent \"([^\"]*)\"$")
	public void user_enters_Message_to_be_sent(String Message){
			driver.findElement(By.xpath("//label[contains(text(),'Message')]//following::iframe[1]")).sendKeys(Message);

	}

	@Given("^User clicks on Send message button$")
	public void user_clicks_on_Send_message_button() {
		driver.findElement(By.xpath("//button[@id='compose_message_compose']")).click();    
	}


		
}