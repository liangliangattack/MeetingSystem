package com.meeting.mapper;

import org.apache.ibatis.annotations.Param;

public interface InvitationMapper {

    int quitMeeting(@Param("id") int id,@Param("meetingId") int meetingId);
}