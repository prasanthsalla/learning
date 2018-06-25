package org.arna.log;


import java.util.Date;

public class LogMessage {

    private Date date;

    private String message;

    public LogMessage(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
}

