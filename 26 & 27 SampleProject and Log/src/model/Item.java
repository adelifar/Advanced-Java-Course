package model;

import java.time.LocalDateTime;

public class Item {
    private long id;
    private String title;
    private String description;
    private LocalDateTime createDate;
    private boolean done;
    private LocalDateTime doneDate;
    private byte priority;

    public Item(long id, String title, String description, LocalDateTime createDate, boolean done, LocalDateTime doneDate, byte priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.done = done;
        this.doneDate = doneDate;
        this.priority = priority;
    }

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDateTime getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(LocalDateTime doneDate) {
        this.doneDate = doneDate;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", done=" + done +
                ", doneDate=" + doneDate +
                ", priority=" + priority +
                '}';
    }
}
