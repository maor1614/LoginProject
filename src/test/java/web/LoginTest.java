package web;

import base.HomePage;
import base.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("your_username");
        loginPage.enterPassword("your_password");
        loginPage.clickLoginButton();

        HomePage homePage = new HomePage(driver);
        String pageTitle = homePage.getPageTitle();
        System.out.println("Home Page Title: " + pageTitle);

        driver.quit();
    }
}

