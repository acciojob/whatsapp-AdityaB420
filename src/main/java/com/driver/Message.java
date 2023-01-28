package com.driver;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;
    private User user;
    private Group group;
    public Message(int id,String content){
        this.id=id;
        this.content=content;
        this.timestamp=new Date();
        this.user=user;
        this.group=group;
    }
    public int getId() {
        return id;
    }

    public void setId(int messageId) {
        this.id = id;
    }

    public String getcontent() {
        return content;
    }

    public void setcontent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }


}
