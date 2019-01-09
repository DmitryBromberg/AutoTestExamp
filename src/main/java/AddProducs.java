import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddProducs {

    private By cartProduct = By.xpath("//li[@data-product-id='8142']");
    private By btnAddToBasketFromCatalog = By.xpath("//li[@data-product-id='8142']//button[@class='catalog__buy btn btn_red btn_block']");
    private By btnAddToBasketFromCart = By.xpath("//button[@class='product__buy-btn btn btn_red btn_block']");
    private By btnAddToBasketFromPopup = By.xpath("//*[@id=\"popup-fast-view\"]//button[@class='catalog__buy btn btn_red btn_block']");
    private By iconSmallBsket = By.xpath("//div[@id='small-basket']/a[@href='/basket/']");
    private By productInTheBasket = By.xpath("//div[@class='cart-block__merchant']//div[@class='cart-block__group']");
    private By quickLook = By.xpath("//li[@data-product-id='8142']//button[@class='catalog__fast-view btn btn_sm btn_lc']");

    public SelenideElement addToBasketFromPlt(){

        //Selenide.executeJavaScript("javascript:window.scrollBy(200,350)",  btnAddToBasketFromPlt);
        $(btnAddToBasketFromCatalog).click();
        $(iconSmallBsket).click();
        return $(productInTheBasket);
    }

    public SelenideElement addToBasketFromCart(){
        $(cartProduct).click();
        $(btnAddToBasketFromCart).click();
        return $(productInTheBasket);
    }
    //public SelenideElement addToBasketFromFastView(){
      //  $(quickLook).click();
       // $(btnAddToBasketFromPopup).click();

   // }
}
