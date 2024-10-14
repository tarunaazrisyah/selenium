import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQAFormFiller {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to the form page
        driver.get("https://demoqa.com/automation-practice-form");

        // Fill out the form
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Taruna");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("QA");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("tarunaQA@example.com");

        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        gender.click();

        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
        mobileNumber.sendKeys("1234567890");

        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.sendKeys("12-12-1990");

        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Maths");
        subjects.sendKeys("Science");

        WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        hobbies.click();

        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("123 Main St, Anytown, USA");

        Select state = new Select(driver.findElement(By.id("state")));
        state.selectByVisibleText("NCR");

        Select city = new Select(driver.findElement(By.id("city")));
        city.selectByVisibleText("Delhi");

        // Submit the form
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        // Close the browser
        driver.quit();
    }
}