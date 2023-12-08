package com.workintech.library;

import java.util.Objects;

public class Item {

    private int id;
    private long isbn;
    private String title;
    private String author;
    private String subject;
    private String publisher;
    private String language;
    private ItemFormat format;
    private ItemStatus status = ItemStatus.AVAILABLE;

    public Item(int id, long isbn, String title, String author, String subject, String publisher, String language, ItemFormat format, ItemStatus status) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.publisher = publisher;
        this.language = language;
        this.format = format;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && isbn == item.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", publisher='" + publisher + '\'' +
                ", language='" + language + '\'' +
                ", format=" + format +
                ", status=" + status +
                '}';
    }
}
