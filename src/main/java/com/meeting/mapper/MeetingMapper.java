package com.meeting.mapper;

import com.meeting.pojo.Invitation;
import com.meeting.pojo.Meeting;
import com.meeting.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MeetingMapper {
    List<Meeting> queryAllMeetings(@Param("id") int id,@Param("meetingId") int meetingId);

    List<Invitation> queryAllInvitation(@Param("meetingId") int id);

    List<Meeting> queryAllSimpleMeetings(@Param("id") int id);

    List<Meeting> queryAllSimpleMeetings();

    List<Meeting> queryAllInvitationMeetings(@Param("id") int id);
}