package com.Grading.Objects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

public class LetterGradeTakeHomeULPage  extends TestBaseGrade

{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public LetterGradeTakeHomeULPage(WebDriver driver)
	{

		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement Grading;

	@FindBy(xpath="(//strong[contains(text(),'CUSTOM')]//preceding-sibling::em)[7]")
	WebElement Customs ;

	@FindBy(css="#panelOne > div > app-course-exam-list > div > div > div.container-fluid.pl-0.pr-0 > div:nth-child(2) > div > div > app-advance-grid > div > div > div > div.row.mt-3 > div > table > tbody > tr > td:nth-child(1) > div")
	WebElement SelectCheckBox;

	@FindBy(xpath="//button[contains(text(),'Activate/Update Selected')]")
	WebElement ActiveUpdate;

	@FindBy(xpath="//a[@href=\"/3/schedule/19/courses\"]")
	WebElement CourseTab;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initial Grading Phase')]")
	WebElement GradingStetus;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),\"Criminal Justice\")]")
	WebElement  CriminalJasticeCourse;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Back')]")
	WebElement  Back;

	@FindBy(xpath="//span[contains(text(),'Check Conformity')]")
	WebElement CheckConformity;

	@FindBy(xpath="//button[@class=\"btn btn-danger actionsbtn\" and contains(text(),'Submit Final Grades')]")
	WebElement Submits;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Proceed to Final Grading')]")
	WebElement PreceedToFinal;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'ID / Name')]")
	WebElement IDName;

	@FindBy(how = How.XPATH, using = "//div//h3//em[@title=\"Emulate\"]")
	WebElement Emulation;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Criminal Justice (LAWJ-0003-006) 16050')]")
	WebElement CourseName;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Notes')]")
	WebElement Notes;

	@FindBy(xpath="(//div[@class=\"col-xs-12 col-sm-12 col-md-5 col-lg-3 cdpanel\"]//strong)[2]")
	WebElement CourseDetails;

	@FindBy(how = How.XPATH, using = "//app-site-header/nav[1]/div[2]/a[1]")
	WebElement GradingRule;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"d-inline-block\"]//a//strong")
	WebElement Cancle;

	@FindBy(how = How.XPATH, using = "//div[@class=\"courseNumber row\"]//div")
	WebElement YourCourseHeader;

	@FindBy(how = How.XPATH, using = "//body[1]/app-root[1]/app-faculty-emulate[1]/div[1]/div[4]/app-course-listing-faculty[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")
	WebElement CourseTitle;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Upperclass - UP30+ Class')]")
	WebElement ClassLevel2;
	
	@FindBy(how = How.CSS, using = "div.schedule-detail-home:nth-child(1) div.col-12.justify-content-between:nth-child(4) form.ng-untouched.ng-pristine.ng-valid div.dashboardpanelcontainer div:nth-child(1) table.table thead.facultycourselisting_header tr.hidden-xs.hideinmobile > th:nth-child(4)")
	WebElement CurrentStetus;

	@FindBy(how = How.CSS, using = "div.schedule-detail-home:nth-child(1) div.col-12.justify-content-between:nth-child(4) form.ng-untouched.ng-pristine.ng-valid div.dashboardpanelcontainer div:nth-child(1) table.table thead.facultycourselisting_header tr.hidden-xs.hideinmobile > th:nth-child(5)")
	WebElement GradeStetus;
	
    @FindBy(xpath="//span[@class=\"coursetitle\" and contains(text(),\"Criminal Justice (LAWJ-0003-006) 16050\")]/../../td[5]//button")
	WebElement AssignButton1;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Proceed to Final Grading')]")
	WebElement ProceedFinalButton;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Back')]")
	WebElement Back2;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Criminal Justice (LAWJ-0003-006) 16050')]")
	WebElement CourseNameAtGradePage;

	@FindBy(how = How.CSS, using = "div.bodypanelcontainer div.clearfix div.col-xs-12.col-sm-12.col-md-7.col-lg-9.gdpanel:nth-child(1) div.row div.col-8.col-md-8.pl-4 h3:nth-child(1) > strong:nth-child(1)")
	WebElement GardaingDetails;

	@FindBy(how = How.CSS, using = "div.bodypanelcontainer div.clearfix div.col-xs-12.col-sm-12.col-md-7.col-lg-9.gdpanel:nth-child(1) div.row div.col-4.col-md-4.pr-4 > p.float-right")
	WebElement DueDate2;

	@FindBy(how = How.CSS, using = "div.bodypanelcontainer div.clearfix div.col-xs-12.col-sm-12.col-md-5.col-lg-3.cdpanel:nth-child(2) div:nth-child(2) > div.alert.alert-warning:nth-child(1)")
	WebElement TakeRecentNoteSection;


	@FindBy(how = How.XPATH, using = "//td[@class=\"hidden-xs hideinmobile\"]//input[1]")
	WebElement RawScore1;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[1]")
	WebElement Note1;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit Initial Grades')]")
	WebElement SubmitButton;

	@FindBy(how = How.XPATH, using = "(//button[@class=\"btn btn-primary btn-block\"])[2]")
	WebElement OK;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[5]")
	WebElement RawScore2;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[9]")
	WebElement RawScore3;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[13]")
	WebElement RawScore4;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[17]")
	WebElement RawScore5;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[21]")
	WebElement RawScore6;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[25]")
	WebElement RawScore7;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[29]")
	WebElement RawScore8;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[33]")
	WebElement RawScore9;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[37]")
	WebElement RawScore10;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[41]")
	WebElement RawScore11;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[45]")
	WebElement RawScore12;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[49]")
	WebElement RawScore13;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[53]")
	WebElement RawScore14;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[57]")
	WebElement RawScore15;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[61]")
	WebElement RawScore16;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[65]")
	WebElement RawScore17;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[69]")
	WebElement RawScore18;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[73]")
	WebElement RawScore19;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[77]")
	WebElement RawScore20;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[81]")
	WebElement RawScore21;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[85]")
	WebElement RawScore22;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[89]")
	WebElement RawScore23;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[93]")
	WebElement RawScore24;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[97]")
	WebElement RawScore25;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[101]")
	WebElement RawScore26;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[105]")
	WebElement RawScore27;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[109]")
	WebElement RawScore28;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[113]")
	WebElement RawScore29;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[117]")
	WebElement RawScore30;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[121]")
	WebElement RawScore31;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[125]")
	WebElement RawScore32;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[129]")
	WebElement RawScore33;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input)[133]")
	WebElement RawScore34;

	@FindBy(xpath="(//td[@class=\"hidden-xs hideinmobile\"]//input)[137]")
	WebElement RawScore35;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[4]")
	WebElement Note2;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[7]")
	WebElement Note3;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[10]")
	WebElement Note4;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[13]")
	WebElement Note5;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[16]")
	WebElement Note6;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[19]")
	WebElement Note7;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[22]")
	WebElement Note8;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[25]")
	WebElement Note9;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[28]")
	WebElement Note10;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[31]")
	WebElement Note11;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[34]")
	WebElement Note12;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[37]")
	WebElement Note13;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[40]")
	WebElement Note14;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[43]")
	WebElement Note15;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[46]")
	WebElement Note16;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[49]")
	WebElement Note17;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[52]")
	WebElement Note18;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[55]")
	WebElement Note19;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[58]")
	WebElement Note20;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[61]")
	WebElement Note21;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[64]")
	WebElement Note22;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[67]")
	WebElement Note23;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[70]")
	WebElement Note24;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[73]")
	WebElement Note25;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[76]")
	WebElement Note26;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[79]")
	WebElement Note27;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[82]")
	WebElement Note28;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[85]")
	WebElement Note29;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[88]")
	WebElement Note30;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[91]")
	WebElement Note31;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[94]")
	WebElement Note32;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[97]")
	WebElement Note33;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[100]")
	WebElement Note34;

	@FindBy(how = How.XPATH, using = "(//td[@class=\"hidden-xs hideinmobile\"]//input[@class=\"btn-block\"])[103]")
	WebElement Note35;


	@FindBy(xpath = "//a[contains(text(),'STUDENTS')]")
	WebElement stu;

	@FindBy(xpath="//button[@class=\"btn btn-primary btn-block\" and contains(text(),'No')]")
	WebElement No;

	@FindBy(xpath="//input[@class=\"btn btn-primary btn-block\" and @value=\"Yes\"]")
	WebElement Yes;

	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/select[1]")
	WebElement GRADE1;

	@FindBy(xpath="//tbody/tr[2]/td[3]/div[1]/select[1]")
	WebElement GRADE2;

	@FindBy(xpath="(//select[@class=\"form-control\"])[5]")
	WebElement GRADE3;

	@FindBy(xpath="(//select[@class=\"form-control\"])[7]")
	WebElement GRADE4;

	@FindBy(xpath="(//select[@class=\"form-control\"])[9]")
	WebElement GRADE5;

	@FindBy(xpath="(//select[@class=\"form-control\"])[11]")
	WebElement GRADE6;

	@FindBy(xpath="(//select[@class=\"form-control\"])[13]")
	WebElement GRADE7;

	@FindBy(xpath="(//select[@class=\"form-control\"])[15]")
	WebElement GRADE8;

	@FindBy(xpath="(//select[@class=\"form-control\"])[17]")
	WebElement GRADE9;

	@FindBy(xpath="/html/body/app-root/app-faculty-emulate/app-view-assign-edit-grade/div/div[2]/div[2]/div[1]/div[2]/ngb-tabset/div/div[1]/app-grade/div/form/table/tbody/tr[10]/td[3]/div/select")
	WebElement GRADE10;

	@FindBy(xpath="(//select[@class=\"form-control\"])[21]")
	WebElement GRADE11;

	@FindBy(xpath="(//select[@class=\"form-control\"])[23]")
	WebElement GRADE12;

	@FindBy(xpath="(//select[@class=\"form-control\"])[25]")
	WebElement GRADE13;

	@FindBy(xpath="(//select[@class=\"form-control\"])[27]")
	WebElement GRADE14;

	@FindBy(xpath="(//select[@class=\"form-control\"])[29]")
	WebElement GRADE15;

	@FindBy(xpath="(//select[@class=\"form-control\"])[31]")
	WebElement GRADE16;

	@FindBy(xpath="(//select[@class=\"form-control\"])[33]")
	WebElement GRADE17;

	@FindBy(xpath="(//select[@class=\"form-control\"])[35]")
	WebElement GRADE18;

	@FindBy(xpath="(//select[@class=\"form-control\"])[37]")
	WebElement GRADE19;

	@FindBy(xpath="(//select[@class=\"form-control\"])[39]")
	WebElement GRADE20;

	@FindBy(xpath="(//select[@class=\"form-control\"])[41]")
	WebElement GRADE21;

	@FindBy(xpath="(//select[@class=\"form-control\"])[43]")
	WebElement GRADE22;

	@FindBy(xpath="(//select[@class=\"form-control\"])[45]")
	WebElement GRADE23;

	@FindBy(xpath="(//select[@class=\"form-control\"])[47]")
	WebElement GRADE24;

	@FindBy(xpath="(//select[@class=\"form-control\"])[49]")
	WebElement GRADE25;

	@FindBy(xpath="(//select[@class=\"form-control\"])[51]")
	WebElement GRADE26;

	@FindBy(xpath="(//select[@class=\"form-control\"])[53]")
	WebElement GRADE27;

	@FindBy(xpath="(//select[@class=\"form-control\"])[55]")
	WebElement GRADE28;

	@FindBy(xpath="(//select[@class=\"form-control\"])[57]")
	WebElement GRADE29;

	@FindBy(xpath="(//select[@class=\"form-control\"])[59]")
	WebElement GRADE30;

	@FindBy(xpath="(//select[@class=\"form-control\"])[61]")
	WebElement GRADE31;

	@FindBy(xpath="(//select[@class=\"form-control\"])[63]")
	WebElement GRADE32;

	@FindBy(xpath="(//select[@class=\"form-control\"])[65]")
	WebElement GRADE33;

	@FindBy(xpath="(//select[@class=\"form-control\"])[67]")
	WebElement GRADE34;

	@FindBy(xpath="(//select[@class=\"form-control\"])[69]")
	WebElement GRADE35;

	@FindBy(xpath="//body/app-root[1]/app-faculty-emulate[1]/app-view-assign-edit-grade[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]")
	WebElement CrouseDetails;

	@FindBy(xpath="//div[@class=\"alert alert-danger\"]//strong")
	WebElement CourseConformityReport;

	@FindBy(css="div.row div.col-12.pl-0.pr-0 div.clear-fix:nth-child(1) div.bodypanelcontainer div.clearfix div.col-12 div.col-12 div.col-xs-12.col-sm-12.col-md-7.col-lg-9.gdpanel:nth-child(1) div:nth-child(1) div:nth-child(1) > ul:nth-child(3)")
	WebElement CourseConformityReportMessage;


	@FindBy(xpath="//div[@class=\"alert alert-danger\"]//strong")
	WebElement CourseConformityReportGreen;

	@FindBy(css="div.row div.col-12.pl-0.pr-0 div.clear-fix:nth-child(1) div.bodypanelcontainer div.clearfix div.col-12 div.col-12 div.col-xs-12.col-sm-12.col-md-7.col-lg-9.gdpanel:nth-child(1) div:nth-child(1) div:nth-child(1) > ul:nth-child(3)")
	WebElement CourseConformityReportMessage2;

	@FindBy(css="div.row div.col-12.pl-0.pr-0 div.clear-fix:nth-child(1) div.bodypanelcontainer div.clearfix div.col-12 div.col-12 div.col-xs-12.col-sm-12.col-md-7.col-lg-9.gdpanel:nth-child(1) div:nth-child(1) div:nth-child(1) > ul:nth-child(5)")
	WebElement GradeAlertMassage;

	@FindBy(xpath="/html/body/app-root/app-faculty-emulate/app-view-assign-edit-grade/div/div/app-conformity/div[1]/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/strong")
	WebElement ConformityReportGreen;

	@FindBy(xpath="//th[contains(text(),'# Enrolled Students')]")
	WebElement EnrollStudent;

	@FindBy(xpath="//th[contains(text(),'Grade')]")
	WebElement Grades;

	@FindBy(xpath="//th[contains(text(),'Count')]")
	WebElement Count;

	@FindBy(xpath="//th[contains(text(),'Recommended Distribution')]")
	WebElement Recommented;

	@FindBy(xpath="//th[contains(text(),'Actual Distribution')]")
	WebElement Disribution;

	@FindBy(xpath="//th[contains(text(),'Mandatory Ceiling (Max Mean Class GPA)')]")
	WebElement GPA;

	@FindBy(xpath="//th[contains(text(),'Actual Mean (Class GPA)')]")
	WebElement ClassGPA;

	@FindBy(xpath="(//div[@class=\"alert alert-info distributionpercentage\"])[1]")
	WebElement EnrolledText;

	@FindBy(xpath="(//div[@class=\"alert alert-info distributionpercentage\"])[2]")
	WebElement MaxGPAText;

	@FindBy(xpath="(//div[@class=\"alert alert-info distributionpercentage\"])[3]")
	WebElement ActualMeanText;

	@FindBy(xpath="//td[@class=\"enddistributiongroup\" and contains(text(),'5.714')]")
	WebElement ActualDistributionScore1;

	@FindBy(xpath="(//div[@class=\"alert alert-info distributionpercentage\"])[4]")
	WebElement ActualDistributionScore2;

	@FindBy(xpath="(//div[@class=\"alert alert-info distributionpercentage\"])[5]")
	WebElement ActualDistributionScore3;

	@FindBy(xpath="(//div[@class=\"alert alert-info distributionpercentage\"])[6]")
	WebElement ActualDistributionScore4;

	@FindBy(xpath="(//div[@class=\"alert alert-info distributionpercentage\"])[7]")
	WebElement ActualDistributionScore5;

	@FindBy(xpath="(//div[@class=\"alert alert-info distributionpercentage\"])[8]")
	WebElement ActualDistributionScore6;

	@FindBy(xpath="//body/app-root[1]/app-faculty-emulate[1]/app-view-assign-edit-grade[1]/div[1]/div[1]/app-conformity[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]")
	WebElement WholeTable;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"search\"]")
	WebElement Search;
	
	@FindBy(xpath="//button[contains(text(),'Approve Final Grades')]")
    WebElement ApprovedButton;
	
	@FindBy(xpath="//span[contains(text(),'Final Grades - Pending Banner Upload')]")
	WebElement GradeSteusFor;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"panelOne\"]/div/app-course-exam-list/app-course-detail/div/div/app-view-assign-edit-grade/div/div[2]/div[2]/div[2]/h3[1]/strong")
	WebElement RecentNoteSections;
	
    @FindBy(xpath="//td[@class=\"hidden-xs hideinmobile\"]//button[contains(text(),'View Grades')]")
    WebElement ViewGrades;
    
    @FindBy(xpath="//textarea[@id='txtNotes']")
    WebElement EnterNotes;
    
    @FindBy(xpath="//button[contains(text(),'Deactivate')]")
	WebElement Deactivate;
    
    @FindBy(xpath="//button[@class=\"btn btn-primary\" and @style=\"font-size:10pt\"]")
    WebElement Emulation2;

    @FindBy(xpath="/html/body/app-root/app-schedule-details-home/div/div[2]/app-exam-schedule-menu/ul/li[4]/a")
    WebElement studentTab;
    
    @FindBy(xpath="//tr[@class=\"hidden-xs hideinmobile\"]//th[contains(text(),'Raw Score')]")
    WebElement RawScore;
    
    @FindBy(xpath="//tr[@class=\"hidden-xs hideinmobile\"]//span[contains(text(),'Letter Grade')]")
    WebElement LetterGrade;
    
    @FindBy(xpath="//input[@value=\"Yes\"]")
	WebElement Yes2;
	
    @FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/app-course-detail/div/div/app-view-assign-edit-grade/div/div[1]/div/div/a[2]")
	WebElement ProceedFinalButton2;

    
    
	public void NavigateToDashboard() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(spring2020));
		spring2020.click();
		Thread.sleep(3000);
		wait1.until(ExpectedConditions.visibilityOf(Grading));
		Grading.click();
		Thread.sleep(4000);
	}
	public void GotoCourseTab3() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		CourseTab.click();
		Thread.sleep(6000);
		
		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("16050");
		Thread.sleep(4000);
		
		wait1.until(ExpectedConditions.visibilityOf(SelectCheckBox));
		highLightElement(driver,SelectCheckBox);
		SelectCheckBox.click();
		Thread.sleep(2000);
		
		wait1.until(ExpectedConditions.visibilityOf(ActiveUpdate));
		highLightElement(driver,ActiveUpdate);
		ActiveUpdate.click();
		Thread.sleep(5000);

		wait1.until(ExpectedConditions.visibilityOf(stu));
		scrollToElement(stu);
		highLightElement(driver,stu);
		stu.click();
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		scrollToElement(CourseTab);
		highLightElement(driver,CourseTab);
		CourseTab.click();
		Thread.sleep(6000);

		
	}
	public void deactivatecoursefirst() throws InterruptedException
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Search));
		highLightElement(driver,Search);
		Search.sendKeys("16050");
		Thread.sleep(4000);
		wait1.until(ExpectedConditions.visibilityOf(CriminalJasticeCourse));
			try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(CriminalJasticeCourse));
			System.out.println("Element is clickable");
		}
		catch(TimeoutException e) {
			System.out.println("Element isn't clickable");
		}
		wait1.until(ExpectedConditions.visibilityOf(CriminalJasticeCourse));
		staleElementClick(5,CriminalJasticeCourse,40);
		
		wait1.until(ExpectedConditions.visibilityOf(ProceedFinalButton2));
		highLightElement(driver,ProceedFinalButton2);
		ProceedFinalButton2.click();

		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(Deactivate));
		highLightElement(driver,Deactivate);
		Deactivate.click();
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(Yes2));
		scrollToElement(Yes2);
		highLightElement(driver,Yes2);
		Yes2.click();
		Thread.sleep(3000);
	

		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		scrollToElement(CourseTab);
		highLightElement(driver,CourseTab);
		CourseTab.click();
		Thread.sleep(5000);
				
	}
	public void ActivateCourse() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("16050");
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(SelectCheckBox));
		highLightElement(driver,SelectCheckBox);
		SelectCheckBox.click();
		Thread.sleep(2000);
		
		wait1.until(ExpectedConditions.visibilityOf(ActiveUpdate));
		highLightElement(driver,ActiveUpdate);
		ActiveUpdate.click();
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(stu));
		scrollToElement(stu);
		highLightElement(driver,stu);
		stu.click();
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		scrollToElement(CourseTab);
		highLightElement(driver,CourseTab);
		CourseTab.click();
		Thread.sleep(6000);


	}
	public void CheckGradingStetus() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("16050");
		Thread.sleep(2000);
	}
	public void CheckCourseLinkm() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(CriminalJasticeCourse));
		softAssert.assertEquals(CriminalJasticeCourse.isEnabled(), true);
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(CriminalJasticeCourse));
			System.out.println("Element is clickable");
		}
		catch(TimeoutException e) {
			System.out.println("Element isn't clickable");
		}
		wait1.until(ExpectedConditions.visibilityOf(CriminalJasticeCourse));
		CriminalJasticeCourse.click();
		Thread.sleep(1000);
	}
	public void  AttributesVerificationb() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Back));
		softAssert.assertEquals(Back.isDisplayed(), true);
		System.out.println("Back Attribute is present");

		softAssert.assertEquals(IDName.isDisplayed(), true);
		System.out.println("IDName Attribute is present");

		softAssert.assertEquals(RawScore.isDisplayed(), true);
		System.out.println("RawScore is display");

		softAssert.assertEquals(LetterGrade.isDisplayed(), true);
		System.out.println("LetterGrade is display");

		softAssert.assertEquals(Notes.isDisplayed(), true);
		System.out.println("Notes is display");

		softAssert.assertEquals(Emulation.isEnabled(), true);
		System.out.println("Emulation is display");

		softAssert.assertEquals(CourseName.isDisplayed(), true);		
		String R1 = CourseName.getText();
		System.out.println(R1);
		Assert.assertEquals(R1,"Criminal Justice (LAWJ-0003-006) 16050");

		Thread.sleep(1000);

		System.out.println("All the attributes are display");

	}
	public void CheckForAttributet2() 
	{

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,300)");

		softAssert.assertEquals(CourseDetails.isDisplayed(), true);
		System.out.println("CourseDetails Attribute is present");

	


		js.executeScript("window.scrollBy(0,-400)");

	}
	public void EmulateCoursep() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Emulation));
		Emulation.click();
		Thread.sleep(1000);
	}
	public void CheckAllAttributeAfterEmulation() throws InterruptedException 
	{
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		System.out.println("GradigruleLink  is Enabled");


		softAssert.assertEquals(Cancle.isEnabled(), true);
		System.out.println("CancleLink  is Enabled");

		softAssert.assertEquals(YourCourseHeader.isDisplayed(), true);
		System.out.println("YourCourseHeader Attribute is present");

		WebDriverWait wait1 = new WebDriverWait(driver,60);
	

		wait1.until(ExpectedConditions.visibilityOf(ClassLevel2));
		String R2= ClassLevel2.getText();
		System.out.println("The ClassLevel =  "+R2);
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(CurrentStetus));
		String R4= CurrentStetus.getText();
		System.out.println("The CurrentStetus =  "+R4);
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(GradeStetus));
		String R5= GradeStetus.getText();
		System.out.println("The GradeStetus =  "+R5);
		Thread.sleep(1000);

		softAssert.assertEquals(AssignButton1.isEnabled(), true);
		System.out.println("AssignButton  is Enabled");


	}
	public void PressAssignGradeButton() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(AssignButton1));
        scrollToElement(AssignButton1);		
		wait1.until(ExpectedConditions.visibilityOf(AssignButton1));

		AssignButton1.click();
		Thread.sleep(1000);
	}
	public void CheckForAttributesAtGradeAssingPage() throws InterruptedException 
	{
		softAssert.assertEquals(Cancle.isEnabled(), true);
		softAssert.assertEquals(PreceedToFinal.isEnabled(), true);
		softAssert.assertEquals(Back2.isEnabled(), true);
		softAssert.assertEquals(CourseNameAtGradePage.isDisplayed(), true);
		softAssert.assertEquals(GardaingDetails.isDisplayed(), true);
     	softAssert.assertEquals(DueDate2.isDisplayed(), true);
		softAssert.assertEquals(TakeRecentNoteSection.isDisplayed(), true);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(TakeRecentNoteSection));
		String R5= TakeRecentNoteSection.getText();
		System.out.println("The RecentNoteSection At gradePage =  "+R5);
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(CourseName));
		String S1= CourseName.getText();
		System.out.println("The CourseName At GradePage =  "+S1);
		Thread.sleep(1000);
	}
	public void EnterGradesForFirstStudent() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(RawScore1));
		RawScore1.sendKeys("67");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note1));
		Note1.sendKeys("Pass");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(PreceedToFinal));
		PreceedToFinal.click();
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(SubmitButton));
		SubmitButton.click();
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(OK));
		OK.click();
		Thread.sleep(3000);
		wait1.until(ExpectedConditions.visibilityOf(Back));
		staleElementClick(5,Back,30);
		Back.click();
		Thread.sleep(2000);
	}
	public void AssigningGradeToAllStudent1() throws InterruptedException 
	{


		WebDriverWait wait1 = new WebDriverWait(driver, 60);
     	wait1.until(ExpectedConditions.visibilityOf(AssignButton1));

		highLightElement(driver, AssignButton1);
        scrollToElement(AssignButton1);
		AssignButton1.click();
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore1));
		RawScore1.sendKeys("67");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note1));
		Note1.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore2));
		RawScore2.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note2));
		Note2.sendKeys("Pass");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore3));
		RawScore3.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note3));
		Note3.sendKeys("Pass");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore4));
		scrollToElement(RawScore4);
		RawScore4.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note4));
		Note4.sendKeys("Fail");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore5));
		scrollToElement(RawScore5);
		RawScore5.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note5));
		Note5.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore6));
		scrollToElement(RawScore6);
		RawScore6.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note6));
		Note6.sendKeys("Fail");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore7));
		scrollToElement(RawScore7);
		RawScore7.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note7));
		Note7.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore8));
		scrollToElement(RawScore8);
		RawScore8.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note8));
		Note8.sendKeys("Fail");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore9));
		scrollToElement(RawScore9);
		RawScore9.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note9));
		Note9.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore10));
		scrollToElement(RawScore10);
		RawScore10.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note10));
		Note10.sendKeys("Fail");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore11));
		scrollToElement(RawScore11);
		RawScore11.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note11));
		Note11.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore12));
		scrollToElement(RawScore12);
		RawScore12.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note12));
		Note12.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore13));
		scrollToElement(RawScore13);
		RawScore13.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note13));
		Note13.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore14));
		scrollToElement(RawScore14);
		RawScore14.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note14));
		Note14.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore15));
		scrollToElement(RawScore15);
		RawScore15.sendKeys("60");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note15));
		Note15.sendKeys("Pass");
		Thread.sleep(1000);



	}
	public void AssigningGradeToAllStudent2() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(RawScore16));
		scrollToElement(RawScore16);
		RawScore16.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note16));
		Note16.sendKeys("Fail");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore17));
		scrollToElement(RawScore17);
		RawScore17.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note17));
		Note17.sendKeys("Fail");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore18));
		scrollToElement(RawScore18);
		RawScore18.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note18));
		Note18.sendKeys("Pass");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore19));
		scrollToElement(RawScore19);
		RawScore19.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note19));
		Note19.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore20));
		scrollToElement(RawScore20);
		RawScore20.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note20));
		Note20.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore21));
		scrollToElement(RawScore21);
		RawScore21.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note21));
		Note21.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore22));
		scrollToElement(RawScore22);
		RawScore22.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note22));
		Note22.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore23));
		scrollToElement(RawScore23);
		RawScore23.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note23));
		Note23.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore24));
		scrollToElement(RawScore24);
		RawScore24.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note24));
		Note24.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore25));
		scrollToElement(RawScore25);
		RawScore25.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note25));
		Note25.sendKeys("Fail");
		Thread.sleep(1000);



		wait1.until(ExpectedConditions.visibilityOf(RawScore26));
		scrollToElement(RawScore26);
		RawScore26.sendKeys("71");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note26));
		Note26.sendKeys("Fail");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore27));
		scrollToElement(RawScore27);
		RawScore27.sendKeys("72");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note27));
		Note27.sendKeys("Pass");
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(RawScore28));
		scrollToElement(RawScore28);
		RawScore28.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note28));
		Note28.sendKeys("Pass");
		Thread.sleep(1000);



		wait1.until(ExpectedConditions.visibilityOf(RawScore29));
		scrollToElement(RawScore29);
		RawScore29.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note29));
		Note29.sendKeys("Fail");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore30));
		scrollToElement(RawScore30);
		RawScore30.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note30));
		Note30.sendKeys("Pass");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore31));
		scrollToElement(RawScore31);
		RawScore31.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note31));
		Note31.sendKeys("Fail");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore32));
		scrollToElement(RawScore32);
		RawScore32.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note32));
		Note32.sendKeys("Pass");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore33));
		scrollToElement(RawScore33);
		RawScore33.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note33));
		Note33.sendKeys("Fail");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore34));
		scrollToElement(RawScore34);
		RawScore34.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note34));
		Note34.sendKeys("Pass");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(RawScore35));
		scrollToElement(RawScore35);
		RawScore35.sendKeys("70");
		Thread.sleep(1000);
		wait1.until(ExpectedConditions.visibilityOf(Note35));
		Note35.sendKeys("Fail");
		Thread.sleep(2000);
	}
	public void GotoProceed() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(PreceedToFinal));
		PreceedToFinal.click();
		Thread.sleep(3000);

        highLightElement(driver,No);
		wait1.until(ExpectedConditions.visibilityOf(No));

		No.click();

		Thread.sleep(2000);


		wait1.until(ExpectedConditions.visibilityOf(Back));
		staleElementClick(5,Back,30);
		Back.click();

		Thread.sleep(2000);
	
		
		wait1.until(ExpectedConditions.visibilityOf(AssignButton1));

		
        scrollToElement(AssignButton1);
		highLightElement(driver,AssignButton1);
		AssignButton1.click();
		Thread.sleep(3000);


		wait1.until(ExpectedConditions.visibilityOf(ProceedFinalButton));

		ProceedFinalButton.click();

		Thread.sleep(2000);

		wait1.until(ExpectedConditions.visibilityOf(Yes));

		Yes.click();

		Thread.sleep(2000);

	}
	public void PressAssignGradeButton2() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(AssignButton1));
		JavascriptExecutor js = (JavascriptExecutor) driver;		
        js.executeScript("window.scrollBy(0,300)");
		highLightElement(driver,AssignButton1);
		AssignButton1.click();
		Thread.sleep(1000);
	}
	public void VerifyAllAttributesAfterAssignGrade() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Back));
		softAssert.assertEquals(Back.isDisplayed(), true);
		System.out.println("Back Attribute is present");

		softAssert.assertEquals(IDName.isDisplayed(), true);
		System.out.println("IDName Attribute is present");


		//softAssert.assertEquals(RawScore.isDisplayed(), true);
		//System.out.println("RawScore is display");

		//softAssert.assertEquals(LetterGrade.isDisplayed(), true);
		//System.out.println("LetterGrade is display");

		//softAssert.assertEquals(Notes.isDisplayed(), true);
		//System.out.println("Notes is display");

		//softAssert.assertEquals(BestPaper.isDisplayed(), true);
		//System.out.println("BestPaper is display");

		//softAssert.assertEquals(PublishLibrary.isDisplayed(), true);
		//System.out.println("PublishLibrabry is display");


		//softAssert.assertEquals(DueDate.isDisplayed(), true);
		//System.out.println("DueDdate is display");

		wait1.until(ExpectedConditions.visibilityOf(CourseName));
		String S1= CourseName.getText();
		System.out.println("The CourseName At GradePage =  "+S1);
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(CourseDetails));
		scrollToElement(CourseDetails);
		String S2= CourseDetails.getText();
		System.out.println("The CourseName At GradePage =  "+S2);
		Thread.sleep(1000);

		softAssert.assertEquals(CourseDetails.isDisplayed(), true);
		System.out.println("CourseDetails Attribute is present");
		Thread.sleep(1000);
	}
	public void CheckConformity() throws InterruptedException 
	{

		scrollToElement(CheckConformity);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(CheckConformity));

		CheckConformity.click();

		Thread.sleep(2000);


		wait1.until(ExpectedConditions.visibilityOf(Submits));

		Submits.click();
		Thread.sleep(2000);
	}
	public void ClickOnAleart() throws InterruptedException 
	{
		if(OK.isEnabled()) 
		{
			System.out.println("OK is Enabled");
		}
		else 
		{
			System.out.println("OK is  not Enabled");
		}
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(OK));

		OK.click();

		Thread.sleep(1000);

		wait1.until(ExpectedConditions.elementToBeClickable(Cancle));
        
		Cancle.click();

		Thread.sleep(1000);



	}
	public void GoBack5() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		

		wait1.until(ExpectedConditions.visibilityOf(stu));
	    stu.click();
		Thread.sleep(6000);
		
		
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		CourseTab.click();
		Thread.sleep(6000);

		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("16050");
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(CriminalJasticeCourse));
		CriminalJasticeCourse.click();
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(Emulation2));
		Emulation2.click();
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(AssignButton1));
		AssignButton1.click();
		Thread.sleep(1000);

	}
	public void AssighLetterGrade() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,120);
		
		wait1.until(ExpectedConditions.visibilityOf(GRADE1));
		scrollToElement(GRADE1);
		GRADE1.click();
		Select s1 = new Select(GRADE1);
		//s1.selectByVisibleText("A+");
		s1.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade1");

		wait1.until(ExpectedConditions.visibilityOf(GRADE2));
		scrollToElement(GRADE2);
		GRADE2.click();
		Select s2 = new Select(GRADE2);
		//s2.selectByVisibleText("A+");
		s2.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade2");


		wait1.until(ExpectedConditions.visibilityOf(GRADE3));
		scrollToElement(GRADE3);
		GRADE3.click();
		Select s3 = new Select(GRADE3);
		//s3.selectByVisibleText("A");
		s3.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade3");

		wait1.until(ExpectedConditions.visibilityOf(GRADE4));
		scrollToElement(GRADE4);
		GRADE4.click();
		Select s4 = new Select(GRADE4);
		//s4.selectByVisibleText("A");
		s4.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade4");


		wait1.until(ExpectedConditions.visibilityOf(GRADE5));
		scrollToElement(GRADE5);
		GRADE5.click();
		Select s5 = new Select(GRADE5);
		//s5.selectByVisibleText("A-");
		s5.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade5");


		wait1.until(ExpectedConditions.visibilityOf(GRADE6));
		scrollToElement(GRADE6);
		GRADE6.click();
		Select s6 = new Select(GRADE6);
		//s6.selectByVisibleText("A-");
		s6.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade6");
	}
	public void AssighLetterGrade2() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GRADE7));
		scrollToElement(GRADE7);
		GRADE7.click();
		Select s7 = new Select(GRADE7);
		//s7.selectByVisibleText("A");
		s7.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade7");

		wait1.until(ExpectedConditions.visibilityOf(GRADE8));
		scrollToElement(GRADE8);
		GRADE8.click();
		Select s8 = new Select(GRADE8);
		//s8.selectByVisibleText("A");
	    s8.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade8");

		wait1.until(ExpectedConditions.visibilityOf(GRADE9));
		scrollToElement(GRADE9);
		GRADE9.click();
		Select s9 = new Select(GRADE9);
		//s9.selectByVisibleText("A+");
		s9.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade9");
	}
	public void SelectGrade() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GRADE10));
		scrollToElement(GRADE10);
		GRADE10.click();
		Select s10 = new Select(GRADE10);
		//s10.selectByVisibleText("A+");
		s10.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade10");

		wait1.until(ExpectedConditions.visibilityOf(GRADE11));
		scrollToElement(GRADE11);
		GRADE11.click();
		Select s11 = new Select(GRADE11);
		//s11.selectByVisibleText("A-");
		s11.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade11");

		wait1.until(ExpectedConditions.visibilityOf(GRADE12));
		scrollToElement(GRADE12);
		GRADE12.click();
		Select s12 = new Select(GRADE12);
		//s12.selectByVisibleText("A-");
		s12.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade12");
	}

	public void SelectGrades2() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GRADE13));
		scrollToElement(GRADE13);
		GRADE13.click();
		Select s13 = new Select(GRADE13);
		//s13.selectByVisibleText("A+");
		s13.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade13");


		wait1.until(ExpectedConditions.visibilityOf(GRADE14));
		scrollToElement(GRADE14);
		GRADE14.click();
		Select s14 = new Select(GRADE14);
		//s14.selectByVisibleText("A-");
		s14.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade14");

		wait1.until(ExpectedConditions.visibilityOf(GRADE15));
		scrollToElement(GRADE15);
		GRADE15.click();
		Select s15 = new Select(GRADE15);
		//s15.selectByVisibleText("A+");
		s15.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade15");

		wait1.until(ExpectedConditions.visibilityOf(GRADE16));
		scrollToElement(GRADE16);
		GRADE16.click();
		Select s16 = new Select(GRADE16);
		//s16.selectByVisibleText("A+");
		s16.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade16");

		wait1.until(ExpectedConditions.visibilityOf(GRADE17));
		scrollToElement(GRADE17);
		GRADE17.click();
		Select s17 = new Select(GRADE17);
		//s17.selectByVisibleText("A");
		s17.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade17");
	}


	public void SelectGrade3() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GRADE18));
		scrollToElement(GRADE18);
		GRADE18.click();
		Select s18 = new Select(GRADE18);
		//s18.selectByVisibleText("A");
		s18.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade18");

		wait1.until(ExpectedConditions.visibilityOf(GRADE19));
		scrollToElement(GRADE19);
		GRADE19.click();
		Select s19 = new Select(GRADE19);
		//s19.selectByVisibleText("A");
		s19.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade19");

		wait1.until(ExpectedConditions.visibilityOf(GRADE20));
		scrollToElement(GRADE20);
		GRADE20.click();
		Select s20 = new Select(GRADE20);
		//s20.selectByVisibleText("A+");
		s20.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade20");

	}
	public void AssighLetterGrade3() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GRADE21));
		scrollToElement(GRADE21);
		GRADE21.click();
		Select s21 = new Select(GRADE21);
		//s21.selectByVisibleText("A+");
		s21.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade21");

		wait1.until(ExpectedConditions.visibilityOf(GRADE22));
		scrollToElement(GRADE22);
		GRADE22.click();
		Select s22 = new Select(GRADE22);
		//s22.selectByVisibleText("A+");
		s22.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade22");

		wait1.until(ExpectedConditions.visibilityOf(GRADE23));
		scrollToElement(GRADE23);
		GRADE23.click();
		Select s23 = new Select(GRADE23);
		//s23.selectByVisibleText("A-");
		s23.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade23");

		wait1.until(ExpectedConditions.visibilityOf(GRADE24));
		scrollToElement(GRADE24);
		GRADE24.click();
		Select s24 = new Select(GRADE24);
		//s24.selectByVisibleText("A+");
		s24.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade24");


		wait1.until(ExpectedConditions.visibilityOf(GRADE25));
		scrollToElement(GRADE25);
		GRADE25.click();
		Select s25 = new Select(GRADE25);
		//s25.selectByVisibleText("A");
		s25.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade25");


		wait1.until(ExpectedConditions.visibilityOf(GRADE26));
		scrollToElement(GRADE26);
		GRADE26.click();
		Select s26 = new Select(GRADE26);
		//s26.selectByVisibleText("A+");
		s26.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade26");


		wait1.until(ExpectedConditions.visibilityOf(GRADE27));
		scrollToElement(GRADE27);
		GRADE27.click();
		Select s27 = new Select(GRADE27);
		//s27.selectByVisibleText("A");
		s27.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade27");


		wait1.until(ExpectedConditions.visibilityOf(GRADE28));
		scrollToElement(GRADE28);
		GRADE28.click();
		Select s28 = new Select(GRADE28);
		//s28.selectByVisibleText("A-");
		s28.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade28");


		wait1.until(ExpectedConditions.visibilityOf(GRADE29));
		scrollToElement(GRADE29);
		GRADE29.click();
		Select s29 = new Select(GRADE29);
		//s29.selectByVisibleText("A");
		s29.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade29");


		wait1.until(ExpectedConditions.visibilityOf(GRADE30));
		scrollToElement(GRADE30);
		GRADE30.click();
		Select s30 = new Select(GRADE30);
		//s30.selectByVisibleText("A");
		s30.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade30");	
	}
	public void AssighLetterGrade4() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GRADE31));
		scrollToElement(GRADE31);
		GRADE31.click();
		Select s31 = new Select(GRADE31);
		//s31.selectByVisibleText("A");
		s31.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade31");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE32));
		scrollToElement(GRADE32);
		GRADE32.click();
		Select s32 = new Select(GRADE32);
		//s32.selectByVisibleText("A");
		s32.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade32");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE33));
		scrollToElement(GRADE33);
		GRADE33.click();
		Select s33 = new Select(GRADE33);
		//s33.selectByVisibleText("A");
		s33.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade33");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE34));
		scrollToElement(GRADE34);
		GRADE34.click();
		Select s34 = new Select(GRADE34);
		//s34.selectByVisibleText("A+");
		s34.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade34");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE35));
		scrollToElement(GRADE35);
		GRADE35.click();
		Select s35 = new Select(GRADE35);
		//s35.selectByVisibleText("A-");
		s35.selectByIndex(3);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade35");	


	}
	public void SelectConform() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
		scrollToElement(CheckConformity);
		highLightElement(driver,CheckConformity);
		CheckConformity.click();

		Thread.sleep(3000);


		wait1.until(ExpectedConditions.visibilityOf(Submits));
		highLightElement(driver,Submits);
		Submits.click();
		Thread.sleep(3000);
	}
	public void clickyes() throws InterruptedException {


		softAssert.assertEquals(OK.isDisplayed(), true);
		System.out.println("Back Attribute is present");

		WebDriverWait wait1 = new WebDriverWait(driver,120);
		wait1.until(ExpectedConditions.visibilityOf(OK));
		OK.click();
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(Back));
		Back.click();
		Thread.sleep(3000);
	}
	public void AssignconformityreporttableALLDandF() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GRADE1));
		GRADE1.click();
		Select s1 = new Select(GRADE1);
		//s1.selectByVisibleText("D");
		s1.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade1");

		wait1.until(ExpectedConditions.visibilityOf(GRADE2));
		scrollToElement(GRADE2);
		GRADE2.click();
		Select s2 = new Select(GRADE2);
		//s2.selectByVisibleText("D");
		s2.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade2");


		wait1.until(ExpectedConditions.visibilityOf(GRADE3));
		scrollToElement(GRADE3);
		GRADE3.click();
		Select s3 = new Select(GRADE3);
		//s3.selectByVisibleText("F");
		s3.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade3");

		wait1.until(ExpectedConditions.visibilityOf(GRADE4));
		scrollToElement(GRADE4);
		GRADE4.click();
		Select s4 = new Select(GRADE4);
		//s4.selectByVisibleText("F");
		s4.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade4");


		wait1.until(ExpectedConditions.visibilityOf(GRADE5));
		scrollToElement(GRADE5);
		GRADE5.click();
		Select s5 = new Select(GRADE5);
		//s5.selectByVisibleText("F");
		s5.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade5");


		wait1.until(ExpectedConditions.visibilityOf(GRADE6));
		scrollToElement(GRADE6);
		GRADE6.click();
		Select s6 = new Select(GRADE6);
		//s6.selectByVisibleText("D");
		s6.selectByIndex(10);
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(GRADE7));
		scrollToElement(GRADE7);
		GRADE7.click();
		Select s7 = new Select(GRADE7);
		//s7.selectByVisibleText("D");
		s7.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade7");

		wait1.until(ExpectedConditions.visibilityOf(GRADE8));
		scrollToElement(GRADE8);
		GRADE8.click();
		Select s8 = new Select(GRADE8);
		//s8.selectByVisibleText("F");
		s8.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade8");

		wait1.until(ExpectedConditions.visibilityOf(GRADE9));
		scrollToElement(GRADE9);
		GRADE9.click();
		Select s9 = new Select(GRADE9);
		//s9.selectByVisibleText("D");
		s9.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade9");

		wait1.until(ExpectedConditions.visibilityOf(GRADE10));
		scrollToElement(GRADE10);
		GRADE10.click();
		Select s10 = new Select(GRADE10);
		//s10.selectByVisibleText("F");
		s10.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade10");

		wait1.until(ExpectedConditions.visibilityOf(GRADE11));
		scrollToElement(GRADE11);
		GRADE11.click();
		Select s11 = new Select(GRADE11);
		//s11.selectByVisibleText("D");
		s11.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade11");

		wait1.until(ExpectedConditions.visibilityOf(GRADE12));
		scrollToElement(GRADE12);
		GRADE12.click();
		Select s12 = new Select(GRADE12);
		//s12.selectByVisibleText("F");
		s12.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade12");

		wait1.until(ExpectedConditions.visibilityOf(GRADE13));
		scrollToElement(GRADE13);
		GRADE13.click();
		Select s13 = new Select(GRADE13);
		//s13.selectByVisibleText("D");
		s13.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade13");


		wait1.until(ExpectedConditions.visibilityOf(GRADE14));
		scrollToElement(GRADE14);
		GRADE14.click();
		Select s14 = new Select(GRADE14);
		//s14.selectByVisibleText("F");
		s14.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade14");

		wait1.until(ExpectedConditions.visibilityOf(GRADE15));
		scrollToElement(GRADE15);
		GRADE15.click();
		Select s15 = new Select(GRADE15);
		//s15.selectByVisibleText("D");
		s15.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade15");

		wait1.until(ExpectedConditions.visibilityOf(GRADE16));
		scrollToElement(GRADE16);
		GRADE16.click();
		Select s16 = new Select(GRADE16);
		//s16.selectByVisibleText("F");
		s16.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade16");

		wait1.until(ExpectedConditions.visibilityOf(GRADE17));
		scrollToElement(GRADE17);
		GRADE17.click();
		Select s17 = new Select(GRADE17);
		//s17.selectByVisibleText("D");
		s17.selectByIndex(10);
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(GRADE18));
		scrollToElement(GRADE18);
		GRADE18.click();
		Select s18 = new Select(GRADE18);
		//s18.selectByVisibleText("F");
		s18.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade18");

		wait1.until(ExpectedConditions.visibilityOf(GRADE19));
		scrollToElement(GRADE19);
		GRADE19.click();
		Select s19 = new Select(GRADE19);
		//s19.selectByVisibleText("D");
		s19.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade19");

		wait1.until(ExpectedConditions.visibilityOf(GRADE20));
		scrollToElement(GRADE20);
		GRADE20.click();
		Select s20 = new Select(GRADE20);
		s20.selectByIndex(11);
		//s20.selectByVisibleText("F");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade20");


		wait1.until(ExpectedConditions.visibilityOf(GRADE21));
		scrollToElement(GRADE21);
		GRADE21.click();
		Select s21 = new Select(GRADE21);
		//s21.selectByVisibleText("D");
		s21.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade21");

		wait1.until(ExpectedConditions.visibilityOf(GRADE22));
		scrollToElement(GRADE22);
		GRADE22.click();
		Select s22 = new Select(GRADE22);
		//s22.selectByVisibleText("F");
		s22.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade22");

		wait1.until(ExpectedConditions.visibilityOf(GRADE23));
		scrollToElement(GRADE23);
		GRADE23.click();
		Select s23 = new Select(GRADE23);
		//s23.selectByVisibleText("D");
		s23.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade23");

		wait1.until(ExpectedConditions.visibilityOf(GRADE24));
		scrollToElement(GRADE24);
		GRADE24.click();
		Select s24 = new Select(GRADE24);
		//s24.selectByVisibleText("F");
		s24.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade24");


		wait1.until(ExpectedConditions.visibilityOf(GRADE25));
		scrollToElement(GRADE25);
		GRADE25.click();
		Select s25 = new Select(GRADE25);
		//s25.selectByVisibleText("D");
		s25.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade25");


		wait1.until(ExpectedConditions.visibilityOf(GRADE26));
		scrollToElement(GRADE26);
		GRADE26.click();
		Select s26 = new Select(GRADE26);
		//s26.selectByVisibleText("F");
		s26.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade26");


		wait1.until(ExpectedConditions.visibilityOf(GRADE27));
		scrollToElement(GRADE27);
		GRADE27.click();
		Select s27 = new Select(GRADE27);
		//s27.selectByVisibleText("D");
		s27.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade27");


		wait1.until(ExpectedConditions.visibilityOf(GRADE28));
		scrollToElement(GRADE28);
		GRADE28.click();
		Select s28 = new Select(GRADE28);
		//s28.selectByVisibleText("D");
		s28.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade28");


		wait1.until(ExpectedConditions.visibilityOf(GRADE29));
		scrollToElement(GRADE29);
		GRADE29.click();
		Select s29 = new Select(GRADE29);
		//s29.selectByVisibleText("F");
		s29.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade29");


		wait1.until(ExpectedConditions.visibilityOf(GRADE30));
		scrollToElement(GRADE30);
		GRADE30.click();
		Select s30 = new Select(GRADE30);
		//s30.selectByVisibleText("D");
		s30.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade30");	


		wait1.until(ExpectedConditions.visibilityOf(GRADE31));
		scrollToElement(GRADE31);
		GRADE31.click();
		Select s31 = new Select(GRADE31);
		//s31.selectByVisibleText("F");
		s31.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade31");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE32));
		scrollToElement(GRADE32);
		GRADE32.click();
		Select s32 = new Select(GRADE32);
		//s32.selectByVisibleText("D");
		s32.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade32");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE33));
		scrollToElement(GRADE33);
		GRADE33.click();
		Select s33 = new Select(GRADE33);
		//s33.selectByVisibleText("F");
		s33.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade33");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE34));
		scrollToElement(GRADE34);
		GRADE34.click();
		Select s34 = new Select(GRADE34);
		//s34.selectByVisibleText("D");
		s34.selectByIndex(10);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade34");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE35));
		scrollToElement(GRADE35);
		GRADE35.click();
		Select s35 = new Select(GRADE35);
		//s35.selectByVisibleText("F");
		s35.selectByIndex(11);
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade35");	

	}
	public void SelectConform2() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
		scrollToElement(CheckConformity);
		highLightElement(driver,CheckConformity);
		CheckConformity.click();

		Thread.sleep(3000);



	}
	public void CheckTheAttriutes() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);

		softAssert.assertEquals(CourseConformityReport.isDisplayed(), true);
		System.out.println("CourseConformityReport  Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(CourseConformityReport));
		String S1= CourseConformityReport.getText();
		System.out.println("The CourseConformityReport Massage At GradePage =  "+S1);
		Thread.sleep(1000);

		softAssert.assertEquals(CourseConformityReportMessage.isDisplayed(), true);
		System.out.println("CourseConformityReportMessage is display");
		wait1.until(ExpectedConditions.visibilityOf(CourseConformityReportMessage));
		String S2= CourseConformityReportMessage.getText();
		System.out.println("The  CourseConformityReport Massage At GradePage =  "+S2);
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(Submits));
		highLightElement(driver,Submits);
		Submits.click();
		Thread.sleep(3000);
		
		wait1.until(ExpectedConditions.visibilityOf(OK));
		highLightElement(driver,OK);
		OK.click();
		Thread.sleep(3000);
		
		wait1.until(ExpectedConditions.visibilityOf(Back));
		highLightElement(driver,Back);
		Back.click();
		Thread.sleep(3000);
		
		


	}
	public void Assignconformityreporttable2() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);



		wait1.until(ExpectedConditions.visibilityOf(GRADE1));
		GRADE1.click();
		Select s1 = new Select(GRADE1);
		s1.selectByVisibleText("A+");;
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade1");

		wait1.until(ExpectedConditions.visibilityOf(GRADE2));
		scrollToElement(GRADE2);
		GRADE2.click();
		Select s2 = new Select(GRADE2);
		s2.selectByVisibleText("A+");;
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade2");


		wait1.until(ExpectedConditions.visibilityOf(GRADE3));
		scrollToElement(GRADE3);
		GRADE3.click();
		Select s3 = new Select(GRADE3);
		s3.selectByVisibleText("A+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade3");

		wait1.until(ExpectedConditions.visibilityOf(GRADE4));
		scrollToElement(GRADE4);
		GRADE4.click();
		Select s4 = new Select(GRADE4);
		s4.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade4");


		wait1.until(ExpectedConditions.visibilityOf(GRADE5));
		scrollToElement(GRADE5);
		GRADE5.click();
		Select s5 = new Select(GRADE5);
		s5.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade5");


		wait1.until(ExpectedConditions.visibilityOf(GRADE6));
		scrollToElement(GRADE6);
		GRADE6.click();
		Select s6 = new Select(GRADE6);
		s6.selectByVisibleText("A");
		Thread.sleep(1000);



		wait1.until(ExpectedConditions.visibilityOf(GRADE7));
		scrollToElement(GRADE7);
		GRADE7.click();
		Select s7 = new Select(GRADE7);
		s7.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade7");

		wait1.until(ExpectedConditions.visibilityOf(GRADE8));
		scrollToElement(GRADE8);
		GRADE8.click();
		Select s8 = new Select(GRADE8);
		s8.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade8");

		wait1.until(ExpectedConditions.visibilityOf(GRADE9));
		scrollToElement(GRADE9);
		GRADE9.click();
		Select s9 = new Select(GRADE9);
		s9.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade9");

		wait1.until(ExpectedConditions.visibilityOf(GRADE10));
		scrollToElement(GRADE10);
		GRADE10.click();
		Select s10 = new Select(GRADE10);
		s10.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade10");

		wait1.until(ExpectedConditions.visibilityOf(GRADE11));
		scrollToElement(GRADE11);
		GRADE11.click();
		Select s11 = new Select(GRADE11);
		s11.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade11");

		wait1.until(ExpectedConditions.visibilityOf(GRADE12));
		scrollToElement(GRADE12);
		GRADE12.click();
		Select s12 = new Select(GRADE12);
		s12.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade12");

		wait1.until(ExpectedConditions.visibilityOf(GRADE13));
		scrollToElement(GRADE13);
		GRADE13.click();
		Select s13 = new Select(GRADE13);
		s13.selectByVisibleText("B-");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade13");


		wait1.until(ExpectedConditions.visibilityOf(GRADE14));
		scrollToElement(GRADE14);
		GRADE14.click();
		Select s14 = new Select(GRADE14);
		s14.selectByVisibleText("B-");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade14");

		wait1.until(ExpectedConditions.visibilityOf(GRADE15));
		scrollToElement(GRADE15);
		GRADE15.click();
		Select s15 = new Select(GRADE15);
		s15.selectByVisibleText("B-");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade15");

		wait1.until(ExpectedConditions.visibilityOf(GRADE16));
		scrollToElement(GRADE16);
		GRADE16.click();
		Select s16 = new Select(GRADE16);
		s16.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade16");

		wait1.until(ExpectedConditions.visibilityOf(GRADE17));
		scrollToElement(GRADE17);
		GRADE17.click();
		Select s17 = new Select(GRADE17);
		s17.selectByVisibleText("B+");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(GRADE18));
		scrollToElement(GRADE18);
		GRADE18.click();
		Select s18 = new Select(GRADE18);
		s18.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade18");

		wait1.until(ExpectedConditions.visibilityOf(GRADE19));
		scrollToElement(GRADE19);
		GRADE19.click();
		Select s19 = new Select(GRADE19);
		s19.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade19");

		wait1.until(ExpectedConditions.visibilityOf(GRADE20));
		scrollToElement(GRADE20);
		GRADE20.click();
		Select s20 = new Select(GRADE20);
		s20.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade20");


		wait1.until(ExpectedConditions.visibilityOf(GRADE21));
		scrollToElement(GRADE21);
		GRADE21.click();
		Select s21 = new Select(GRADE21);
		s21.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade21");

		wait1.until(ExpectedConditions.visibilityOf(GRADE22));
		scrollToElement(GRADE22);
		GRADE22.click();
		Select s22 = new Select(GRADE22);
		s22.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade22");

		wait1.until(ExpectedConditions.visibilityOf(GRADE23));
		scrollToElement(GRADE23);
		GRADE23.click();
		Select s23 = new Select(GRADE23);
		s23.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade23");

		wait1.until(ExpectedConditions.visibilityOf(GRADE24));
		scrollToElement(GRADE24);
		GRADE24.click();
		Select s24 = new Select(GRADE24);
		s24.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade24");


		wait1.until(ExpectedConditions.visibilityOf(GRADE25));
		scrollToElement(GRADE25);
		GRADE25.click();
		Select s25 = new Select(GRADE25);
		s25.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade25");


		wait1.until(ExpectedConditions.visibilityOf(GRADE26));
		scrollToElement(GRADE26);
		GRADE26.click();
		Select s26 = new Select(GRADE26);
		s26.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade26");


		wait1.until(ExpectedConditions.visibilityOf(GRADE27));
		scrollToElement(GRADE27);
		GRADE27.click();
		Select s27 = new Select(GRADE27);
		s27.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade27");


		wait1.until(ExpectedConditions.visibilityOf(GRADE28));
		scrollToElement(GRADE28);
		GRADE28.click();
		Select s28 = new Select(GRADE28);
		s28.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade28");


		wait1.until(ExpectedConditions.visibilityOf(GRADE29));
		scrollToElement(GRADE29);
		GRADE29.click();
		Select s29 = new Select(GRADE29);
		s29.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade29");


		wait1.until(ExpectedConditions.visibilityOf(GRADE30));
		scrollToElement(GRADE30);
		GRADE30.click();
		Select s30 = new Select(GRADE30);
		s30.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade30");	


		wait1.until(ExpectedConditions.visibilityOf(GRADE31));
		scrollToElement(GRADE31);
		GRADE31.click();
		Select s31 = new Select(GRADE31);
		s31.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade31");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE32));
		scrollToElement(GRADE32);
		GRADE32.click();
		Select s32 = new Select(GRADE32);
		s32.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade32");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE33));
		scrollToElement(GRADE33);
		GRADE33.click();
		Select s33 = new Select(GRADE33);
		s33.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade33");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE34));
		scrollToElement(GRADE34);
		GRADE34.click();
		Select s34 = new Select(GRADE34);
		s34.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade34");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE35));
		scrollToElement(GRADE35);
		GRADE35.click();
		Select s35 = new Select(GRADE35);
		s35.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade35");	

	}
	public void SelectConform3() throws InterruptedException 
	{
	    WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
		scrollToElement(CheckConformity);
		highLightElement(driver,CheckConformity);
		CheckConformity.click();
		Thread.sleep(3000);
	}
	public void CheckTheAttriutesAfterApplyDifferentGrades() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);

		softAssert.assertEquals(CourseConformityReportGreen.isDisplayed(), true);
		System.out.println(" CourseConformityReportGreen Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(CourseConformityReportGreen));
		String S1=CourseConformityReportGreen.getText();
		System.out.println("The CourseConformityReport Massage At GradePage =  "+S1);
		Thread.sleep(1000);

		softAssert.assertEquals(CourseConformityReportMessage2.isDisplayed(), true);
		System.out.println("CourseConformityReportMessage2 is display");
		wait1.until(ExpectedConditions.visibilityOf(CourseConformityReportMessage2));
		String S2= CourseConformityReportMessage2.getText();
		System.out.println("The  CourseConformityReport Massage At GradePage =  "+S2);
		Thread.sleep(1000);
	}

	public void PrintGradeMassage() throws InterruptedException {


		WebDriverWait wait1 = new WebDriverWait(driver,60);
		softAssert.assertEquals(GradeAlertMassage.isDisplayed(), true);
		System.out.println("GradeAlertMassage is display");
		wait1.until(ExpectedConditions.visibilityOf(GradeAlertMassage));
		String S0= GradeAlertMassage.getText();
		System.out.println("The GradeAlert  Massage At GradePage =  "+S0);
		Thread.sleep(1000);


		wait1.until(ExpectedConditions.visibilityOf(Submits));
		highLightElement(driver,Submits);
		Submits.click();
		Thread.sleep(3000);

	}
	public void clickCancle() throws InterruptedException {


		softAssert.assertEquals(OK.isDisplayed(), true);
		System.out.println("Back Attribute is present");

		WebDriverWait wait1 = new WebDriverWait(driver,120);
		wait1.until(ExpectedConditions.visibilityOf(OK));
		OK.click();
		Thread.sleep(4000);
		
		
		wait1.until(ExpectedConditions.elementToBeClickable(Cancle));
		Cancle.click();
		Thread.sleep(4000);
		


	}
	public void ClickonCriminaljusiceCourse() throws InterruptedException 
	{
		
		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(studentTab));
		studentTab.click();
		Thread.sleep(3000);
		
		
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		CourseTab.click();
		Thread.sleep(3000);
		
		
		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("16050");
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(CriminalJasticeCourse));
		CriminalJasticeCourse.click();
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(Emulation));
		Emulation.click();
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(AssignButton1));
		AssignButton1.click();
		Thread.sleep(1000);		
		
	}
	public void EnterDifferentGrades() throws InterruptedException 
	{


		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GRADE1));
		GRADE1.click();
		Select s1 = new Select(GRADE1);
		s1.selectByVisibleText("A+");;
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade1");

		wait1.until(ExpectedConditions.visibilityOf(GRADE2));
		scrollToElement(GRADE2);
		GRADE2.click();
		Select s2 = new Select(GRADE2);
		s2.selectByVisibleText("A+");;
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade2");


		wait1.until(ExpectedConditions.visibilityOf(GRADE3));
		scrollToElement(GRADE3);
		GRADE3.click();
		Select s3 = new Select(GRADE3);
		s3.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade3");

		wait1.until(ExpectedConditions.visibilityOf(GRADE4));
		scrollToElement(GRADE4);
		GRADE4.click();
		Select s4 = new Select(GRADE4);
		s4.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade4");


		wait1.until(ExpectedConditions.visibilityOf(GRADE5));
		scrollToElement(GRADE5);
		GRADE5.click();
		Select s5 = new Select(GRADE5);
		s5.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade5");


		wait1.until(ExpectedConditions.visibilityOf(GRADE6));
		scrollToElement(GRADE6);
		GRADE6.click();
		Select s6 = new Select(GRADE6);
		s6.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade6");

		wait1.until(ExpectedConditions.visibilityOf(GRADE7));
		scrollToElement(GRADE7);
		GRADE7.click();
		Select s7 = new Select(GRADE7);
		s7.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade7");

		wait1.until(ExpectedConditions.visibilityOf(GRADE8));
		scrollToElement(GRADE8);
		GRADE8.click();
		Select s8 = new Select(GRADE8);
		s8.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade8");

		wait1.until(ExpectedConditions.visibilityOf(GRADE9));
		scrollToElement(GRADE9);
		GRADE9.click();
		Select s9 = new Select(GRADE9);
		s9.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade9");

		wait1.until(ExpectedConditions.visibilityOf(GRADE10));
		scrollToElement(GRADE10);
		GRADE10.click();
		Select s10 = new Select(GRADE10);
		s10.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade10");

		wait1.until(ExpectedConditions.visibilityOf(GRADE11));
		scrollToElement(GRADE11);
		GRADE11.click();
		Select s11 = new Select(GRADE11);
		s11.selectByVisibleText("A");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade11");

		wait1.until(ExpectedConditions.visibilityOf(GRADE12));
		scrollToElement(GRADE12);
		GRADE12.click();
		Select s12 = new Select(GRADE12);
		s12.selectByVisibleText("A-");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade12");

		wait1.until(ExpectedConditions.visibilityOf(GRADE13));
		scrollToElement(GRADE13);
		GRADE13.click();
		Select s13 = new Select(GRADE13);
		s13.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade13");


		wait1.until(ExpectedConditions.visibilityOf(GRADE14));
		scrollToElement(GRADE14);
		GRADE14.click();
		Select s14 = new Select(GRADE14);
		s14.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade14");

		wait1.until(ExpectedConditions.visibilityOf(GRADE15));
		scrollToElement(GRADE15);
		GRADE15.click();
		Select s15 = new Select(GRADE15);
		s15.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade15");

		wait1.until(ExpectedConditions.visibilityOf(GRADE16));
		scrollToElement(GRADE16);
		GRADE16.click();
		Select s16 = new Select(GRADE16);
		s16.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade16");

		wait1.until(ExpectedConditions.visibilityOf(GRADE17));
		scrollToElement(GRADE17);
		GRADE17.click();
		Select s17 = new Select(GRADE17);
		s17.selectByVisibleText("B");
		Thread.sleep(1000);

		wait1.until(ExpectedConditions.visibilityOf(GRADE18));
		scrollToElement(GRADE18);
		GRADE18.click();
		Select s18 = new Select(GRADE18);
		s18.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade18");

		wait1.until(ExpectedConditions.visibilityOf(GRADE19));
		scrollToElement(GRADE19);
		GRADE19.click();
		Select s19 = new Select(GRADE19);
		s19.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade19");

		wait1.until(ExpectedConditions.visibilityOf(GRADE20));
		scrollToElement(GRADE20);
		GRADE20.click();
		Select s20 = new Select(GRADE20);
		s20.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade20");

		wait1.until(ExpectedConditions.visibilityOf(GRADE21));
		scrollToElement(GRADE21);
		GRADE21.click();
		Select s21 = new Select(GRADE21);
		s21.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade21");

		wait1.until(ExpectedConditions.visibilityOf(GRADE22));
		scrollToElement(GRADE22);
		GRADE22.click();
		Select s22 = new Select(GRADE22);
		s22.selectByVisibleText("B");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade22");

		wait1.until(ExpectedConditions.visibilityOf(GRADE23));
		scrollToElement(GRADE23);
		GRADE23.click();
		Select s23 = new Select(GRADE23);
		s23.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade23");

		wait1.until(ExpectedConditions.visibilityOf(GRADE24));
		scrollToElement(GRADE24);
		GRADE24.click();
		Select s24 = new Select(GRADE24);
		s24.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade24");


		wait1.until(ExpectedConditions.visibilityOf(GRADE25));
		scrollToElement(GRADE25);
		GRADE25.click();
		Select s25 = new Select(GRADE25);
		s25.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade25");


		wait1.until(ExpectedConditions.visibilityOf(GRADE26));
		scrollToElement(GRADE26);
		GRADE26.click();
		Select s26 = new Select(GRADE26);
		s26.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade26");


		wait1.until(ExpectedConditions.visibilityOf(GRADE27));
		scrollToElement(GRADE27);
		GRADE27.click();
		Select s27 = new Select(GRADE27);
		s27.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade27");


		wait1.until(ExpectedConditions.visibilityOf(GRADE28));
		scrollToElement(GRADE28);
		GRADE28.click();
		Select s28 = new Select(GRADE28);
		s28.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade28");


		wait1.until(ExpectedConditions.visibilityOf(GRADE29));
		scrollToElement(GRADE29);
		GRADE29.click();
		Select s29 = new Select(GRADE29);
		s29.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade29");


		wait1.until(ExpectedConditions.visibilityOf(GRADE30));
		scrollToElement(GRADE30);
		GRADE30.click();
		Select s30 = new Select(GRADE30);
		s30.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade30");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE31));
		scrollToElement(GRADE31);
		GRADE31.click();
		Select s31 = new Select(GRADE31);
		s31.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade31");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE32));
		scrollToElement(GRADE32);
		GRADE32.click();
		Select s32 = new Select(GRADE32);
		s32.selectByVisibleText("B+");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade32");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE33));
		scrollToElement(GRADE33);
		GRADE33.click();
		Select s33 = new Select(GRADE33);
		s33.selectByVisibleText("B-");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade33");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE34));
		scrollToElement(GRADE34);
		GRADE34.click();
		Select s34 = new Select(GRADE34);
		s34.selectByVisibleText("B-");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade34");	

		wait1.until(ExpectedConditions.visibilityOf(GRADE35));
		scrollToElement(GRADE35);
		GRADE35.click();
		Select s35 = new Select(GRADE35);
		s35.selectByVisibleText("B-");
		Thread.sleep(1000);
		System.out.println("Apply Grade in Grade35");	
		
		wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
		scrollToElement(CheckConformity);
		highLightElement(driver,CheckConformity);
		CheckConformity.click();

		Thread.sleep(3000);

	}
	public void CheckTheAttriutesAfterApplyDifferentGradesAll() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);

		softAssert.assertEquals(ConformityReportGreen.isDisplayed(), true);
		System.out.println("CourseConformityReportGreen Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(ConformityReportGreen));
		String S1=ConformityReportGreen.getText();
		System.out.println("The CourseConformityReport Massage At GradePage =  "+S1);
		Thread.sleep(1000);

	}

	public void PrintGradeMassageGreen() throws InterruptedException {


		WebDriverWait wait1 = new WebDriverWait(driver,60);
		softAssert.assertEquals(GradeAlertMassage.isDisplayed(), true);
		System.out.println("GradeAlertMassage is display");
		wait1.until(ExpectedConditions.visibilityOf(GradeAlertMassage));
		String S0= GradeAlertMassage.getText();
		System.out.println("The GradeAlert  Massage At GradePage =  "+S0);
		Thread.sleep(1000);
	}
	public void CheckTableAtributesBeforeSumbitingGrades() 
	{
		scrollToElement(EnrollStudent);
		softAssert.assertEquals(EnrollStudent.isDisplayed(), true);
		softAssert.assertEquals(Grades.isDisplayed(), true);
		softAssert.assertEquals(Count.isDisplayed(), true);
		softAssert.assertEquals(Recommented.isDisplayed(), true);
		softAssert.assertEquals(Disribution.isDisplayed(), true);
		softAssert.assertEquals(GPA.isDisplayed(), true);
		softAssert.assertEquals(ClassGPA.isDisplayed(), true);
		softAssert.assertEquals(EnrolledText.isDisplayed(), true);
		softAssert.assertEquals(MaxGPAText.isDisplayed(), true);
		softAssert.assertEquals(ActualMeanText.isDisplayed(), true);

	}
	public void GetTextFromAttributes() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		softAssert.assertEquals(EnrolledText.isDisplayed(), true);
		System.out.println("EnrolledText Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(EnrolledText));
		String S1=EnrolledText.getText();
		System.out.println("The EnrolledText At GradePage =  "+S1);
		Thread.sleep(1000);

		softAssert.assertEquals(MaxGPAText.isDisplayed(), true);
		System.out.println("MaxGPAText Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(MaxGPAText));
		String S2=MaxGPAText.getText();
		System.out.println("The MaxGPAText At GradePage =  "+S2);
		Thread.sleep(1000);

		softAssert.assertEquals(ActualDistributionScore1.isDisplayed(), true);
		System.out.println("ActualDistributionScore1 Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(ActualDistributionScore1));
		String S3=ActualDistributionScore1.getText();
		System.out.println("The ActualDistributionScore1 At GradePage =  "+S3);
		Thread.sleep(1000);

		softAssert.assertEquals(ActualDistributionScore2.isDisplayed(), true);
		System.out.println("ActualDistributionScore2 Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(ActualDistributionScore2));
		String S4=ActualDistributionScore2.getText();
		System.out.println("The MaxGPAText At GradePage =  "+S4);
		Thread.sleep(1000);

		softAssert.assertEquals(ActualDistributionScore3.isDisplayed(), true);
		System.out.println(" ActualDistributionScore3 Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(ActualDistributionScore3));
		String S5=ActualDistributionScore3.getText();
		System.out.println("The ActualDistributionScore3 At GradePage =  "+S5);
		Thread.sleep(1000);

		softAssert.assertEquals(ActualDistributionScore4.isDisplayed(), true);
		System.out.println("ActualDistributionScore4 Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(ActualDistributionScore4));
		String S6=ActualDistributionScore4.getText();
		System.out.println("The ActualDistributionScore4 At GradePage =  "+S6);
		Thread.sleep(1000);
	}
	public void PrintWholeTable() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		softAssert.assertEquals(WholeTable.isDisplayed(), true);
		System.out.println("WholeTable Attribute is present");
		wait1.until(ExpectedConditions.visibilityOf(WholeTable));
		String S6=WholeTable.getText();
		System.out.println("The ActualGradeTable At GradePage =  "+S6);
		Thread.sleep(1000);

	}

	public void SubmitGrades() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Submits));
		scrollToElement(Submits);
		highLightElement(driver,Submits);
		Submits.click();
		Thread.sleep(3000);

	}
	public void clickYeslinky() throws InterruptedException {


		softAssert.assertEquals(OK.isDisplayed(), true);
		System.out.println("Back Attribute is present");

		WebDriverWait wait1 = new WebDriverWait(driver,120);
		wait1.until(ExpectedConditions.elementToBeClickable(Yes));
		Yes.click();
		Thread.sleep(4000);
	}

	public void clickCanclelink() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver,120);
		wait1.until(ExpectedConditions.elementToBeClickable(Cancle));
		Cancle.click();
		Thread.sleep(6000);
	}
	public void GotoCourseTab() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
		
		wait1.until(ExpectedConditions.visibilityOf(stu));
		stu.click();
		Thread.sleep(6000);

		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		CourseTab.click();
		Thread.sleep(6000);
	}
	public void CheckForCourse() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("16050");
		Thread.sleep(2000);
	}
	public void CheckCourseLink() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		
		wait1.until(ExpectedConditions.elementToBeClickable(CriminalJasticeCourse));
		
		staleElementClick(6,CriminalJasticeCourse,30);
		//CriminalJasticeCourse.click();
		Thread.sleep(3000);
	}
 public void CheckForConformity() throws InterruptedException 
 {
	 WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
		
		highLightElement(driver,CheckConformity);
		CheckConformity.click();

		Thread.sleep(3000);
}
 public void  AttributesVerification() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Back));
		softAssert.assertEquals(Back.isDisplayed(), true);
		System.out.println("Back Attribute is present");

		softAssert.assertEquals(CourseName.isDisplayed(), true);		
		String R1 = CourseName.getText();
		System.out.println(R1);
		Assert.assertEquals(R1,"Criminal Justice (LAWJ-0003-006) 16050");


		System.out.println("All the attributes are display");

	}
	public void CheckForAttribute2() 
	{

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,300)");

		
	}
	
	 public void ApprovedGrades() throws InterruptedException 
	 {
		 WebDriverWait wait1 = new WebDriverWait(driver,180);
			wait1.until(ExpectedConditions.visibilityOf(ApprovedButton));
			scrollToElement(ApprovedButton);
			highLightElement(driver,ApprovedButton);
			ApprovedButton.click();
			Thread.sleep(3000);
	 }
	 public void clickYeslink() throws InterruptedException {

			WebDriverWait wait1 = new WebDriverWait(driver,120);
			
			wait1.until(ExpectedConditions.elementToBeClickable(Yes));
			Yes.click();
			Thread.sleep(4000);
		}
	 public void CheckForGradingSetus() throws InterruptedException 
	 {
		    WebDriverWait wait1 = new WebDriverWait(driver,60);
			wait1.until(ExpectedConditions.visibilityOf(Search));
			Search.sendKeys("16050");
			Thread.sleep(3000);
			
			wait1.until(ExpectedConditions.visibilityOf(GradeSteusFor));
			softAssert.assertEquals(GradeSteusFor.isDisplayed(), true);
			String R2 = GradeSteusFor.getText();
			System.out.println("The Recent note section =  "+R2);
			Thread.sleep(1000);		
	 }
	 public void CheckForConformity2() throws InterruptedException 
	 {
			 
		 WebDriverWait wait1 = new WebDriverWait(driver,60);
		   wait1.until(ExpectedConditions.elementToBeClickable(CriminalJasticeCourse));
			CriminalJasticeCourse.click();
			Thread.sleep(1000);
		 
			wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
			
			highLightElement(driver,CheckConformity);
			CheckConformity.click();

			Thread.sleep(3000);
	}
	public void GotoBack() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Back));
		Back.click();
		Thread.sleep(1000);
		
	}
	public void EmulateCourse() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Emulation));
		Emulation.click();
		Thread.sleep(1000);
	}
	public void CheckViewGrades() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(ViewGrades));
		scrollToElement(ViewGrades);
		ViewGrades.click();
		Thread.sleep(1000);
	} 
	public void  AttributesVerification3() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Back));
		softAssert.assertEquals(Back.isDisplayed(), true);
		System.out.println("Back Attribute is present");

		softAssert.assertEquals(IDName.isDisplayed(), true);
		System.out.println("IDName Attribute is present");

        //softAssert.assertEquals(RawScore.isDisplayed(), true);
		//System.out.println("RawScore is display");

		//softAssert.assertEquals(LetterGrade.isDisplayed(), true);
		//System.out.println("LetterGrade is display");

		//softAssert.assertEquals(Notes.isDisplayed(), true);
		//System.out.println("Notes is display");

		//softAssert.assertEquals(BestPaper.isDisplayed(), true);
		//System.out.println("BestPaper is display");

		//softAssert.assertEquals(PublishLibrary.isDisplayed(), true);
		//System.out.println("PublishLibrabry is display");
		softAssert.assertEquals(Emulation.isEnabled(), true);
		System.out.println("Emulation is display");

		softAssert.assertEquals(CourseName.isDisplayed(), true);		
		String R1 = CourseName.getText();
		System.out.println(R1);
		Assert.assertEquals(R1,"Criminal Justice (LAWJ-0003-006) 16050");

		
		System.out.println("All the attributes are display");

	}
	public void CheckForConformity3() throws InterruptedException 
	 {
		 WebDriverWait wait1 = new WebDriverWait(driver,60);
			wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
			
			highLightElement(driver,CheckConformity);
			CheckConformity.click();

			Thread.sleep(3000);
	}
	public void CancleLink() throws InterruptedException 
	{
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver,60);

		wait1.until(ExpectedConditions.elementToBeClickable(Cancle));

		Cancle.click();

		Thread.sleep(1000);

	}
	public void GoBack() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
		
		wait1.until(ExpectedConditions.visibilityOf(stu));
		stu.click();
		Thread.sleep(6000);

		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		CourseTab.click();
		Thread.sleep(6000);

		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("16050");
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(CriminalJasticeCourse));
		CriminalJasticeCourse.click();
		Thread.sleep(1000);
		
	}
	 public void CheckForConformity4() throws InterruptedException 
	 {
		 WebDriverWait wait1 = new WebDriverWait(driver,60);
			wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
			
			highLightElement(driver,CheckConformity);
			CheckConformity.click();

			Thread.sleep(3000);
	}
	public void DeactivateButton() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Deactivate));
		
		highLightElement(driver,Deactivate);
		Deactivate.click();

		Thread.sleep(3000);
	}
	public void CheckNoButton() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		
	    
	    wait1.until(ExpectedConditions.visibilityOf(No));
	    No.click();

		Thread.sleep(3000);
	}
	public void DeactivateButton2() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Deactivate));
		
		highLightElement(driver,Deactivate);
		Deactivate.click();

		Thread.sleep(3000);
	}
	public void CheckYesButton() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		
	    wait1.until(ExpectedConditions.visibilityOf(Yes));
	    Yes.click();

		Thread.sleep(3000);
	}
	


}
