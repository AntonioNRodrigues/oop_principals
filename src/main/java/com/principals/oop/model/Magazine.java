package com.principals.oop.model;

import jakarta.persistence.Entity;

@Entity
public class Magazine extends LibraryItem {
    private String issueNumber;

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
}