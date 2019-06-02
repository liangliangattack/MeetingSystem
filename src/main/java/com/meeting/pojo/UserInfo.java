package com.meeting.pojo;

/**
 * @ Date:2019/5/16
 * Auther:Mercer
 * Auther:麻前程
 */
public class UserInfo {
    private Integer id;
    private String name;
    private String phone;
    private String sex;
    private String url;
    private String password;

    public UserInfo() {
    }

    public UserInfo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
