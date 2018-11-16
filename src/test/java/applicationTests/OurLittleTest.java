package applicationTests;

import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class OurLittleTest extends Base{

    @Test
    public void test(){
        MainPage mainPage = open("https://mail.ru/", MainPage.class);
        mainPage.loginToMailMainPage("vlasyuk911", "gazon123")
                .pressWriteLetter()
                .printAndSendLetter("igorek9191@mail.ru", "123", "123");
    }
}