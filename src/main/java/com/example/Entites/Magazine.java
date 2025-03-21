package com.example.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
public class Magazine extends Document {
    private String publisher;
    private int issueNumber;
    @Temporal(TemporalType.DATE)
    private Date dateIssue;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDateIssue() {
        return dateIssue;
    }

    public void setDate(Date dateIssue) {
        this.dateIssue = dateIssue;
    }

    public int getissuenum() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}

