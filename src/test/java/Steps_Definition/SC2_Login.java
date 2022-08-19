package Steps_Definition;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SC2_Login {
    LoginPage login = new LoginPage();


    @Given("user navigate to URL home page")
    public void navigate_home() {
        String url = "http://automationpractice.com/index.php";
        Hooks.driver.navigate().to(url);
    }

    @And("user click on signIn Link")
    public void Sign_In_link() {

        login.Sign_In_link().click();
    }

    @When("user enter his email")
    public void Personal_email() {
        login.Personal_email().sendKeys("eng_norhane2@yahoo.com");

    }

    @And("user enter his password")
    public void LoginPassword() {
        login.Login_Password().sendKeys("P@ssw0rd");
    }
    @Then("user clicks on sign in button")
    public void SignIn() {
        login.Sign_In().click();}

@Then("user logged in successfully")
public void LoggedIn() throws InterruptedException {
    Thread.sleep(2000);
    Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("http://automationpractice.com/index.php?controller=my-account"));
}
}