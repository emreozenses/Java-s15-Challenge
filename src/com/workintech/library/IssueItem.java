package com.workintech.library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class IssueItem extends Item{

    private LocalDateTime borrowed = LocalDateTime.now();
    private Date db = new Date();
    private LocalDateTime dueDate = LocalDateTime.from(db.toInstant()).plusDays(15);
    private double price;



    public IssueItem(int id, long isbn, String title, String author, String subject, String publisher, String language, ItemFormat format, ItemStatus status, LocalDateTime borrowed, LocalDateTime dueDate, double price) {
        super(id, isbn, title, author, subject, publisher, language, format, status);
        this.borrowed = borrowed;
        this.dueDate = dueDate;
        this.price = price;

    }

    public LocalDateTime getBorrowed() {
        return borrowed;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "IssueItem{" +
                "borrowed=" + borrowed +
                ", db=" + db +
                ", dueDate=" + dueDate +
                ", price=" + price +
                '}';
    }
}
