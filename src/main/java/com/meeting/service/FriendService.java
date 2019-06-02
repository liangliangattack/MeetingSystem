package com.meeting.service;



import com.meeting.pojo.Friend;

import java.util.List;
import java.util.Map;

public interface FriendService {
    List<Friend> queryAllFriend(Integer id);


    boolean insertFriend(Map<String, Object> friend);

    boolean deleteFriend(Map<String, Object> friendId);
}
