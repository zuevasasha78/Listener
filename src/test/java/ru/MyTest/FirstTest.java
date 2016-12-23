package ru.MyTest;

import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by NB981SPB on 05.12.2016.
 */
@Listeners(MyTestListener.class)
public class FirstTest {
    @Test
    public void testMethod1(ITestContext context){

        String response = "ответ1";
        String request = "запрос1";


        context.setAttribute("response", response);
        assertThat(request, equalTo("запрос1"));
    }
}
