import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeUtimateqa {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // 2) Open Url
        driver.get(baseUrl);

        //3) Print the title of the page
        System.out.println("Title of the page is " + driver.getTitle());

        //4) Print the current url
        System.out.println("Current Url is " + driver.getCurrentUrl());

        //5) Print the page source
        System.out.println("Page Source is " + driver.getPageSource());

        //6) Enter the email to email field

        WebElement usernamefield = driver.findElement(By.id("user[email]"));   //Found Email field
        usernamefield.sendKeys("Admin");          // writing email id to that field

        //7) Enter the password to password field

        WebElement passwordfield = driver.findElement(By.name("user[password]"));   //Found Password field
        passwordfield.sendKeys("a1b2c3d4");          // writing email id to that field

        //8) Close the browser

        //driver.quit();

    }

}
