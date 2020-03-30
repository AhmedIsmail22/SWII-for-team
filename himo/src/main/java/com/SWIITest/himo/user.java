package com.SWIITest.himo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class user {
    @Id
    private String id;
    private String type;
    private String title;
    private String descreption;
    private long timestamp;
    public user (String id,String title,String descreption)
    {
        this.id=id;
        this.descreption=descreption;
        this.title=title;
        this.timestamp=System.currentTimeMillis();
    }
    public user(){
        this.timestamp= System.currentTimeMillis();
    }
    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
