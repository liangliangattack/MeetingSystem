package com.meeting.service.impl;


import com.meeting.mapper.UserInfoMapper;
import com.meeting.pojo.UserInfo;
import com.meeting.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ Date:2019/5/16
 * Auther:Mercer
 * Auther:麻前程
 */
@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> queryUser() {
        return userInfoMapper.queryUser();
    }

    @Override
    public boolean login(Map<String, Object> userDto) {
        List<UserInfo> list = userInfoMapper.queryUser();
        for (int i =0;i<list.size();i++){
            if (userDto.get("phone").equals(list.get(i).getPhone())&&userDto.get("password").equals(list.get(i).getPassword())){
                return true;
            }
        }
       return false;
    }

    @Override
    public boolean register(UserInfo userDto) {
        if (userInfoMapper.insertUser(userDto)>0)
            return true;
        else
            return false;
    }


}
