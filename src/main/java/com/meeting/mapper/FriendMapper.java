package com.meeting.mapper;

import com.meeting.pojo.Friend;

import java.util.List;
import java.util.Map;

public interface FriendMapper {
    List<Friend> queryAllFriend(Integer id);

    int insertFrind(Friend friendInfo);

    int deleteFriend(Friend friendInfo);
}
