package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.CourseService;

public class CourseServiceTest {
	private static CourseService courseService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = new CourseService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService = null;
	}
	
	@Test
	public void aTestSearchCourse() {			
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-05-01");
		
		List<Course>searchCourse = courseService.searchCourse(param);
		Assert.assertNotNull(searchCourse);
	}
	
	
	@Test
	public void bTestSearchChooseCourse() {			
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("searchBy", "Tutor");		
		
		List<Course> searchChooseCourse = courseService.searchChooseCourse(param);
		Assert.assertNotNull(searchChooseCourse);
		
		param.replace("searchBy", "CourseName");
		param.remove("tutorId");
		param.put("courseName", "%java%");
	
		searchChooseCourse = courseService.searchChooseCourse(param);
		Assert.assertNotNull(searchChooseCourse);
		
		param.remove("CourseName");
		param.remove("searchBy");
		searchChooseCourse = courseService.searchChooseCourse(param);
	}
	
	
	@Test
	public void cTestSearchWhereCourse() {			
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);		
		
		List<Course> searchWhereCourse = courseService.searchWhereCourse(param);
		Assert.assertNotNull(searchWhereCourse);		
	}
	
	
	@Test
	public void dTestSearchTrimCourse() {			
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);		
		
		List<Course> searchTrimCourse = courseService.searchTrimCourse(param);
	}
	
	
	@Test
	public void dTestSearchForEachCourse() {			
/*		List<Integer> tutorIds = new ArrayList<>();
		tutorIds.add(1);
//		tutorIds.add(2);		
		
		Map<String, Object> param = new HashMap<>();
		param.put("tutorIds", tutorIds);
//		param=null;
		
		List<Course> searchForEachCourse = courseService.searchForEachCourse(param);
		Assert.assertNotNull(searchForEachCourse);*/
		//
		
		Map<String, Object> param = null;
		List<Course> searchForEachCourse = courseService.searchForEachCourse(param);
		
		List<Integer> tutorIds = new ArrayList<>();
		tutorIds.add(2);
		
		param = new HashMap<String, Object>();
		param.put("tutorIds", tutorIds);
		
		searchForEachCourse = courseService.searchForEachCourse(param);
		
		tutorIds.add(1);
		searchForEachCourse = courseService.searchForEachCourse(param);
		Assert.assertNotNull(searchForEachCourse);
	}	
}




