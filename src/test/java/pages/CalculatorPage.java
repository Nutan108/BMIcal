package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.xml.transform.Result;


public class CalculatorPage {
    public WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterage(String age) {
        driver.findElement(By.xpath("//input[@id='cage']")).clear();
        driver.findElement(By.xpath("//input[@id='cage']")).sendKeys(age);

    }

    public void entergender(String gender) {

        driver.findElement(By.xpath("//label[contains(text(),'" + gender + "')]")).click();

    }

    public void enterheight(String height) {
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys(height);
    }

    public void enterweight(String weight) {
        driver.findElement(By.xpath("//input[@id='ckg']")).clear();
        driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys(weight);

    }

    public void click() {
        driver.findElement(By.xpath("//input[@type='image']")).click();
    }

    public void getresult() {

        String r = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
    }

    public void result() {
        String actual_Result = Result.getText();
        System.out.println("Result: " + actual_Result);
        if (actual_Result.contains("18.5")) {
            Assert.assertEquals(actual_Result, "BMI = 18.5 kg/m2   (2%, Underweight)");
        } else if (actual_Result.contains("21.5")) {
            Assert.assertEquals(actual_Result, "BMI = 21.5 kg/m2   (Normal)");
        } else if (actual_Result.contains("21.2")) {
            Assert.assertEquals(actual_Result, "BMI = 21.2 kg/m2   (Normal)");
        } else {
            Assert.assertEquals(actual_Result, "BMI = 23.1 kg/m2   (Normal)");
        }
    }
}








