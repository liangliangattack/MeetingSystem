package com.meeting.service.impl;

import com.meeting.mapper.MeetingMapper;
import com.meeting.pojo.Invitation;
import com.meeting.pojo.Meeting;
import com.meeting.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("meetingService")
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingMapper meetingMapper;

    @Override
    public List<Meeting> queryAllMeetings(int id,int meetingId) {
        return meetingMapper.queryAllMeetings(id,meetingId);
    }

    @Override
    public List<Invitation> queryAllInvitation(int id) {
        return meetingMapper.queryAllInvitation(id);
    }

    @Override
    public List<Meeting> queryAllSimpleMeetings(int id) {
            return meetingMapper.queryAllSimpleMeetings(id);
    }

    @Override
    public List<Meeting> queryAllInvitationMeetings(int id) {
        return meetingMapper.queryAllInvitationMeetings(id);
    }
}
