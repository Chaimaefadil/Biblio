package com.example.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
public class Book extends Document {
    private String author;
    private String isbn;
    @Temporal(TemporalType.DATE)
    private Date datePubli;

    public Book() {
    }


    public String getauthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDatePubli() {
        return datePubli;
    }

    public void setDate(Date datePubli) {
        this.datePubli = datePubli;
    }

    public String getisbn() {
        return isbn;
    }

    public void setisbn(String isbn) {
        this.isbn = isbn;
    }
}
