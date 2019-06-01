package com.meeting.controller;

import com.meeting.pojo.Invitation;
import com.meeting.pojo.Meeting;
import com.meeting.pojo.UserInfo;
import com.meeting.service.MeetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/meeting")
public class MeetingController {
    Logger LOGGER = LoggerFactory.getLogger(MeetingController.class);

    @Autowired
    private MeetingService meetingService;

    @RequestMapping("/queryAllMeetings/{id}")
    @ResponseBody
    public List<Meeting> queryAllMeetings(@PathVariable("id") int id){
        List<Meeting> meetings = meetingService.queryAllMeetings(id);

        return meetings;
    }

    @RequestMapping("/queryAllInvitation/{id}")
    @ResponseBody
    public List<Invitation> queryAllInvitation(@PathVariable("id") int id){
        List<Invitation> invitations = meetingService.queryAllInvitation(id);
        LOGGER.warn("meeting",invitations);

//        List<Invitation> i = new ArrayList<UserInfo>();
//        i.add(new Invitation(1,new Date()));
//
//        List<UserInfo> user = new ArrayList<>();
//        user.add(new UserInfo(1,"xiao"));

//        i = user;

        return invitations;
    }

}
