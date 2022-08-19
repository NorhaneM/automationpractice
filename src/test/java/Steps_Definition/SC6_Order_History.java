package Steps_Definition;

import Pages.Order_HistoryPage;
import Pages.Select_BlousePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SC6_Order_History {
    Order_HistoryPage orderHistory = new Order_HistoryPage();
    private Actions actionProvider;

    @Given("User click on the orders history and details button")
    public void ordersBtn() {
        orderHistory. ordersBtn().click();
    }

    @And("User navigate to orders history and details page")
    public void orders() throws InterruptedException {
        orderHistory. orders();
    }
    @Then("Order History is displayed")
    public void Displayed_Msg() throws InterruptedException {
        Thread.sleep(2000);
        String ExpectedResult = "Order history";
        String ActualResult = Hooks.driver.findElement(By.className("navigation_page")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        System.out.println("your recently order has been validated successfully");
    }
}
