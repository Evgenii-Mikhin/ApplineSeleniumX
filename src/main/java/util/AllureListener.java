package util;
import org.junit.runner.notification.Failure;
import steps.BaseSteps;
import javax.xml.transform.Result;
import io.qameta.allure.junit4.AllureJunit4;
public class AllureListener extends AllureJunit4 {

    @Override
    public void testFailure(Failure failure) throws Exception {
        BaseSteps.takeScreenshot();
        super.testFailure(failure);
    }
/*
    public void result(Result result) {
        if (result.getStatus().equals("failed")) {
            takeScreenshot();
        }
        super.result(result);
    } */

}