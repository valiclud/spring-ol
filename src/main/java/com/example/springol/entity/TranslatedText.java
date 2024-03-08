package com.example.springol.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@RequiredArgsConstructor
public class TranslatedText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;
    private String title;
    private String text;
    private String language;
    private Date insert_date;
    private int revision;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="original_text_id")
    private OriginalText originalText;
}
