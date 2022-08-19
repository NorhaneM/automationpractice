package Steps_Definition;

import Pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SC5_Checkout {
    CheckoutPage checkout = new CheckoutPage();
    private Actions actionProvider;

    @Given("User click on proceed to checkout button")
    public void CheckoutBtn1() {
        checkout.CheckoutBtn1().click();
    }

    @And("User click on proceed to checkout button on the summary page")
    public void CheckoutBtn2() {
        checkout.CheckoutBtn2().click();
    }

    @And("User click on proceed to checkout button on the address page")
    public void CheckoutBtn3() {
        checkout.CheckoutBtn3().click();
    }

    @And("user agree to terms of service")
    public void CheckBox() {
        checkout.CheckBox().click();
    }




    @Then("User click on proceed to checkout button on the shipping page")
    public void CheckoutBtn4() {
        checkout.CheckoutBtn4().click();
    }

    @And("user select to pay by bank wire")
    public void Bank_Wire() {
        checkout.Bank_Wire().click();
    }

    @And("User confirm his order in the payment page")
    public void ConfirmBtn() throws InterruptedException {
        Thread.sleep(2000);
        checkout.ConfirmBtn().click();
    }

    @Then("Order Confirmation msg appear")
    public void success_msg1() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//p[contains(.,'Your order on My Store is complete.')]")).isDisplayed());
        System.out.println("your order has been confirmed successfully ");
    }
}

