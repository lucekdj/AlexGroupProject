package exercises;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Books extends DriverUtils{
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        booksOne();
        booksTwo();
        booksThree();
        booksFour();
        booksFive();
        booksSix();
        booksSeven();
        booksEight("lly");
    }

    public static void driverSetup(String browser, String URL) {
        DriverUtils.createDriver(browser);
        driver = DriverUtils.getDriver();
        driver.get(URL);
    }

    // TODO implement all methods
    public static void booksOne() throws InterruptedException {
        driverSetup("Chrome","https://demoqa.com/books" );
        WebElement tiltle = driver.findElement(By.xpath("//div[contains(text(),'Title')]"));
        tiltle.click();   // used to choose the element
        Thread.sleep(3000);
        tiltle.click();   // used to sort element in descending order
        Thread.sleep(3000);
        tiltle.click();   // used to sort element in ascending order
        driver.quit();


    }

    public static void booksTwo() throws InterruptedException {
        driverSetup("Chrome","https://demoqa.com/books" );
        WebElement publisher = driver.findElement(By.xpath("//div[contains(text(),'Publisher')]"));
        publisher.click();  // used to click on the element
        Thread.sleep(3000);
        publisher.click(); // used to sort the element
        Thread.sleep(3000);
        publisher.click();
        driver.quit();
    }

    public static void booksThree() {
        driverSetup("Chrome","https://demoqa.com/books" );
        //List<WebElement> author = driver.findElement(By.cssSelector(".rt-tr-group >div>div:nth-child(3)"));
        List<WebElement> author = driver.findElements(By.cssSelector(".rt-tr-group >div>div:nth-child(3)"));


        int count = 0;
        for (WebElement name: author) {
            if (name.getText().startsWith("A")) {
                count++;
            }
        }
        driver.quit();
    }



    public static void booksFour() {
        driverSetup("Chrome","https://demoqa.com/books" );
        WebElement book = driver.findElement(By.xpath("//div[@class='rt-tbody']/div[1]//span/a"));
        String titleActual = book.getText();
        System.out.println(titleActual);
        book.click();
        //WebDriverWait driveWait = new WebDriverWait (driver, Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#title-label")));

        WebElement book2 = driver.findElement(By.xpath("//div[@id='title-wrapper']/div[2]/label"));

        String titleExpected = book2.getText().trim();

        Assertions.assertEquals(titleActual, titleExpected);

        System.out.println(titleActual);
        System.out.println(titleExpected);

        driver.quit();




    }

    public static void booksFive() {
        // HINT: ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", 'ELEMENT');
        driverSetup("Chrome", "https://demoqa.com/books");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        List<WebElement> books = driver.findElements(By.cssSelector(".rt-tbody>div>div>div:nth-child(2) a"));
        WebElement ISBN;

        for(int i= 0; i < books.size(); i++){
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", books.get(i));
            books.get(i).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#title-label")));

            ISBN = driver.findElement(By.xpath("//div[@id='ISBN-wrapper']//label[@id='userName-value']"));
            Assertions.assertNotNull(ISBN.getText().trim());
            driver.navigate().back();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login")));
            books = driver.findElements(By.cssSelector(".rt-tbody>div>div>div:nth-child(2) a"));


        }
        driver.quit();
    }
    public static void booksSix() {
        driverSetup("Chrome", "https://demoqa.com/books");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        List<WebElement> books = driver.findElements(By.cssSelector(".rt-tbody>div>div>div:nth-child(2) a"));
        WebElement numberOfPages;

        int firstBookIndex = 0;
        int lastBookIndex = books.size()-1;
        ArrayList<String> pages = new ArrayList<>();

        for(int i= 0; i < books.size(); i++){
            if(i==firstBookIndex || i==lastBookIndex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", books.get(i));
                books.get(i).click();

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#title-label")));

                numberOfPages = driver.findElement(By.xpath("//div[@id='pages-wrapper']//label[@id='userName-value']"));

                pages.add(numberOfPages.getText());

                driver.navigate().back();

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login")));
                books = driver.findElements(By.cssSelector(".rt-tbody>div>div>div:nth-child(2) a"));
            }

        }
        if(Integer.valueOf(pages.get(0)) > Integer.valueOf(pages.get(1))){

            System.out.println(books.get(0).getText());
        }else{
            System.out.println(books.get(books.size()-1).getText());
        }
        driver.quit();
    }

    public static void booksSeven() {
        // HINT: you can find one element through another. Use '.' before xpath expression
        driverSetup("Chrome", "https://demoqa.com/books");
        List<WebElement> publisher = driver.findElements(By.cssSelector(".rt-tbody>div>div>div:nth-child(4)"));

        List<WebElement> author = driver.findElements(By.cssSelector(".rt-tbody>div>div>div:nth-child(3)"));
        for (int i = 0; i < publisher.size(); i++) {
            if(publisher.get(i).getText().equals("O'Reilly Media")) {
                continue;
            }else{
                System.out.println(author.get(i).getText().trim());
            }

        }
        driver.quit();
    }

    public static void booksEight(String searchQuery) throws InterruptedException {
        driverSetup("Chrome", "https://demoqa.com/books");
        WebElement searchField = driver.findElement(By.id("searchBox"));
        searchField.sendKeys(searchQuery);
        Thread.sleep(3000);

        List<WebElement> listOfBooks = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));

        ArrayList<String> book = new ArrayList<>();
        for (int i = 0; i < listOfBooks.size(); i++) {

            book.add(listOfBooks.get(i).getText().trim());
        }
        System.out.println(book);

        for (String value: book) {
            if(!value.isEmpty()){
                Assertions.assertTrue(value.contains(searchQuery), "Assertion failed");
            }


        }
        driver.quit();
    }
}
