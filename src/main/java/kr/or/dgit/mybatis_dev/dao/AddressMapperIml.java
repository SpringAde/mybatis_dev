package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Address;

public class AddressMapperIml implements AddressMapper {
	
	private String namespace="kr.or.dgit.mybatis_dev.dao.AddressMapper.";	
	private static final Log log = LogFactory.getLog(AddressMapper.class);
	
	private SqlSession sqlSession;		//선언
	
	public AddressMapperIml(SqlSession sqlSession) {		//생성자로 받기
		this.sqlSession = sqlSession;
	}	
	
	@Override
	public Address selectAddressByAddrIdAndState(String state, String zip) {
		log.debug("Address selectAddressByAddrIdAndState()");
		return sqlSession.getMapper(AddressMapper.class).selectAddressByAddrIdAndState(state, zip);
	}
	@Override
	public Address selectAddressByAddrIdAndStateForMap(Map<String, Object> param) {
		log.debug("Address selectAddressByAddrIdAndStateForMap()");
		return sqlSession.selectOne(namespace+"selectAddressByAddrIdAndStateForMap",param);
	}


	@Override
	public List<Address> selectAddressByAll(RowBounds rowBounds) {
		log.debug("selectAddressByAll()");
		return sqlSession.selectList(namespace+"selectAddressByAll",null, rowBounds);
	}	
}
