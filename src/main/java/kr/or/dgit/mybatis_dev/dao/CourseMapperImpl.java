package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.TutorService;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class CourseMapperImpl implements CourseMapper {		//service(블럭-dao조합)에서 하는 작업을 여기에서 한다. (다른방법)
	
	private String namespace="kr.or.dgit.mybatis_dev.dao.CourseMapper.";
	
	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);	
	
	private SqlSession sqlSession;		//선언
	public CourseMapperImpl(SqlSession sqlSession) {		//생성자로 받기
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Course> searchCourse(Map<String, Object> param) {
		log.debug("searchCourse()");		
			return sqlSession.selectList(namespace+"searchCourse", param);		
	}
	@Override
	public List<Course> searchChooseCourse(Map<String, Object> param) {
		log.debug("searchChooseCourse()");		
		return sqlSession.selectList(namespace+"searchChooseCourse", param);	
	}
	@Override
	public List<Course> searchWhereCourse(Map<String, Object> param) {
		log.debug("searchWhereCourse()");		
		return sqlSession.selectList(namespace+"searchWhereCourse", param);
	}
	@Override
	public List<Course> searchTrimCourse(Map<String, Object> param) {
		log.debug("searchTrimCourse()");		
		return sqlSession.selectList(namespace+"searchTrimCourse", param);
	}

	@Override
	public List<Course> searchForEachCourse(Map<String, Object> param) {
		log.debug("searchForEachCourse()");		
		return sqlSession.selectList(namespace+"searchForEachCourse", param);
	}
}



