import org.openqa.selenium.JavascriptExecutor;


public class TestSteps extends BaseMethods {

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void mainPageC() {
        String mainPageUrl = getUrl();
        String mainPageUrlC = "https://www.gittigidiyor.com/";

        if (mainPageUrl.equals(mainPageUrlC)) {
            System.out.println("Anasayfaya giriş yaptınız.");
        } else {
            System.out.println("Anasayfaya giriş yapamadınız.");
        }

    }


    public void goToLogin() throws InterruptedException {
        clickToElement(WebElementsConstants.loginButton);
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.loginB);

    }


    public void login(){
        findElement(WebElementsConstants.userName).sendKeys("hasan.smz@hotmail.com");
        findElement(WebElementsConstants.password).sendKeys("abcd1234");
        clickToElement(WebElementsConstants.loginB2);
        String loginControl = findElement(WebElementsConstants.nickName).getText();
        String loginControlW = "hasansemiz580281";

        if (loginControl.equals(loginControlW)) {
            System.out.println("Hesabınıza giriş yaptınız.");
        } else {
            System.out.println("Hesabınıza giriş yapamadınız.");
        }

    }


    public void search(){
        findElement(WebElementsConstants.searchArea).sendKeys("Bilgisayar");
        clickToElement(WebElementsConstants.searchButton);

    }


    public void secondPage() {
        jse.executeScript("window.scrollBy(0,9000)");
        clickToElement(WebElementsConstants.secondPageButton);

        String secondPageUrl = "https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2";
        String secondPageC = getUrl();

        if(secondPageC.equals(secondPageUrl)){
            System.out.println("2. sayfadasınız.");
        }else{
            System.out.println("2. sayfada değilsiniz");
        }

    }


    public void addToBasket() throws InterruptedException {
        String price = findElement(WebElementsConstants.productPrice1).getText();
        clickToElement(WebElementsConstants.productDetailButton);

        jse.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.addToBasketButton);

        Thread.sleep(2000);
        goToUrl("https://www.gittigidiyor.com/sepetim");
        String priceC = findElement(WebElementsConstants.price2).getText();

        if (price.equals(priceC)) {
            System.out.println("Ürün fiyatları eşit."+ price);
        } else {
            System.out.println("Ürün fiyatlarınız eşit değildir.");
        }

    }


    public void addToProduct() throws InterruptedException {
        clickToElement(WebElementsConstants.addButton);
        Thread.sleep(2000);
        String amount = findElement(WebElementsConstants.totalAmount).getText();
        String amountC= "Ürün Toplamı (2 Adet)";


        if(amount.equals(amountC)){
            System.out.println("Sepetinizdeki " + amount);
        }else{
            System.out.println("Sepetinizdeki ürün adedi farklıdır");
        }

    }


    public void deleteProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.deleteButton);
        Thread.sleep(2000);
    }


    public void controlBasket() throws InterruptedException {
        String basket = "Sepetinizde ürün bulunmamaktadır.";
        String basketC = findElement(WebElementsConstants.basketControl).getText();
        Thread.sleep(2000);

        if (basket.equals(basketC)) {
            System.out.println("Sepetinizde ürün bulunmamaktadır.");
        } else {
            System.out.println("Sepetiniz boş değildir.");
        }

    }


    public void exit(){
       driver.quit();

    }


}
