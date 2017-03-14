package kr.or.dgit.mybatis_dev;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)		// 이름 순으로 테스트

public class StudentServiceTest {
	
	private static StudentService StudentService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		StudentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		StudentService = null;
	}
	
	
	@Before			// 테스트 메소드 수행되기 전
	public void setUP(){
		System.out.println("setup()");
	}
		
	@After			// 테스트 메소드 수행한 후
	public void tearDown(){
		System.out.println("tearDown()");
	}
	
	
		
	@Test
	public void aTestselectStudentByNoForResultMap(){
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = StudentService.selectStudentByNoForResultMap(student);
		Assert.assertNotNull(selectStudent);
	}
	
	
	@Test 
	public void bselectStudentByAllForResultMap(){
		List<Student> lists = StudentService.selectStudentByAllForResultMap();
		List<Student> emptyLists = Collections.emptyList();
		Assert.assertNotEquals(emptyLists, lists);
	}
	
	
	
	}

	





	




