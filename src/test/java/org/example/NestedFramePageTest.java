package org.example;

import org.example.base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramePageTest extends BaseTest {

    private NestedFramePage nestedFramePage;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();

        driver.get("http://the-internet.herokuapp.com/nested_frames");
        nestedFramePage = new NestedFramePage(driver, wait, actions);
    }

    @Test
    public void switchFrameTopLeft() {
        nestedFramePage.switchToFrameTopLeft();
        assertEquals(nestedFramePage.getText(), "LEFT");
    }

    @Test
    public void switchToMiddleFrame() {
        nestedFramePage.switchToFrameMiddle();
        assertEquals(nestedFramePage.getText(), "MIDDLE");
    }

    @Test
    public void switchToFrameRight() {
        nestedFramePage.switchToFrameRight();
        assertEquals(nestedFramePage.getText(), "RIGHT");
    }

    @Test
    public void switchToFrameBottom() {
        nestedFramePage.switchToFrameBottom();
        assertEquals(nestedFramePage.getText(), "BOTTOM");
    }
}
