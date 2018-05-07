package rest.db.entity;

import org.mongodb.morphia.annotations.Entity;

import java.util.List;

@Entity("dialogs")
public class Dialog {

    private String id;
    private String ownerId;
    private String companionId;
    private String companionName;
    private long lastMessageDate;
    private List<Message> messages;

    public Dialog() {
    }

    public Dialog(String id, String ownerId, String companionId, String companionName, long lastMessageDate, List<Message> messages) {
        this.id = id;
        this.ownerId = ownerId;
        this.companionId = companionId;
        this.companionName = companionName;
        this.lastMessageDate = lastMessageDate;
        this.messages = messages;
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

    public String getCompanionId() {
        return companionId;
    }

    public void setCompanionId(String companionId) {
        this.companionId = companionId;
    }

    public String getCompanionName() {
        return companionName;
    }

    public void setCompanionName(String companionName) {
        this.companionName = companionName;
    }

    public long getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(long lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
