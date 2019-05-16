package com.meeting.mapper;

import com.meeting.pojo.Invitation;
import com.meeting.pojo.Meeting;
import com.meeting.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MeetingMapper {
    List<Meeting> queryAllMeetings(@Param("id") int id);

    List<UserInfo> queryAllInvitation(@Param("meetingId") int id);
}