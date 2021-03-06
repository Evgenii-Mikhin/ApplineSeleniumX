package util;

import gherkin.formatter.model.Result;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
import steps.BaseSteps;

public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {

    /*@Override
    public void testFailure(Failure failure) {
        BaseSteps.takeScreenshot();
        super.testFailure(failure);
    }
    */
    public void result(Result result) {
        if (result.getStatus().equals("failed")) {
            takeScreenshot();
        }
        super.result(result);
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) BaseSteps.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
/*
    public void result(Result result) {
        if (result.getStatus().equals("failed")) {
            takeScreenshot();
        }
        super.result(result);
    } */

