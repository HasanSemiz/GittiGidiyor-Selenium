import org.openqa.selenium.By;

public class WebElementsConstants {
    public static By loginButton = By.xpath("//div[@class='gekhq4-4 hwMdSM']");
    public static By loginB = By.cssSelector("[data-cy='header-login-button']");
    public static By userName = By.id("L-UserNameField");
    public static By password = By.id("L-PasswordField");
    public static By loginB2 = By.id("gg-login-enter");
    public static By nickName = By.cssSelector("div[class='gekhq4-4 hwMdSM']>:nth-child(2)");
    public static By searchArea = By.xpath("//input[@type='text']");
    public static By searchButton = By.cssSelector(".qjixn8-0.sc-1bydi5r-0.hKfdXF");
    public static By secondPageButton = By.cssSelector("ul[class='clearfix'] [href='/arama/?k=Bilgisayar&sf=2']");
    public static By productPrice1= By.cssSelector("p[class='fiyat price-txt robotobold price']");
    public static By productDetailButton = By.cssSelector("[class='catalog-view clearfix products-container']>:nth-child(1)");
    public static By addToBasketButton = By.cssSelector("[id='purchaseSoldInfoActionButtons'] [id='add-to-basket']");
    public static By price2 = By.cssSelector("div[class='total-price']");
    public static By addButton = By.cssSelector("option[value='2']");
    public static By totalAmount = By.cssSelector("li[class='clearfix total-price-sticky-container']>:nth-child(1)");
    public static By deleteButton = By.cssSelector("a[title='Sil']");
    public static By basketControl = By.cssSelector("div[class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']>:nth-child(1)");

}
