package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {
	
	Student selectStudentByNoForResultMap(Student student);		// 아이디로 사용
	List<Student> selectStudentByAllForResultMap();
	
	Map<String, Object> selectStudentByNoForHashMap(Student student);
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	
	Student selectStudentByNoWithAddress(Student student);	
	
		
	Student selectStudentByNoAssociation(Student student);
	
	int updateSetStudent(Student student); 		// 동적SQL set
	

}
