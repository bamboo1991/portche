package porscheProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import porschePage.PorschePage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestClass extends TestBase{
    @Test
    public void porscheAutomation() {
        PorschePage page=new PorschePage(driver);
        driver.get("https://www.porsche.com/usa/modelstart/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page.model718.click();
        String priceS = page.price.getText().substring(7, 15).replace(",", "");
        page.cayman.click();
        String mainWindow=driver.getWindowHandle();
        Set<String> set=driver.getWindowHandles();
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            String childWindow=iterator.next();
            if(!mainWindow.equals(childWindow)){
                driver.switchTo().window(childWindow);
            }
        }
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(page.myPorsche)).click();
        String basePriceS = page.basePrice.getText().substring(1).replace(",", "");
        String equipmentPriceS = page.equipmentPrice.getText().substring(1);
        String delivPriceS = page.deliveryPrice.getText().substring(1).replace(",", "");
        String totPriceS = page.totalPrice.getText().substring(1).replace(",", "");
        double basePriceD = Double.parseDouble(basePriceS);
        double equipmentPriceD = Double.parseDouble(equipmentPriceS);
        double deliveryPriceD = Double.parseDouble(delivPriceS);
        double totPriceD = Double.parseDouble(totPriceS);
        double sum = basePriceD + equipmentPriceD + deliveryPriceD;
        Assert.assertEquals(sum, totPriceD);
        page.colorMenu.click();
        page.arrowDown.click();
        page.miamiBlue.click();
        String miamiEquipS = page.miamiEquipPrice.getText().substring(1).replace(",", "");
        double miamiEquipD = Double.parseDouble(miamiEquipS);
        String miamiPriceS = page.miamiPrice.getText().substring(1).replace(",", "");
        double miamiPriceD = Double.parseDouble(miamiPriceS);
        Assert.assertEquals(miamiEquipD, miamiPriceD);
        String totPrice2S = page.totalPrice2.getText().substring(1).replace(",", "");
        double totPrice2D = Double.parseDouble(totPrice2S);
        double sum2 = basePriceD + deliveryPriceD + miamiPriceD;
        Assert.assertEquals(sum2, totPrice2D);
       // Thread.sleep(2000);
        JavascriptExecutor java=(JavascriptExecutor)driver;
        java.executeScript("window.scrollBy(0, 500)");
        page.wheelType.click();
        String wheelPriceS = page.wheelPrice.getText().substring(1).replace(",", "");
        double wheelPriceD = Double.parseDouble(wheelPriceS);
        double sum3 = wheelPriceD + miamiEquipD;
        String wheelEqS = page.wheelEquipPrice.getText().substring(1).replace(",", "");
        double wheelEqD = Double.parseDouble(wheelEqS);
        Assert.assertEquals(wheelEqD, sum3);
        double sum4=sum2+wheelPriceD;
        String totPrice3S = page.totalPrice3.getText().substring(1).replace(",", "");
        double totPrice3D = Double.parseDouble(totPrice3S);
        Assert.assertEquals(totPrice3D,sum4);
        //Thread.sleep(3000);
        java.executeScript("window.scrollBy(0,1400)");
        page.seatsType.click();
        String seatsPriceS=page.seatsPrice.getText().substring(1).replace(",","");
        double seatsPriceD=Double.parseDouble(seatsPriceS);
        double sum5=seatsPriceD+sum3;
        String seatsEqPriceS = page.seatsEquipPrice.getText().substring(1).replace(",", "");
        double seatsEqPriceD = Double.parseDouble(seatsEqPriceS);
        Assert.assertEquals(sum5, seatsEqPriceD );
        java.executeScript("window.scrollBy(0, 500)");
        page.performanceBtn.click();
        page.sevenSpeed.click();
        java.executeScript("window.scrollBy(0, 700)");
        page.ceramicType.click();
        String perfEqPriceS=page.performanceEquipPrice.getText().substring(1).replace(",","");
        double perfEqPriceD=Double.parseDouble(perfEqPriceS);
        String speedPriceS=page.sevenSpeedPrice.getText().substring(1).replace(",", "");
        double speedPriceD=Double.parseDouble(speedPriceS);
        String ceramicPriceS=page.ceramicPrice.getText().substring(1).replace(",", "");
        double ceramicPriceD=Double.parseDouble(ceramicPriceS);
        double sum6=sum5+speedPriceD+ceramicPriceD;
        Assert.assertEquals(perfEqPriceD, sum6);
        String totPrice4S=page.totalPrice4.getText().substring(1).replace(",","");
        double totPrice4D=Double.parseDouble(totPrice4S);
        double totalPrice6=sum6+basePriceD+deliveryPriceD;
        Assert.assertEquals(totalPrice6, totPrice4D);
        java.executeScript("window.scrollBy(0, 300)");
        page.carbonFiber.click();
        JavascriptExecutor java1=(JavascriptExecutor)driver;
        java1.executeScript("window.scrollBy(0, 300)");
        page.interiorCheck.click();
        String intEqPriceS=page.interiorEquipPrice.getText().substring(1).replace(",","");
        double intEqPriceD=Double.parseDouble(intEqPriceS);
        String interiorPriceS=page.interiorPrice.getText().substring(1).replace(",", "");
        double interiorPriceD=Double.parseDouble(interiorPriceS);
        double sum7=sum6+interiorPriceD;
        double totalPrice7=basePriceD+deliveryPriceD+intEqPriceD;
        String totPrice7S=page.totalPrice5.getText().substring(1).replace(",","");
        double totPrice7D=Double.parseDouble(totPrice7S);
        Assert.assertEquals(totalPrice7, totPrice7D);
        Assert.assertEquals(sum7, intEqPriceD);
    }
}
