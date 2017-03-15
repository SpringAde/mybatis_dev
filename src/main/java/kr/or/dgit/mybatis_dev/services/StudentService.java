package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.spi.LoggerFactory;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final Log log = LogFactory.getLog(StudentService.class);	
	private String namespace="kr.or.dgit.mybatis_dev.dao.StudentMapper";
	
	
	
	public Student selectStudentByNoForResultMap(Student student){
		log.debug("selectStudentByNoForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){			
			return sqlSession.selectOne(namespace+".selectStudentByNoForResultMap", student);
		}		
	}
	
	public List<Student> selectStudentByAllForResultMap(){
		log.debug("selectStudentByNoForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace+".selectStudentByAllForResultMap");
		}
	}
	
	
	
	/*****************************************************************/
	
	public Map<String, Object> selectStudentByNoForHashMap(Student student){
		log.debug("selectStudentByNoForHashMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){			
			return sqlSession.selectOne(namespace+".selectStudentByNoForHashMap", student);
		}		
	}
	
	public List<Map<String, Object>> selectStudentByAllForHashMap(){
		log.debug("selectStudentByAllForHashMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace+".selectStudentByAllForHashMap");
		}
	}
	
	
	public Student selectStudentByNoWithAddress (Student student){
		log.debug("selectStudentByNoWithAddress()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){			
			return sqlSession.selectOne(namespace+".selectStudentByNoWithAddress", student);
		}
	}	
	
	
	
	
	public Student selectStudentByNoAssociation(Student student){
		log.debug("selectStudentByNoAssociation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){			
			return sqlSession.selectOne(namespace+".selectStudentByNoAssociation", student);
		}
	}
	
	/*****************************************************************/
	
	public int updateSetStudent(Student student){
		log.debug("updateSetStudent()");
		int res = -1;
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){			
			 res = sqlSession.update(namespace+".updateSetStudent", student);
		}
		return res;
	}
	
}














