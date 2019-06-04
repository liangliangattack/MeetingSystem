package com.meeting.service.impl;

import com.meeting.mapper.InvitationMapper;
import com.meeting.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("invitationService")
public class InvitationServiceImpl implements InvitationService {

    @Autowired
    private InvitationMapper invitationMapper;

    @Override
    public boolean quitMeeting(int id , int meetingId) {
        //影响的行数
        if(invitationMapper.quitMeeting(id,meetingId) >= 1){
            return true;
        }
        return false;
    }
}
