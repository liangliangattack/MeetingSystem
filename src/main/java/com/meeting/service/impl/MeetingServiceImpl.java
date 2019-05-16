package com.meeting.service.impl;

import com.meeting.mapper.MeetingMapper;
import com.meeting.pojo.Invitation;
import com.meeting.pojo.Meeting;
import com.meeting.pojo.UserInfo;
import com.meeting.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("meetingService")
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingMapper meetingMapper;

    @Override
    public List<Meeting> queryAllMeetings(int id) {
        return meetingMapper.queryAllMeetings(id);
    }

    @Override
    public List<UserInfo> queryAllInvitation(int id) {
        return meetingMapper.queryAllInvitation(id);
    }
}
