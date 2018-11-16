package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LetterTextFrame extends MailMainPage {

    WebDriver webDriver = getWebDriver();

    private SelenideElement letterReceiver = $x("//textarea[@tabindex='4']");
    private SelenideElement letterTheme = $x("//div[@class='compose-head__field']/./input");

    private SelenideElement letterTextArea = $x("//table[@class='mceLayout']//iframe");
    private SelenideElement letterTextAreaInFrame = $x("//*[@id='tinymce']");

    private SelenideElement successSended = $x("//div[@class='message-sent__title']");
    private SelenideElement receiversAfterSending = $x("//span[contains(@class, 'message-sent__info')]");

    public void printAndSendLetter(String receiver, String theme, String letterText){
        letterReceiver.click();
        letterReceiver.sendKeys(receiver);
        letterTheme.sendKeys(theme);

        webDriver.switchTo().frame(letterTextArea);
        letterTextAreaInFrame.sendKeys(letterText);
        webDriver.switchTo().defaultContent();

        sendLetterButton.click();
        successSended.waitUntil(visible, 3000).shouldHave(text("отправлено"));
        receiversAfterSending.shouldHave(text(receiver));
    }

}