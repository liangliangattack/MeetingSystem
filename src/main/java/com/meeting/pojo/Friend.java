package com.meeting.pojo;

public class Friend {
    private Integer id;

    private UserInfo friendUser;

    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserInfo getFriendUser() {
        return friendUser;
    }

    public void setFriendUser(UserInfo friendUser) {
        this.friendUser = friendUser;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", friendUser=" + friendUser +
                ", userId=" + userId +
                '}';
    }
}
