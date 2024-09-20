package task8;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import task2.FormattingStrings;

public class Task8Test {
    FormattingStrings formattingStrings;
    @BeforeTest
    public void init() {
        formattingStrings = new FormattingStrings();
    }


    @Test
    public void testFormat() {
        String name = "John";
        float salary = 9000;
        String expectedResult = "John's salary is 9000.0";
        String actualResult = formattingStrings.format(name, salary);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result!");
    }

    @Parameters({"name", "salary", "expectedResult"})
    @Test(dataProvider = "nameProvider")
    public void testDataProviderFormat(String name, float salary, String expectedResult) {
        String actualResult = formattingStrings.format(name, salary);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result!");
    }

    @Parameters({"name", "salary", "expectedResult"})
    @Test
    public void testParameterFormat(String name, float salary, String expectedResult) {
        String actualResult = formattingStrings.format(name, salary);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result!");
    }

    @DataProvider
    public Object[][] nameProvider() {
        return new Object[][] {
                {"John", 9000, "John's salary is 9000.0"},
                {"Kate", 9000, "John's salary is 9000"},
                {"J", 9000, "J's salary is 9000.0"},

        };
    }

    @Test
    public void testRaiseSalary() {
        String name = "John";
        float salary = 9000;
        float delta = 1000;
        String expectedResult = "John's salary is 10000.0";
        String actualResult = formattingStrings.raiseSalary(name, salary, delta);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result!");
    }

    @Test
    public void testFire() {
        String name = "John";
        String expectedResult = "John is fired";
        String actualResult = formattingStrings.fire(name);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result!");
    }

}

//1: Create 3 simple unit tests for Task_2 (modify your code to have 3 different methods in Task_2 solving if needed).
// 2. Create testng.xml which should execute your test class. Execute this file
//3. Add a Data provider for each test.
//4. Create a test with parameters loaded from testng.xml.