package Steps_Definition;

import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SC1_Registration {
    RegistrationPage register = new RegistrationPage();


    @Given("user navigate to home page")
    public void navigate_home() {
        String url = "http://automationpractice.com/index.php";
        Hooks.driver.navigate().to(url);
    }

    @And("user click on sign in Link")
    public void Sign_In_link() {

        register.Sign_In_link().click();
    }

    @When("user enter his email with valid email format")
    public void Personal_email() {
        register.Email().sendKeys("eng_norhane2@yahoo.com");

    }
    @And("user click on create account")
    public void CreateAccount() {
        register.CreateAccount().click();}

    @And("user fills his personal data with valid data")
    public void Personal_Data() {
        register.First_Name().sendKeys("Norhane");
        register.Last_Name().sendKeys("Mahrouss");
        register.Password().sendKeys("P@ssw0rd");

    }

    @And("user fills his address with valid data")
    public void Personal_Address() {
       //register.First_Name_Address().sendKeys("Norhane");
        //register.Last_Name_Address().sendKeys("Mahrouss");
        register.Company().sendKeys("VOIS");
        register.Address1().sendKeys("13 Atlantic City New Jersey USA");
        register.Address2().sendKeys("beside Flowery the flower shop");
        register.City().sendKeys("Atlantic City");
        register.choose_State().click();
        register.Postal_Code().sendKeys("11617");
        register.Country().sendKeys("USA");
        register.Home_Phone().sendKeys("023917087");
        register.Mobile_Phone().sendKeys("01069089890");
       // register.address_alias().sendKeys("My Address");

    }
    @Then("user click on register button")
    public void RegisterButton() {
        register.RegisterButton().click();}

    @And("success message is displayed")
    public void success_Message()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("http://automationpractice.com/index.php?controller=my-account"));
        soft.assertAll();

    }
}