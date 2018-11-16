package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MailMainPage {

    private SelenideElement writeLetterButton = $x("//span[text()='Написать письмо']/ancestor::a");
    SelenideElement sendLetterButton = $x("//span[text()='Отправить']/ancestor::div[1]");

    public LetterTextFrame pressWriteLetter(){
        LetterTextFrame letterTextFrame = new LetterTextFrame();
        writeLetterButton.click();
        return letterTextFrame;
    }

}