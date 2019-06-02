package com.meeting.controller;

import com.meeting.pojo.Friend;
import com.meeting.service.FriendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/friend")
public class MFriendController {

    Logger LOGGER = LoggerFactory.getLogger(MFriendController.class);

    @Autowired
    private FriendService friendService;

    @RequestMapping("/getFriendList/{id}")
    public List<Friend> getFriendList(@PathVariable("id") Integer id){
        List<Friend> friends = friendService.queryAllFriend(id);
        LOGGER.warn("===============",friends);

        return friends;
    }
    @RequestMapping(value = "/insertFriend",method = RequestMethod.POST)
    public Map<String,Object> insertFriend(@RequestBody Map<String,Object> friend){
        Map<String,Object> result = new HashMap<>();
        if (friendService.insertFriend(friend)){
            result.put("status",200);
            result.put("msg","添加成功");
        }
        else{
            result.put("status",400);
            result.put("msg","添加失败");
        }
    return result;
    }

    @RequestMapping("/deleteFriend")
    public Map<String,Object> deleteFriend(@RequestBody Map<String,Object> friendInfo){
        Map<String,Object> result = new HashMap<>();
        if (friendService.deleteFriend(friendInfo)){
            result.put("status",200);
            result.put("msg","删除成功");
        }
        else{
            result.put("status",400);
            result.put("msg","删除失败");
        }
        return result;
    }

}
