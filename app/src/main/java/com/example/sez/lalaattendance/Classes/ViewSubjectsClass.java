package com.example.sez.lalaattendance.Classes;

public class ViewSubjectsClass {
    public String subject;

    public ViewSubjectsClass(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return subject;
    }
}
