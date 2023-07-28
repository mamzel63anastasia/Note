package com.example.note.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Column(columnDefinition = "TEXT")
    private String text;

    private String shortText;
    private final LocalDateTime dateTimeCreat = LocalDateTime.now();

    public Page(String name, String text, String shortText) {
        this.name = name;
        this.text = text;
        this.shortText = shortText;
    }

    public Page() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDateTimeCreat() {
        return dateTimeCreat;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }
}
