package com.meeting.service;

import com.meeting.pojo.Meeting;

import java.util.List;

public interface MeetingService {
    List<Meeting> queryAllMeetings(int id);
}
