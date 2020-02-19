package porschePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PorschePage {

public PorschePage(WebDriver driver){
    PageFactory.initElements(driver, this);
}

    @FindBy (xpath = "//img[@alt='Porsche - 718']")
    public WebElement model718;

    @FindBy (xpath = "//div[@id='m982120']//nobr[.='Cayman']//parent::div[@class='m-14-model-name']//following-sibling::div[@class='m-14-model-price']")
    public WebElement price;

    @FindBy(xpath = "//div[@id='m982120']//nobr")
    public WebElement cayman;

    @FindBy(xpath = "//a[@id='navigation_main_x_mainsuboffer_x_myPorsche']")
    public WebElement myPorsche;

    @FindBy(xpath = "//div[.='Base Price 718 Cayman']//following-sibling::div[@class='pBox']/div")
    public WebElement basePrice;

    @FindBy(xpath = "//div[.='Price for Equipment']//following-sibling::div[@class='pBox']/div")
    public WebElement equipmentPrice;

    @FindBy(xpath = "//div[.='Delivery, Processing and Handling Fee']//following-sibling::div[@class='pBox']/div")
    public WebElement deliveryPrice;

    @FindBy(xpath = "//div[.='Total Price*']//following-sibling::div[@class='pBox']/div")
    public WebElement totalPrice;

    @FindBy(xpath = "//a[.='1. Exterior Colors & Wheels']")
    public WebElement colorMenu;

    @FindBy(xpath = "//div[@class='row']//div[@class='cca-label']/span")
    public WebElement arrowDown;

    @FindBy(xpath = "//li[@id='s_exterieur_x_FJ5']")
    public WebElement miamiBlue;

    @FindBy(xpath = "//div[@class='row']//div[.='$2,580']")
    public WebElement miamiEquipPrice;

    @FindBy(xpath = "//div[.='Miami Blue']//following-sibling::div[@class='tt_price tt_cell']")
    public WebElement miamiPrice;

    @FindBy(xpath = "//div[.='Total Price:*']//following-sibling::div")
    public WebElement totalPrice2;

    @FindBy(xpath = "(//span[@class='img-element'])[14]")
    public WebElement wheelType;

    @FindBy(xpath = "//div[.='20\" Carrera Sport Wheels']//following-sibling::div[@class='tt_price tt_cell']")
    public WebElement wheelPrice;

    @FindBy(xpath = "//div[@class='row']//div[.='$6,140']")
    public WebElement wheelEquipPrice;

    @FindBy(xpath = "//div[.='Total Price:*']//following-sibling::div")
    public WebElement totalPrice3;

    @FindBy(id = "s_interieur_x_PP06")
    public WebElement seatsType;

    @FindBy(xpath = "//div[.='Power Sport Seats (14-way) with Memory Package']//following-sibling::div[@class='pBox']/child::div")
    public WebElement seatsPrice;

    @FindBy(xpath = "//div[@class='row']//div[.='$8,470']")
    public WebElement seatsEquipPrice;

    @FindBy(xpath = "//div[@id='IMG_subHdl']")
    public WebElement performanceBtn;

    @FindBy(id = "vs_table_IMG_x_M250_x_c11_M250")
    public WebElement sevenSpeed;

    @FindBy(id = "vs_table_IMG_x_M450_x_c81_M450")
    public WebElement ceramicType;

    @FindBy(xpath = "//div[@class='row']//div[.='$19,090']")
    public WebElement performanceEquipPrice;

    @FindBy(xpath = "//div[@class='pBox']/div[.='$3,210']")
    public WebElement sevenSpeedPrice;

    @FindBy(xpath = "//div[@class='pBox']/div[.='$7,410']")
    public WebElement ceramicPrice;

    @FindBy(xpath = "//div[.='$77,940']")
    public WebElement totalPrice4;

    @FindBy(xpath = "//section[@id='s_individual']//div[.='Interior Carbon Fiber']")
    public WebElement carbonFiber;

    @FindBy(xpath = "//span[@id='vs_table_IIC_x_PEKH_x_c01_PEKH']")
    public WebElement interiorCheck;

    @FindBy (xpath = "//div[@class='row']//div[.='$20,630']")
    public WebElement interiorEquipPrice;

    @FindBy(xpath = "//span[@id='vs_table_IIC_x_PEKH_x_c01_PEKH']//following-sibling::div//div[@class='pBox']/div[.='$1,540']")
    public WebElement interiorPrice;

    @FindBy(xpath = "//div[.='$79,480']")
    public WebElement totalPrice5;



}
