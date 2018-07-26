package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListner implements ITestListener {
	
	
	ExtentReports r;
	ExtentTest t;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		r.endTest(t);
		r.flush();
		
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		//System.out.println("TestNG Start");
		r = new ExtentReports("C:\\SelAdvDay2\\MyReport\\report.html");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		t.log(LogStatus.FAIL, arg0.getMethod().getMethodName()+" has failed");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
//		System.out.println("Test start");
		t = r.startTest(arg0.getMethod().getMethodName()+" has started");
//		t.log(LogStatus.INFO, arg0.getMethod().getMethodName()+" has started");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
//		System.out.println("Pass");
//		t.log(LogStatus.INFO, arg0.getMethod().getMethodName()+" has passed");
		t.log(LogStatus.PASS,arg0.getMethod().getMethodName()+ " has passed");
	}

}
