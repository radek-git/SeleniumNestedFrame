package org.example;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFramePage extends BasePage {

    private final String FRAMESET_XPATH = "//frameset[@frameborder='1']";
    private final String FRAME_XPATH = "//frame[@name='frame-top']";

    public NestedFramePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    public void switchToFrameTop() {
//        getDriver().switchTo().frame(getDriver().findElement(By.xpath(FRAME_XPATH)));
        getDriver().switchTo().frame("frame-top");
    }

    public void switchToFrameTopLeft() {
        switchToFrameTop();
        getDriver().switchTo().frame("frame-left");
    }

    public String getText() {
        return getDriver().findElement(By.xpath("//body")).getText();
    }

    public void switchToFrameMiddle() {
        switchToFrameTop();
        getDriver().switchTo().frame("frame-middle");
    }


    public void switchToFrameRight() {
        switchToFrameTop();
        getDriver().switchTo().frame("frame-right");
    }

    public void switchToFrameBottom() {
        getDriver().switchTo().frame("frame-bottom");
    }





}
