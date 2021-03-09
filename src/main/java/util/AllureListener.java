package util;
import steps.BaseSteps;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestIdentifier;

public class AllureListener extends AllureJunit5 {

    @Override
    public void executionFinished(final TestIdentifier testIdentifier, final TestExecutionResult testExecutionResult) {
        BaseSteps.takeScreenshot();
        super.executionFinished(testIdentifier, testExecutionResult);
    }
/*
    public void result(Result result) {
        if (result.getStatus().equals("failed")) {
            takeScreenshot();
        }
        super.result(result);
    } */

}