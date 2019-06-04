package com.meeting.controller;

import com.meeting.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Date:2019/5/16
 * Auther:Mercer
 * Auther:麻前程
 */
@RestController
@RequestMapping("/invitation")
public class InvitationController {

    @Autowired
    private InvitationService invitationService;

    @RequestMapping(value = "/quitMeeting/{id}/{meetingId}")
    public Map<String , String> quitMeeting(@PathVariable("id") int id,
                                            @PathVariable("meetingId") int meetingId){
        Map<String,String> map = new HashMap<>();
        if (invitationService.quitMeeting(id,meetingId)){
            //登陆成功
            map.put("status","200");
            map.put("msg","退出会议成功");
        }
        else {
            map.put("status","400");
            map.put("msg", "退出失败");
        }
        return map;
    }

//    @RequestMapping(value = "/joinMeeting/{id}/{meetingId}")
//    public Map<String , String> joinMeeting(@PathVariable("id") int id,
//                                            @PathVariable("meetingId") int meetingId){
//        Map<String,String> map = new HashMap<>();
//        if (invitationService.quitMeeting(id,meetingId)){
//            //登陆成功
//            map.put("status","200");
//            map.put("msg","退出会议成功");
//        }
//        else {
//            map.put("status","400");
//            map.put("msg", "退出失败");
//        }
//        return map;
//    }


}
