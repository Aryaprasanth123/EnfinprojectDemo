package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extend_Report {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("DemoBlaze");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("organization", "Enfin");
		extentReports.setSystemInfo("Name", "Arya");
		return extentReports;

	}
}
