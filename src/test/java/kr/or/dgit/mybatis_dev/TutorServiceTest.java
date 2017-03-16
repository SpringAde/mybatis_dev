package kr.or.dgit.mybatis_dev;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.TutorService;

public class TutorServiceTest {
	private static TutorService tutorService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorService = new TutorService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		tutorService = null;
	}

/*	@Test
	public void testFindTutorById() {			
		Tutor tutor = tutorService.findTutorById(1);
		Assert.assertNotNull(tutor);
	}
	*/
	
/*	@Test
	public void aTestInsertTutor() {			
		Tutor tutor = new Tutor(6, "momo", "momo@test.co.kr", Gender.MAIE);
		int res = tutorService.insertTutor(tutor);
		Assert.assertEquals(1, res);		
	}*/
		
	
}
