import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jasmine-graber/Documents/work/testing/automation/jars-and-drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchBox.sendKeys("tissues");

        WebElement enterButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        enterButton.click();

        WebElement firstItem = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[8]/div/div/div/div/div[2]/div[1]/h2/a/span"));
        firstItem.click();

        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        addToCartButton.click();
    }
}