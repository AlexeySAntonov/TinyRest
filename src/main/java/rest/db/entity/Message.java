package rest.db.entity;

public class Message {

    private String id;
    private String ownerId;
    private long date;
    private String text;

    public Message() {
    }

    public Message(String id, String ownerId, long date, String text) {
        this.id = id;
        this.ownerId = ownerId;
        this.date = date;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
