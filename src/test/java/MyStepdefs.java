import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.CalculatorPage;


public class MyStepdefs {
    WebDriver driver;
    CalculatorPage p;

    @Given("I am in BMI calculator page")
    public void iAmInBMICalculatorPage() {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shivanjali\\Desktop\\sc.exe");
        driver = new ChromeDriver();
        driver.get("https://www.calculator.net/bmi-calculator.html");
        driver.manage().window().maximize();
        p = new CalculatorPage(driver);
    }

    @When("i enter  age {string}in BMI cal page")
    public void iEnterAgeInBMICalPage(String age) {

        p.enterage(age);

    }

    @And("i enter  gender {string} in BMI cal page")
    public void iEnterGenderInBMICalPage(String gender) {
        p.entergender(gender);
    }
    @When("i enter weight {string} in BMI page")
    public void i_enter_weight_in_bmi_page(String weight) {
        p.enterheight(weight);
    }

        @When("i enter height  {string} in BMI page")
    public void i_enter_height_in_bmi_page(String height)  {
        p.enterheight(height);
    }
    @Then("i press cal button")
    public void iPressCalButton() {
        p.click();
    }

    @When("i chk result {string}")
    public void i_chk_result(String R) {
        p.getresult();
       p.result();
    }

    @And("Close the browser")
    public void closeTheBrowser() {
        driver.close();
    }



}







