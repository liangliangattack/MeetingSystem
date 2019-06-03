package com.meeting.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Invitation {
    private Integer id;
    private Meeting meeting;
    private List<UserInfo> toAttendUser;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss" ,
            timezone = "GMT+8"
    )
    private Date initTime;

    public Invitation() {
    }

    public Invitation(Integer id, Date initTime) {
        this.id = id;
        this.initTime = initTime;
    }

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