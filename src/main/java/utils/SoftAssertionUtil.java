package utils;

import org.testng.asserts.SoftAssert;

public class SoftAssertionUtil {

//    private SoftAssert softAssert;
//    public SoftAssertionUtil() {
//        SoftAssert soft=new SoftAssert();
//    }
    private static SoftAssert softAssertInstance;

    private SoftAssertionUtil() {}

    public static SoftAssert getInstance() {
        if (softAssertInstance == null) {
            softAssertInstance = new SoftAssert();
        }
        return softAssertInstance;
    }

    public static void assertTrue(boolean condition, String message) {
      //  public void assertTrue(boolean condition, String message) {
        try {
           // softAssert().assertTrue(condition, message);
            getInstance().assertTrue(condition, message);
        } catch (AssertionError e) {
            getInstance().fail(message);
        }
    }

    public static void assertEquals(Object actual, Object expected, String message) {
        try {
            getInstance().assertEquals(actual, expected, message);
        } catch (AssertionError e) {
            getInstance().fail(message);
        }
    }


    public void assertNotEquals(Object actual, Object expected, String message) {
        try {
            getInstance().assertNotEquals(actual, expected, message);
        } catch (AssertionError e) {
            getInstance().fail(message);
        }
    }

    public void assertFalse(boolean condition, String message) {
        try {
            getInstance().assertFalse(condition, message);
        } catch (AssertionError e) {
            getInstance().fail(message);
        }
    }

    public static void assertAll() {
        getInstance().assertAll();
    }
}