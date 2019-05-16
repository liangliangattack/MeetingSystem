package com.meeting.controller;

import com.meeting.pojo.Meeting;
import com.meeting.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MeetingController {

    @Autowired
    private MeetingService meetingService;

    @RequestMapping("/queryAllMeetings/{id}")
    @ResponseBody
    public List<Meeting> queryAllMeetings(@PathVariable("id") int id){
        List<Meeting> meetings = meetingService.queryAllMeetings(id);

        return meetings;
    }
}
