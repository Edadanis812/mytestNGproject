package techproed.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day12_TestNGAnnotations {
    /*
    @Test: Creates test case.
    @BeforeMethod: runs before each @Test annotation
    @AfterMethod : runs after each @Test annotation
    @Ignore      : ignores or kips the test case.
    @Test(enabled = false): disables the test case. You cannot run that test case.

    @Test(priority=1):
        -TestNG runs in alphabetical order by default.
        -Use priority to order test cases.
        -"priority" is used to prioritize the test cases that are in the same class.

    (?)-Why do you need @BeforeMethod?
            *Preconditions: Crate driver, implicitlyWait,maximize window, used to avoid repetition
    (?)-Why do you need @AfterMethod?
            *Post condition: closing driver, reports generation, used to avoid repetition
    (?)-Why do you need @Test annotation?
            *To create test cases/scripts.
     */
    @BeforeMethod
    public void setUp(){
        System.out.println("This is before method");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("This is after method");
    }
    //Test can have parameter.
    //(enabled = false), we run it. This case will skip.
    @Test(enabled = false)
    public void test1(){
        System.out.println("This is test 1");
    }
    @Test(priority = 1)
    public void test4(){
        System.out.println("This is test 4");
    }
    @Test
    @Ignore
    public void test2(){
        System.out.println("This is test 2");
    }

    @Test
    public void test5(){
        System.out.println("This is test 5");
    }
    @Test(priority = 3)
    public void test3(){
        System.out.println("This is test 3");
    }



}
