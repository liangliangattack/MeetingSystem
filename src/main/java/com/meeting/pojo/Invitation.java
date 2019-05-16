package com.meeting.pojo;

import java.util.Date;
import java.util.List;

public class Invitation {
    private Integer id;
    private Meeting meeting;
    private List<UserInfo> toAttendUser;
    private Date initTime;

    @Override
    public String toString() {
        return "Invitation{" +
                "id=" + id +
                ", meeting=" + meeting +
                ", toAttendUser=" + toAttendUser +
                ", initTime=" + initTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public List<UserInfo> getToAttendUser() {
        return toAttendUser;
    }

    public void setToAttendUser(List<UserInfo> toAttendUser) {
        this.toAttendUser = toAttendUser;
    }

    public Date getInitTime() {
        return initTime;
    }

    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }
}