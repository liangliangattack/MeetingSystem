package com.meeting.service;

public interface InvitationService {
    boolean quitMeeting(int id,int meetingId);

    boolean joinMeeting(int id, int meetingId);
}
