package test;

import org.testng.Assert;
import pages.*;
import util.FunctionalTestBase;

public class Test extends FunctionalTestBase {

    @org.testng.annotations.Test
    public void test() {
        final String searchAddress = "https://boka.techbuddy.io/";

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        AllResultsPage allResultsPage = googleHomePage.searchLink(searchAddress);
        Assert.assertTrue(allResultsPage.isElementPresent(AllResultsPage.bokaLinkXpath));

        BokaPage bokaPage = allResultsPage.jumpToBoka();
        Assert.assertTrue(bokaPage.isElementPresent(BokaPage.startBookingXpath));

        LoginPage loginPage = bokaPage.startLoging();
        Assert.assertTrue(loginPage.isElementPresent(LoginPage.bokaPageConfirmXpath));

        loginPage.inputNumber();
        Assert.assertTrue(loginPage.isElementPresent(LoginPage.phoneNumberXpath));

        PhoneNumberConPage phoneNumberConPage = loginPage.navigateToConfirmPage();
        Assert.assertTrue(loginPage.isElementPresent(LoginPage.submitButtonXpath));
        phoneNumberConPage.inputCode();
        Assert.assertTrue(phoneNumberConPage.isElementPresent(PhoneNumberConPage.submitButtonXpath));

        BookingPage bookingPage = phoneNumberConPage.submit();
        Assert.assertTrue(bookingPage.isElementPresent(BookingPage.categoryFormXpath));
        bookingPage.selectCategory();


    }

}
