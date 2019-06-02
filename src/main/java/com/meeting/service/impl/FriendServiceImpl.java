package com.meeting.service.impl;

import com.meeting.mapper.FriendMapper;
import com.meeting.pojo.Friend;
import com.meeting.pojo.UserInfo;
import com.meeting.service.FriendService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("friendService")
public class FriendServiceImpl implements FriendService {

    @Autowired
    private FriendMapper friendMapper;

    @Override
    public List<Friend> queryAllFriend(@Param("id") Integer id) {
        List<Friend> friends = friendMapper.queryAllFriend(id);

        return friends;
    }

    @Override
    public boolean insertFriend(Map<String, Object> friend) {
        Friend friendInfo = new Friend();//好友关联表
        UserInfo friendUser = new UserInfo();//好友信息
        friendUser.setId((int)friend.get("friendId"));
        friendInfo.setUserId((int)friend.get("userId"));
        friendInfo.setFriendUser(friendUser);
        if (friendMapper.insertFrind(friendInfo)>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteFriend(Map<String, Object> friend) {
        Friend friendInfo = new Friend();//好友关联表
        UserInfo friendUser = new UserInfo();//好友信息
        friendUser.setId((int)friend.get("friendId"));
        friendInfo.setUserId((int)friend.get("userId"));
        friendInfo.setFriendUser(friendUser);
        if (friendMapper.deleteFriend(friendInfo)>0)
            return true;
        else
            return false;
    }

}
