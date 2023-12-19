import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.*;

public class Selenide {
    @BeforeAll
    static void setUp() {
        // Настройка Selenide перед запуском тестов
        Configuration.browserSize = "1920x1200";
        // Включение задержки закрытия браузера
        Configuration.holdBrowserOpen = true;
    }
    @Test

    public void Search()
    {
        open("https://www.google.com/");
        $x("//textarea[@name='q']").setValue("Мальченко Павел Сергеевич").pressEnter();
        $x("//div[@id='res']").shouldBe(Condition.visible);
        sleep(3000);
    }
}
