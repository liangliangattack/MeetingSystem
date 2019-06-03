package com.meeting.mapper;

import com.meeting.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ Date:2019/5/16
 * Auther:Mercer
 * Auther:麻前程
 */
public interface UserInfoMapper {
       List<UserInfo>  queryUser();
       int insertUser(UserInfo userInfo);

       UserInfo queryUserByPhone(@Param("phone") String phone);
}
