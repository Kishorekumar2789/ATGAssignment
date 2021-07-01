package com.atg.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atg.base.WebBase;
import com.atg.pages.HorsePage;


public class HorsePageTest extends WebBase {
  private HorsePage horsePage;
  public HorsePageTest() {
    super();
   
  }

  @BeforeMethod
  public void setUp() {
    initialize();
    horsePage=new HorsePage();
  }
  
  @Test(priority = 1)
  public void horseTest() {
    horsePage.clickV4();
    horsePage.clickNewCoupon();
    horsePage.selectHorseCategory();
  }
  
  @AfterMethod
  public void teardown() {
    mDriver.quit();
  }
}



 

 

  