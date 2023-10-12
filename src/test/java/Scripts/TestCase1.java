package Scripts;

import org.testng.annotations.Test;

import Generic_liberies.BaseClass;
import POM.DemoSkillraryAppPage;
import POM.SkillraryHomepage;
import POM.TestingPage;

public class TestCase1 extends BaseClass{
	@Test
public void tc1() throws Throwable {
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childbrowser(driver);
		DemoSkillraryAppPage dS=new DemoSkillraryAppPage(driver);
		utilities.dropDowns(dS.getCoursebtn(), pdata.getpropertyData("coursedd"));
		TestingPage tP= new TestingPage(driver);
		utilities.scrollBar(driver, tP.getFbIcon());
		tP.fbIconWebElement();
		
	}
}
