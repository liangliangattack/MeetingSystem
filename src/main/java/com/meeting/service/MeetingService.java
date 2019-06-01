package com.meeting.service;

import com.meeting.pojo.Invitation;
import com.meeting.pojo.Meeting;
import com.meeting.pojo.UserInfo;

import java.util.List;

public interface MeetingService {
    List<Meeting> queryAllMeetings(int id);

    List<Invitation> queryAllInvitation(int id);
}
