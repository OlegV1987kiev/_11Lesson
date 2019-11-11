import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class tes {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "F:\\34\\Fox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/");

        WebElement bannercss1 = driver.findElement(By.cssSelector(".banner"));
        WebElement bannerxpath1 = driver.findElement(By.xpath("./html/body/div/div[1]/header/div[1]"));
        WebElement imgcss2 = driver.findElement(By.cssSelector(".banner > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"));
        WebElement imgxpath2 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[1]/div/div/a/img"));
        WebElement css3 = driver.findElement(By.cssSelector(".shop-phone"));
        WebElement path3 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/span"));
        WebElement css4 = driver.findElement(By.cssSelector(".shop-phone > strong:nth-child(2)"));
        WebElement path4 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/span/strong"));
        WebElement css5 = driver.findElement(By.cssSelector("#contact-link > a:nth-child(1)"));
        WebElement path5 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
        WebElement css6 = driver.findElement(By.cssSelector(".login"));
        WebElement path6 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        WebElement css7 = driver.findElement(By.cssSelector(".logo"));
        WebElement path7 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[1]/a/img"));
        WebElement css8 = driver.findElement(By.cssSelector("#search_query_top"));
        WebElement path8 = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        WebElement css9 = driver.findElement(By.cssSelector("button.btn:nth-child(5)"));
        WebElement path9 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
        WebElement css10 = driver.findElement(By.cssSelector(".shopping_cart > a:nth-child(1)"));
        WebElement path10 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a"));
        WebElement css11 = driver.findElement(By.cssSelector(".sf-menu > li:nth-child(1) > a:nth-child(1)"));
        WebElement path11 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
        WebElement css12 = driver.findElement(By.cssSelector(".sf-menu > li:nth-child(2) > a:nth-child(1)"));
        WebElement path12 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
        WebElement css13 = driver.findElement(By.cssSelector(".sf-menu > li:nth-child(3) > a:nth-child(1)"));
        WebElement path13 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));

        WebElement css14 = driver.findElement(By.cssSelector(".icon-home"));
        WebElement path14 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a/i"));
        WebElement css15 = driver.findElement(By.cssSelector(".navigation_page"));
        WebElement path15 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/span[2]"));
        WebElement css16 = driver.findElement(By.cssSelector(".page-heading"));
        WebElement path16 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
        WebElement css17 = driver.findElement(By.cssSelector("#create-account_form > h3:nth-child(1)"));
        WebElement path17 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/h3"));
        WebElement css18 = driver.findElement(By.cssSelector("#create-account_form > div:nth-child(2) > p:nth-child(1)"));
        WebElement path18 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/p"));
        WebElement css19 = driver.findElement(By.cssSelector("div.form-group:nth-child(3) > label:nth-child(1)"));
        WebElement path19 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/label"));
        WebElement css20 = driver.findElement(By.cssSelector("#email_create"));
        WebElement path20 = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        WebElement css21 = driver.findElement(By.cssSelector("#SubmitCreate"));
        WebElement path21 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span"));
        WebElement css22 = driver.findElement(By.cssSelector("#login_form > h3:nth-child(1)"));
        WebElement path22 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/h3"));
        WebElement css23 = driver.findElement(By.cssSelector("#login_form > div:nth-child(2) > div:nth-child(1) > label:nth-child(1)"));
        WebElement path23 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/label"));
        WebElement css24 = driver.findElement(By.cssSelector("#email"));
        WebElement path24 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement css25 = driver.findElement(By.cssSelector("div.form-group:nth-child(2) > label:nth-child(1)"));
        WebElement path25 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/label"));
        WebElement css26 = driver.findElement(By.cssSelector("#passwd"));
        WebElement path26 = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        WebElement css27 = driver.findElement(By.cssSelector(".lost_password > a:nth-child(1)"));
        WebElement path27 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[1]/a"));
        WebElement css28 = driver.findElement(By.cssSelector("#SubmitLogin > span:nth-child(1)"));
        WebElement path28 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));





//        WebElement elementcss1 = driver.findElement(By.cssSelector("#search_query_top"));
//        elementcss1.sendKeys("test");
//        WebElement elementcss2 = driver.findElement(By.cssSelector("div.mover-target:nth-child(7)"));
//        elementcss2.click();
//        WebElement elementxpath1 = driver.findElement(By.cssSelector("div.mover-target:nth-child(7)"));


    }
}
