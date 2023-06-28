package model;

import java.util.Objects;

public class Note {
    private int id;
    private String head;
    private String text;


    public Note(int id, String head, String text) {
        this.id = id;
        this.head = head;
        this.text = text;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", head='" + head + '\'' +
                ", text='" + text ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note that = (Note) o;
        return id == that.id && Objects.equals(head, that.head) && Objects.equals(text, that.text);
    }
}

