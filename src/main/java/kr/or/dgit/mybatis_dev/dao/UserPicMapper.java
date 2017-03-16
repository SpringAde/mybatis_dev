package kr.or.dgit.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public interface UserPicMapper {
	int insertUserPic(UserPic userPic);
	UserPic selectUserPicById(int id);
}
