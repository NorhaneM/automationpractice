package Steps_Definition;

import Pages.SubCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SC3_SubCategory {
    SubCategoryPage WomenCategories = new SubCategoryPage();
    private Actions actionProvider;

    @When("user hover to the Women category")
    public void select_Women_Category() {
        WomenCategories.select_Women_Category();
    }

    @And("user click on the Blouses subCategory")
    public void select_Blouses_SubCategory() throws InterruptedException {
        Thread.sleep(2000);
        WomenCategories.select_Blouses_SubCategory().click();
    }

    @Then("user go to the Blouses page")
    public void Blouses_SubCategory(){
        SoftAssert soft = new SoftAssert();
        soft.assertFalse(Hooks.driver.getCurrentUrl().contains("http://automationpractice.com/index.php?controller=my-account"));
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("http://automationpractice.com/index.php?id_category=7&controller=category"));
        soft.assertAll();

    }
}
