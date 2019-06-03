package com.meeting.service;


import com.meeting.pojo.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * @ Date:2019/5/16
 * Auther:Mercer
 * Auther:麻前程
 */

public interface UserInfoService {
    List<UserInfo> queryUser();

    boolean login(Map<String, Object> userDto);

    boolean register(UserInfo userDto);

    UserInfo queryUserByPhone(Map<String, Object> userDto);
}
