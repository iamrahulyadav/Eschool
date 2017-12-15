package sas.eschool.pojo;

/**
 * Created by CodeCrazy on 12/16/17.
 */

public class NewMessage {

    String from;
    String message;
    Integer parent_id;
    Integer teacher_id;
    Integer msnum;

    public NewMessage(){}

    public NewMessage(String from, String message, Integer parent_id, Integer teacher_id, Integer msnum) {
        this.from = from;
        this.message = message;
        this.parent_id = parent_id;
        this.teacher_id = teacher_id;
        this.msnum = msnum;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Integer getMsnum() {
        return msnum;
    }

    public void setMsnum(Integer msnum) {
        this.msnum = msnum;
    }
}
