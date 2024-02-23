package pageActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObject.CourseCreation;
import pageObject.LoginPage;
import pageObject.UpForReview;
import pageObject.UploadPdfContent;
import pageObject.ValidatePopUp;
import utility.BaseClass;
import utility.DikshaUtils;
import utility.Library;
import utility.Listeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class UploadContentMethods extends BaseClass {

public static String UploadPdf() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		String expect = "Creator should be able to upload PDF successfully";
		String actual = "Creator is unable to upload PDF ";
		String closeButton=null;
	 
	 try {
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
		Upload.getBrowserbutton().sendKeys(System.getProperty("user.dir")+"\\src\\main\\resources\\pdf_13.pdf");
	    Thread.sleep(5000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    closeButton=Upload.getClose().getText();
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	    
	    String randomName=DikshaUtils.set_Content_Name("PDF_Content");
	    excel.updateData("TestData","PDF" ,randomName, "");
	   
	    actual="Creator is able to upload PDF successfully";
		return randomName;
		
	 } finally {
		 String Text = closeButton != null ? closeButton : "N/A";
			Listeners.customAssert(closeButton, Text, expect, actual);
	}
	}
	
	
		public static String UploadMp4() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		String expect = "Creator should be able to upload Mp4 content successfully";
		String actual = "Creator is unable to upload Mp4 content ";
		String closeButton=null;
	 
	 try {
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\poem.mp4", "Mp4 uploaded");
	    Thread.sleep(3000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    closeButton=Upload.getClose().getText();
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	  
	    String randomName=DikshaUtils.set_Content_Name("Mp4_Content");
	    excel.updateData("TestData","Mp4" ,randomName, "");
	   
	   
	    actual="Creator is able to upload Mp4 content successfully";
		return randomName;
		
	 } finally {
		 String Text = closeButton != null ? closeButton : "N/A";
			Listeners.customAssert(closeButton, Text, expect, actual);
	}
	}
	
		public static String UploadMorethan50MbContent() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			
			String expect = "Creator should be able to upload more than 50mb content successfully";
			String actual = "Creator is unable to upload more than 50mb content ";
			String closeButton=null;
		 
		 try {
			DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
			DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick(Upload.getUploadMoreThan50Mbcontent());
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
			DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
			
			
		Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\Class 1 English  (Marigold Book) _ Syllabus Overview.mp4", "Mp4 uploaded");
		
			 Thread.sleep(40000);
		    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
		    closeButton=Upload.getClose().getText();
		    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
		    
		    String randomName=DikshaUtils.set_Content_Name("Mp4_Content");
		    excel.updateData("TestData","Mp4" ,randomName, "");
		  
		    actual="Creator is able to upload more than 50mb content successfully";
			return randomName;
			
		 } finally {
			 String Text = closeButton != null ? closeButton : "N/A";
				Listeners.customAssert("Close", Text, expect, actual);	
		}
		}
		
		
		
	public static String UploadWebm() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		String expect = "Creator should be able to upload webm content successfully";
		String actual = "Creator is unable to upload webm content ";
		String closeButton=null;
	 
	 try {
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\file_example_WEBM_480_900KB (1).webm", "Webm uploaded");
	    Thread.sleep(3000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    closeButton=Upload.getClose().getText();
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	    
	    String randomName=DikshaUtils.set_Content_Name("Webm_Content");
	    excel.updateData("TestData","Webm" ,randomName, "");

	    actual="Creator is able to upload webm content successfully";
		return randomName;
		
	 } finally {
		 String Text = closeButton != null ? closeButton : "N/A";
			Listeners.customAssert(closeButton, Text, expect, actual);
	}
	}
	
	
public static String UploadEpub() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		String expect = "Creator should be able to upload epub content successfully";
		String actual = "Creator is unable to upload epub content ";
		String closeButton=null;
	 
	 try {
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitForElementToBeVisible(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitForElementToBeVisible(Upload.geteTextbook());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\A-Room-with-a-View-morrison (1).epub", "Epub uploaded");
	    Thread.sleep(5000);
	    DikshaUtils.waitForElementToBeVisible(Upload.getSave());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    closeButton=Upload.getClose().getText();
	    DikshaUtils.waitForElementToBeVisible(Upload.getClose());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
	    
	    String randomName=DikshaUtils.set_Content_Name("Epub_Content");
	    excel.updateData("TestData","Epub" ,randomName, "");
	   
	    actual="Creator is able to upload epub content";
		return randomName;
		
	 } finally {
		 String Text = closeButton != null ? closeButton : "N/A";
			Listeners.customAssert(closeButton, Text, expect, actual);
	}
	}
	
	
	
	public static String UploadH5p() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		
		String expect = "Creator should be able to upload h5p content successfully";
		String actual = "Creator is unable to upload h5p content ";
		String closeButton=null;
	 
	 try {
		DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
		DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
	    Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\boardgame.h5p", "h5p uploaded");
	    Thread.sleep(60000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
	    closeButton=Upload.getClose().getText();
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());

	    String randomName=DikshaUtils.set_Content_Name("H5p_Content");
	    excel.updateData("TestData","h5p" ,randomName, "");
	    closeButton=Upload.getClose().getText();
	    actual="Creator is able to upload h5p content successfully";
		return randomName;
		
	 } finally {
		 String Text = closeButton != null ? closeButton : "N/A";
			Listeners.customAssert(closeButton, Text, expect, actual);
	}
	}
	
   			public static String UploadYoutubeContent() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
			
			String expect = "Creator should be able to upload youtube content successfully";
			String actual = "Creator is unable to upload youtube content ";
			String closeButton=null;
		 
		 try {
			DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
			DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
			DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
			DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
			  Robot robot= new Robot();
			 DikshaUtils.waitToBeClickableAndClick(Upload.getContentURL());
			 Library.custom_sendkeys(Upload.getContentURL(), "https://youtu.be/K4TOrB7at0Y", "url uploaded");
		
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
			Thread.sleep(5000);
			Library.custom_click(Upload.getUploadButtonAfterUrl(), "select button");
			Thread.sleep(3000);
			DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
			closeButton=Upload.getClose().getText();
		    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
		    
		    String randomName=DikshaUtils.set_Content_Name("YT_Content");
		    excel.updateData("TestData","YT" ,randomName, "");
		    
		    actual="Creator is able to upload youtube content successfully";
			return randomName;
			
		 } finally {
			 String Text = closeButton != null ? closeButton : "N/A";
				Listeners.customAssert(closeButton, Text, expect, actual);
		}
		}
			
		 public static String UploadHtmlContent() throws Exception {
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
				
				String expect = "Creator should be able to upload html content successfully";
				String actual = "Creator is unable to upload html content ";
				String closeButton=null;
			 
			 try {
				DikshaUtils.waitToBeClickableAndClick(Upload.getHeaderDropdown());
				DikshaUtils.waitToBeClickableAndClick(Upload.getWorkspace());
				DikshaUtils.waitToBeClickableAndClick(Upload.getUploadcontent());
				Thread.sleep(1000);
				driver.switchTo().frame(0);
				DikshaUtils.waitToBeClickableAndClick(Upload.getContenttypetab());
				DikshaUtils.waitToBeClickableAndClick(Upload.geteTextbook());
				Library.custom_sendkeys(Upload.getBrowserbutton(),System.getProperty("user.dir")+"\\src\\main\\resources\\HTMLContent_test.zip", "html uploaded");
				Thread.sleep(3000);
			    DikshaUtils.waitToBeClickableAndClick(Upload.getSave());
			    closeButton=Upload.getClose().getText();
			    DikshaUtils.waitToBeClickableAndClick(Upload.getClose());
			    
			    String randomName=DikshaUtils.set_Content_Name("html_Content");
			    excel.updateData("TestData","html" ,randomName, "");
			    
			    actual="Creator is able to upload html content successfully";
				return randomName;
				
			 } finally {
				 String Text = closeButton != null ? closeButton : "N/A";
					Listeners.customAssert(closeButton, Text, expect, actual);
			}
			}
					
	
	public static void publishCourseFromUpForReview(String coursename) throws InterruptedException {
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		ValidatePopUp popup=PageFactory.initElements(driver, ValidatePopUp.class);
		
		String expect = "Reviewer should be able to publish course successfully";
		String actual = "Reviewer is unable to publish course ";
		String ContentsuccessfullyPublishedPopup =null;
		try {
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(review.getUpForReview());
		DikshaUtils.waitToBeClickableAndSendKeys(review.getSearchForReview(),coursename);
		DikshaUtils.waitToBeClickableAndClick(review.getSearchedContentForPublish());
		DikshaUtils.waitToBeClickableAndClick(review.getTaboncourse());
		driver.navigate().refresh();
		driver.navigate().refresh();
		DikshaUtils.waitToBeVisibleAndClick(review.getPublishTheCourse());
		DikshaUtils.waitToBeClickableAndClick(review.getConfirmpublishTheCourse());
		 Thread.sleep(3000);
		 ContentsuccessfullyPublishedPopup = popup.getCoursePublishedPopUp().getText();
	     Thread.sleep(1000);
	     actual = "Reviewer is able to publish course successfully";
		}
		finally {
			String Text =  ContentsuccessfullyPublishedPopup != null ?  ContentsuccessfullyPublishedPopup : "N/A";
			Listeners.customAssert("Content is published", Text, expect, actual);
		}
	
	}
	

	public static void LessonPlan_send_For_Review(String name) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UploadPdfContent Upload=PageFactory.initElements(driver, UploadPdfContent.class);
		UpForReview review=PageFactory.initElements(driver, UpForReview.class);
		
		String contentSendForReview = null;
	     String expect = "Creator should be able to send lesson plan for review Sucessfully";
	     String actual = "Creator is unable  to send lesson plan for review ";
		try {
		Thread.sleep(2000);
		Library.custom_click(Upload.getSendforreview(),"send for review");
		Thread.sleep(2000);
		Upload.getName().clear();
		Thread.sleep(1000);
		Upload.getName().sendKeys(name);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAddImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClickOnAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectImageFromAllImage());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectButton());
	    
       JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectBoardSyllabus());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getBoardSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectMedium());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getMediumSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectClass());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getClassSelected());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSelectSubject());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSubjectSelected());
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Upload.getYearDropdown());
	    Thread.sleep(1000);
	    DikshaUtils.waitToBeClickableAndClick(Upload.getYearDropdown());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getYearVlaue());
	    DikshaUtils.waitToBeClickableAndClick(Upload.getCopyright());
	    Upload.getCopyright().sendKeys("2023");
	    Thread.sleep(1000);
	    contentSendForReview =Upload.getSavebutton().getText();
	    DikshaUtils.waitToBeClickableAndClick(Upload.getSavebutton());
	    Thread.sleep(1000);
	   
	     actual = "Creator is able to send lesson plan for review Sucessfully";
		}
		finally {
			String Text =  Upload.getSavebutton()!= null ?  contentSendForReview : "N/A";
			Listeners.customAssert(contentSendForReview, Text, expect, actual);
		}
	       	
	}
		
	public static void openCousrseAddAContentAndSendForReview(String coursename, String contentName)
			throws InterruptedException {
		UpForReview review = PageFactory.initElements(driver, UpForReview.class);
		ValidatePopUp popup = PageFactory.initElements(driver, ValidatePopUp.class);
		CourseCreation content = PageFactory.initElements(driver, CourseCreation.class);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		DikshaUtils.waitToBeClickableAndClick(review.getHeaderDropdown());
		DikshaUtils.waitToBeClickableAndClick(review.getWorkspace());
		DikshaUtils.waitToBeClickableAndClick(review.getclkPublished());
		DikshaUtils.waitToBeClickableAndSendKeys(review.getSearchForReview(), coursename);
		driver.navigate().refresh();
		driver.navigate().refresh();

		DikshaUtils.waitToBeClickableAndClick(review.getselectedCourse());
		DikshaUtils.waitToBeClickableAndClick(content.getAddChild());
		DikshaUtils.waitToBeClickableAndSendKeys(content.getChildDesc1(), "Created via Automation");
		DikshaUtils.waitToBeClickableAndClick(content.getAddFromLibraryButton());
		DikshaUtils.waitToBeClickableAndSendKeys(content.getSearchContentFromLibrary(), contentName);

		content.getSearchContentFromLibrary().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		DikshaUtils.waitToBeClickableAndClick(content.getSelectButton());
		DikshaUtils.waitToBeClickableAndClick(content.getAddContent());
		Thread.sleep(2000);
		String ContentsuccessfullyaddPopup = popup.getContentAddFromLibraryPopup().getText();
		Assert.assertEquals(ContentsuccessfullyaddPopup, "Content is added to the folder");
		Thread.sleep(2000);

		DikshaUtils.waitToBeClickableAndClick(content.getContentFromLibrayBackButton());
		DikshaUtils.waitToBeClickableAndClick(content.getSubmitForreviewButton());
		DikshaUtils.waitToBeClickableAndClick(content.getTermsAndConditionCheckbox());
		DikshaUtils.waitToBeClickableAndClick(content.getNewCoursesubmitButton());
		Thread.sleep(2000);
		String ContentsendPopup = popup.getSendForReviewPopUp().getText();
		Assert.assertEquals(ContentsendPopup, "Content is sent for review");
		Thread.sleep(2000);

	}
}
