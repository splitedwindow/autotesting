package task13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyTestListener implements ITestListener {
    protected final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        LOGGER.info(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }
}
