package TPD;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageActions.AllMyContentMethods;
import pageActions.CertificateCreation;
import pageActions.Course_Consumption;
import pageActions.Course_Creation;
import pageActions.TPDMethods;
import pageActions.UploadContentMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
import utility.BaseClass;

public class VerifyUserAbleToSeeCourseInMyLearningSection extends BaseClass {

	@Test
	public void verifyUserAbleToSeeCourseInMyLearningSection() throws Exception {

		UserOnBoarding.SelectUserRole("Student");
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String contentName = excel.getContentName("PDF");

//			String contentName=UploadContentMethods.UploadPdf();
//			SendForReviewMethods.sendPdf_For_Review(contentName);
//			UserOnBoarding.logout();
//			UserOnBoarding.login("Reviewer");
//			UpForReviewMethods.up_For_Review(contentName);
//			UserOnBoarding.logout();
//			UserOnBoarding.login("Creator");

		String course = Course_Creation.UploadContentFromLibrary(contentName);
		UserOnBoarding.logout();
		UserOnBoarding.login("Reviewer");
		UploadContentMethods.publishCourseFromUpForReview(course);
		UserOnBoarding.logout();
		UserOnBoarding.login("Creator");
		TPDMethods.createBatch(course);
		UserOnBoarding.logout();

//			String course="Course_CUCcGt";
		UserOnBoarding.login("New User");
		TPDMethods.userEnrollsInCourse(course);
		AllMyContentMethods.CourseUnderMyLearningSection(course);

	}

}
