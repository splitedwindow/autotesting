package task13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IExecutionListener;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyExecutionListener implements ISuiteListener, IExecutionListener, IInvokedMethodListener {
    protected final Logger LOGGER = LogManager.getLogger(this.getClass());

//    @Override
    public void onExecutionStart(ISuite suite) {
        IExecutionListener.super.onExecutionStart();
        LOGGER.info(suite.getName());
    }

    @Override
    public void onExecutionFinish() {
        IExecutionListener.super.onExecutionFinish();
        LOGGER.info("Execution finished");
    }
}

