package com.meeting.controller;

import com.meeting.pojo.Friend;
import com.meeting.service.FriendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/friend")
public class MFriendController {

    Logger LOGGER = LoggerFactory.getLogger(MFriendController.class);

    @Autowired
    private FriendService friendService;

    @RequestMapping("/getFriendList/{id}")
    @ResponseBody
    public List<Friend> getFriendList(@PathVariable("id") Integer id){
        List<Friend> friends = friendService.queryAllFriend(id);
        LOGGER.warn("===============",friends);

        return friends;
    }
}
