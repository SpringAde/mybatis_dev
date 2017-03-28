package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import kr.or.dgit.mybatis_dev.dto.Address;

public interface AddressMapper {
	Address selectAddressByAddrIdAndState(String state, String zip);
	Address selectAddressByAddrIdAndStateForMap(Map<String, Object> param);
	
	List<Address> selectAddressByAll(RowBounds rowBounds);
	
}

