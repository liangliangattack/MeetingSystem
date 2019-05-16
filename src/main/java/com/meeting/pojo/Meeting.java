package com.meeting.pojo;

import java.util.Date;

public class Meeting {
    private Integer id;
    private String meetingTitle;
    private String meetingContent;
    private Date createTime;
    private UserInfo createByUser;
    private String time;
    private String path;
    private String address;

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", meetingTitle='" + meetingTitle + '\'' +
                ", meetingContent='" + meetingContent + '\'' +
                ", createTime=" + createTime +
                ", createByUser=" + createByUser +
                ", time='" + time + '\'' +
                ", path='" + path + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getMeetingContent() {
        return meetingContent;
    }

    public void setMeetingContent(String meetingContent) {
        this.meetingContent = meetingContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public UserInfo getCreateByUser() {
        return createByUser;
    }

    public void setCreateByUser(UserInfo createByUser) {
        this.createByUser = createByUser;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}