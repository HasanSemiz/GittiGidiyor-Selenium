import org.junit.Test;

public class TestCases extends TestSteps {


    @Test
    public void adToBasketTest() throws InterruptedException {
        mainPageC();
        goToLogin();
        login();
        search();
        secondPage();
        addToBasket();
        addToProduct();
        deleteProduct();
        controlBasket();
        exit();
    }
}
