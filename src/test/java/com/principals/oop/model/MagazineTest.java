package com.principals.oop.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MagazineTest {

    @Test
    public void setIssueNumberAndGetIssueNumber() {
        Magazine magazine = new Magazine();
        magazine.setIssueNumber("12345");
        assertEquals("12345", magazine.getIssueNumber());
    }

    @Test
    public void setIssueNumberToNull() {
        Magazine magazine = new Magazine();
        magazine.setIssueNumber(null);
        assertNull(magazine.getIssueNumber());
    }

    @Test
    public void setIssueNumberToEmptyString() {
        Magazine magazine = new Magazine();
        magazine.setIssueNumber("");
        assertEquals("", magazine.getIssueNumber());
    }
}