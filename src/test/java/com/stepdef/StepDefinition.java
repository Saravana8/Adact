package com.stepdef;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {
		WebDriver driver;

		@Given("User on Home Page")
		public void user_on_Home_Page() throws IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sadhana\\eclipse-workspace\\selenium\\Adactin\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://adactin.com/HotelApp/");
			driver.manage().window().maximize();
			BaseClass.cpaturescreenshot(driver, "scrennshotname");

		}

		@When("User enters the credentials")
		public void user_enters_the_credentials() throws IOException {
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("BenzVivek");
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("tvivek@7592");

		}

		@Then("User click the Login Button")
		public void user_click_the_Login_Button() throws InterruptedException, IOException {

			WebElement login = driver.findElement(By.id("login"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriverWait w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.elementToBeClickable(login));
			FluentWait<WebDriver> wa = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
			w.until(ExpectedConditions.elementToBeClickable(login));

							BaseClass.cpaturescreenshot(driver, "2ndpage");
			driver.quit();

		}

	}

