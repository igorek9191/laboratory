package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private SelenideElement loginInput = $x("//*[@id='mailbox:login']");
    private SelenideElement passwordInput = $x("//*[@id='mailbox:password']");
    private SelenideElement enterButton = $x("//*[@id='mailbox:submit']");

    public MailMainPage loginToMailMainPage(String login, String pass){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(pass);
        enterButton.click();
        return new MailMainPage();
    }
}
