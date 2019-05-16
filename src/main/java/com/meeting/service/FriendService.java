package com.meeting.service;



import com.meeting.pojo.Friend;

import java.util.List;

public interface FriendService {
    List<Friend> queryAllFriend(Integer id);
}
