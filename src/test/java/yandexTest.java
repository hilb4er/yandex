import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class yandexTest extends DriverSettings {

    @Test
    public void project() {

        driver.get("http://yandex.ru"); // переходим на страницу
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс")); // проверяем туда ли мы перешли

        driver.findElementById("text").sendKeys("погода"); // Ищем поле поиска,
        // вводим "погода"
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // задержка для загрузки

        List <WebElement>  suggestions = driver.findElements(By.cssSelector("b")); // ищем элементы списка

        System.out.print(suggestions.get(0).getText()); // выводим первый элемент из списка,
        // т.к. у нас первая строка
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// задержка для загрузки
        WebElement ssl = driver.findElement(By.className("suggest2-item__fact")); //Находим фактические показатели погоды
        System.out.println(" "+ssl.getText()); // выводим их на экран

       }

    }


