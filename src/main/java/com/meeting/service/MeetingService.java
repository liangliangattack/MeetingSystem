package com.meeting.service;

import com.meeting.pojo.Invitation;
import com.meeting.pojo.Meeting;
import com.meeting.pojo.UserInfo;

import java.util.List;

public interface MeetingService {
    List<Meeting> queryAllMeetings(int id,int meetingId);

    List<Invitation> queryAllInvitation(int id);

    List<Meeting> queryAllSimpleMeetings(int id);

    List<Meeting> queryAllInvitationMeetings(int id);
}
