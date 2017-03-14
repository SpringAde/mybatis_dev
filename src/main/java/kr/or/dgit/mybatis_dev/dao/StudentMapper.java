package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {
	
	Student selectStudentByNoForResultMap(Student student);
	List<Student> selectStudentByAllForResultMap();
	
	Map<String, Object> selectStudentByNoForHashMap(Student student);
	List<Map<String, Object>> selectStudentByAllForHashMap();

}
