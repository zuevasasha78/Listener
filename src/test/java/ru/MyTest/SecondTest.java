package ru.MyTest;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by NB981SPB on 23.12.2016.
 */
@Listeners(MyTestListener.class)
public class SecondTest {
    @Test
    public void testMethod2(ITestContext context){
        String response = "ответ2";
        String request = "запрос2";

        context.setAttribute("response", response);
        assertThat(request, equalTo("запрос"));
    }

    @Test
    public void testMethod3(ITestContext context){
        String response = "ответ3";
        String request = "запрос3";

        context.setAttribute("response", response);
        assertThat(request, equalTo("запрос"));
    }
}
