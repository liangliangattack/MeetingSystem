package com.meeting.mapper;

import com.meeting.pojo.Friend;

import java.util.List;

public interface FriendMapper {
    List<Friend> queryAllFriend(Integer id);
}
