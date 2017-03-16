package kr.or.dgit.mybatis_dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.services.UserPicService;

public class UserPicServiceTest {
	private static UserPicService userPicService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userPicService = new UserPicService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userPicService = null;
	}
	
	@Test
	public void aTestInsertUserPic() {
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir")+"\\DataFiles\\eric.jpg");		//파일불러오기
		try(InputStream is = new FileInputStream(file);) {
			pic = new byte[is.available()];		// 파일 크기 알아오기
			is.read(pic);		// 읽어와서 배열에 담기
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		UserPic userPic = new UserPic(1, "에릭", pic, "영어랩");		
		int res = userPicService.insertUserPic(userPic);
		Assert.assertEquals(1, res);		
	}

	@Test
	public void bTestFindUserPicById() {			
		UserPic userPic = userPicService.findUserPicById(1);
		byte[] pic = userPic.getPic();	// 이것을 파일로 만들어야한다.
		File file = new File(System.getProperty("user.dir")+"\\DownLoad\\에릭.jpg");
		
		try(OutputStream os = new FileOutputStream(file);) {
			os.write(pic);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Assert.assertNotNull(userPic);
	}
	
	

		
	
}


