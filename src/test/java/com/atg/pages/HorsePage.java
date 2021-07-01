package com.atg.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.atg.base.WebBase;



public class HorsePage extends WebBase {

  List <WebElement> mList;
  public HorsePage() {
    PageFactory.initElements(mDriver, this);
    mList=new ArrayList();
   
  }
  
  @FindBy(css = "a[testid='header-verticallink-horse'] span font font")
  WebElement mHorse;
  //css-o7kgn3-Typography-styles--headline2
  
  @FindBy(css = "a[data-test-id='highlight-content-next'] header div div")
  WebElement mV4;
  
  @FindBy(css = "button[data-test-id='new-coupon']")
  WebElement mNewCoupon;
  
  @FindBy(id = "onetrust-accept-btn-handler")
  WebElement mAcceptCookies;
  
  @FindBy(css = ".small-dialog")
  WebElement mDialogbox;
  
  @FindBy(css = ".small-dialog button")
  WebElement mTomCoupon;
  
  
  
  
  
  public void accetpCookies() {
    
    Assert.assertTrue(mAcceptCookies.isDisplayed());
    mAcceptCookies.click();
    
    
  }
  
  public void clickV4() {
    Assert.assertTrue(mV4.isDisplayed());
    mV4.click();
  }
  
  
  public void clickNewCoupon() {
    Assert.assertTrue(mNewCoupon.isDisplayed());
    mNewCoupon.click();
    
    Assert.assertTrue(mDialogbox.isDisplayed());
    Assert.assertTrue(mTomCoupon.isDisplayed());
    mTomCoupon.click();
  }
  
  public void selectHorseCategory() {
   
    Map<Integer,Object> map=new HashMap<Integer,Object>();
    map.put(1, 4);
    map.put(2, 1);
    map.put(3, 2);
    map.put(4, "ALL");
    
    for(Map.Entry<Integer, Object> data:map.entrySet()) {
      
      if(!data.getValue().toString().equalsIgnoreCase("All")) {
        mDriver.findElement(By.cssSelector("div[data-test-id='coupon-race-"+data.getKey()+"'] div div span button[data-test-id='coupon-button-leg-"+data.getKey()+"-start-"+data.getValue()+"']")).click();
      }else
        
        mDriver.findElement(By.cssSelector("div[data-test-id='coupon-race-"+data.getKey()+"'] button[data-test-id='leg-"+data.getKey()+"-toggle-all']")).click();
        
     
      
    }
    
   
  
  
    
  }
  
  
  
}
