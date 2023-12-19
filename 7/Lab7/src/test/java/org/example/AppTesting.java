package org.example;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class AppTesting {
    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1200";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    public void ShopsButton() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/contacts/stores/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void DeliveryButton() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/help/payment/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void WarrantyButton() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/help/warranty/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void BusinessButton() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/for-business/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void CompanyButton() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/company/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void FindButton() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@id='nw2h__header__btns__search']").click();
        $x("//input[@name='q']").setValue("Iphone").pressEnter();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void SelectIphone() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/catalog/iphone/']").hover();
        sleep(1000);
        $x("//*[@href='/catalog/iphone/iphone_15/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void SelectMain() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/catalog/iphone/iphone_15_pro/apple_iphone_15_pro/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void TradeIn() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/trade-in-ustroystva/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void Basket() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/basket/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void AppleWatch() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/catalog/applewatch/']").scrollTo().click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void Ipad() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/catalog/ipad/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void Mac() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/catalog/mac/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void Airpods() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/catalog/airpods/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void Gadzhet() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/catalog/gadzhety/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void ScrollToChoose() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@href='/catalog/iphone/iphone_14_pro_iphone_14_pro_max/apple_iphone_14_pro_max_128_gb_zolotoy/']").scrollTo();
        sleep(1000);
        $x("//*[@id='bx_3966226736_5972_block']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void OpenText() {
        open("https://voronezh.rebro-store.ru/");
        sleep(1000);
        $x("//div[@class='nwhp__col nwhp__col-xs-12 nwhp__col-lg-6']").scrollTo();
        sleep(1000);
        $x("//*[@href='/blog/stati/tsvetnye-airpods/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void AddToBasket() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@id='bx_3966226736_5972_block']").scrollTo();
        $x("//*[@id='bx_3966226736_5972_block']").hover();
        sleep(1000);
        $x("//*[@id='bx_3966226736_5972_block_basket_actions']").click();
        $x("//*[@class='basket_fly loaded loading swiped']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void DeleteAfterBuy() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@id='bx_3966226736_5972_block']").scrollTo();
        $x("//*[@id='bx_3966226736_5972_block']").hover();
        sleep(1000);
        $x("//*[@id='bx_3966226736_5972_block_basket_actions']").click();
        $x("//*[@class='basket_fly loaded loading swiped']").shouldBe(Condition.visible);
        sleep(3000);
        $x("//*[@class='pull-left']").click();
        sleep(1000);
        $x("//*[@class='cart-empty']").shouldBe(Condition.visible);
    }
    @Test
    public void BuyAndAdd() {
        open("https://voronezh.rebro-store.ru/");
        $x("//*[@id='bx_3966226736_5972_block']").scrollTo();
        $x("//*[@id='bx_3966226736_5972_block']").hover();
        sleep(1000);
        $x("//*[@id='bx_3966226736_5972_block_basket_actions']").click();
        $x("//*[@href='/basket/']").click();
        $x("//*[@id='content']").shouldBe(Condition.visible);
        $x("//div[@class='swiper-slide swiper-slide-active']").scrollTo();
        $x("//*[@data-prod-id='6984']").click();
        sleep(1000);
        $x("//button[@data-entity='basket-checkout-button']").scrollTo();
        $x("//button[@data-entity='basket-checkout-button']").click();
        sleep(3000);
        $x("//*[@id='content']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @AfterEach
    void tearDown() {
        Configuration.holdBrowserOpen = false;
    }
}
