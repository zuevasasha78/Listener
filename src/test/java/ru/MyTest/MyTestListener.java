package ru.MyTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
  private AttachText attachText = new AttachText();

  @Override
  public void onTestStart(ITestResult result) {

  }

  @Override
  public void onTestSuccess(ITestResult result) {

  }

  @Override
  public void onTestFailure(ITestResult result) {

    String response = result.getTestContext().getAttribute("response").toString();

    System.out.println(response);
  }

  @Override
  public void onTestSkipped(ITestResult result) {

  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

  }

  @Override
  public void onStart(ITestContext context) {

  }

  @Override
  public void onFinish(ITestContext context) {

  }
}
