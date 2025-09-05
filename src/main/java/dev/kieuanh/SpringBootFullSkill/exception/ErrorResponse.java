package dev.kieuanh.SpringBootFullSkill.exception;

import java.util.Date;

public class ErrorResponse {
    private Date timestamp;
    private int Status;
    private  String path;
    private String error;
    private String message;

    public ErrorResponse(Date timestamp, int status, String path, String error, String message) {
        this.timestamp = timestamp;
        Status = status;
        this.path = path;
        this.error = error;
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponse() {
    }
}
