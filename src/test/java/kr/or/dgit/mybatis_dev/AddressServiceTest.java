package kr.or.dgit.mybatis_dev;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.services.AddressService;


public class AddressServiceTest {
	private static AddressService addressService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		addressService = new AddressService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		addressService = null;
	}

	@Test
	public void aTestSelectAddressByAddrIdAndState() {			
		Address address = addressService.selectAddressByAddrIdAndState("CA", "92110");
		Assert.assertNotNull(address);
	}
	
	
	@Test
	public void bTestSelectAddressByAddrIdAndStateForMap() {			
		Map<String, Object>param = new HashMap<>();
		param.put("state", "CA");
		param.put("zip", "92110");
		
		Address address = addressService.selectAddressByAddrIdAndStateForMap(param);
		Assert.assertNotNull(address);
	}
	
	@Test
	public void cTestSelectAddressByAll() {
		RowBounds rowBounds = new RowBounds(0, 3);
		List<Address> list = addressService.selectAddressByAll(rowBounds);
		Assert.assertNotNull(list);		
	}
}

