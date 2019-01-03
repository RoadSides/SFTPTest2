package cn.itcast.test.model;

public class RestResult {

    private int code;
    private String message;
    private Object entity;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public RestResult(int code, String message, Object entity) {
        this.code = code;
        this.message = message;
        this.entity = entity;
    }
}
