package com.meeting.mapper;

import com.meeting.pojo.Meeting;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MeetingMapper {
    List<Meeting> queryAllMeetings(@Param("id") int id);
}