package TestNG_Tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersTestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started - " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method - " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method- " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method- " + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestonTestFailedButWithinSuccessPercentage Method - " + result.getName());

	}

//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("ON START METHOD- ");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("ON FINISH METHOD- ");

	}

	/*
	 * ITestListener **** IReporter ISuiteListener IInvokedMethod IHookable
	 * IConfigurationListener IConfigurableListener IAnnotationTransformer
	 * IExecution IMethodInterceptor
	 * 
	 */

}
