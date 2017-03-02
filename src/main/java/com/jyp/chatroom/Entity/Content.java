package com.jyp.chatroom.Entity;

/**
 * Created by jyp on 2017/3/2.
 */
public class Content {
    private int id;
    private String accountName;
    private String content;
    private String toAccountName;
    private String type;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getToAccountName() {
        return toAccountName;
    }

    public void setToAccountName(String toAccountName) {
        this.toAccountName = toAccountName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Content(){

    }

    public Content(int id, String accountName, String content, String toAccountName, String type, String createTime) {
        this.id = id;
        this.accountName = accountName;
        this.content = content;
        this.toAccountName = toAccountName;
        this.type = type;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", content='" + content + '\'' +
                ", toAccountName='" + toAccountName + '\'' +
                ", type='" + type + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
