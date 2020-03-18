package me.jimmy.springmvc.book;

import java.util.Date;

public class Book {
    private Date created;

    private BookStatus bookStatus;

    public Date getCreated() {
        return created;
    }

    public Book setCreated(Date created) {
        this.created = created;
        return this;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public Book setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
        return this;
    }
}
