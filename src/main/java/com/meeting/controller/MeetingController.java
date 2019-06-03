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

    /**
     * 查询用户id创建的所有会议的某个meetingId的会议信息
     * @param id
     * @param meetingId
     * @return
     */
    @RequestMapping("/queryAllMeetings/{id}/{meetingId}")
    @ResponseBody
    public List<Meeting> queryAllMeetings(@PathVariable("id") int id,
                                          @PathVariable("meetingId") int meetingId){
        List<Meeting> meetings = meetingService.queryAllMeetings(id,meetingId);

        return meetings;
    }

    /**
     * 查询id的会议
     * @param id
     * @return
     */
    @RequestMapping("/queryAllSimpleMeetings/{id}")
    @ResponseBody
    public List<Meeting> queryAllSimpleMeetings(@PathVariable("id") int id){
        List<Meeting> meetings = meetingService.queryAllSimpleMeetings(id);

        return meetings;
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @RequestMapping("/queryAllInvitationMeetings/{id}")
    @ResponseBody
    public List<Meeting> queryAllInvitationMeetings(@PathVariable("id") int id){
        List<Meeting> meetings = meetingService.queryAllInvitationMeetings(id);

        return meetings;
    }

    @RequestMapping("/queryAllInvitation/{id}")
    @ResponseBody
    public List<Invitation> queryAllInvitation(@PathVariable("id") int id){
        List<Invitation> invitations = meetingService.queryAllInvitation(id);
        LOGGER.warn("meeting",invitations);
        return invitations;
    }

}
