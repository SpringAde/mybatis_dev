package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.AddressMapper;
import kr.or.dgit.mybatis_dev.dao.AddressMapperIml;
import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class AddressService {	
	public Address selectAddressByAddrIdAndState(String state, String zip){		
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			AddressMapper addressMapper = new AddressMapperIml(sqlSession);
			return addressMapper.selectAddressByAddrIdAndState(state, zip);
		}	
	}
	
	public Address selectAddressByAddrIdAndStateForMap (Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			AddressMapper addressMapper = new AddressMapperIml(sqlSession);
			return addressMapper.selectAddressByAddrIdAndStateForMap(param);
		}	
	}
	
	public List<Address> selectAddressByAll (RowBounds rowBounds){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			AddressMapper addressMapper = new AddressMapperIml(sqlSession);
			return addressMapper.selectAddressByAll(rowBounds);
		}	
	}	
}


