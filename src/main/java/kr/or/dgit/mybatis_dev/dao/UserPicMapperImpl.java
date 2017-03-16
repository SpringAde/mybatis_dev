package kr.or.dgit.mybatis_dev.dao;


import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public class UserPicMapperImpl implements UserPicMapper {
	
	private String namespace = "kr.or.dgit.mybatis_dev.dao.UserPicMapper.";	
	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);		
	private SqlSession sqlSession;		//선언	
	public UserPicMapperImpl(SqlSession sqlSession) {		//생성자로 받기
		this.sqlSession = sqlSession;
	}
	

	@Override
	public int insertUserPic(UserPic userPic) {
		log.debug("insertUserPic()");
		return sqlSession.insert(namespace+"insertUserPic", userPic);
	}

	@Override
	public UserPic selectUserPicById(int id) {
		log.debug("selectUserPicById()");
		return sqlSession.selectOne(namespace+"selectUserPicById", id);
	}

}
