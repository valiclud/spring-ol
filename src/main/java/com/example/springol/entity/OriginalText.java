package com.example.springol.entity;

import java.sql.Blob;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@RequiredArgsConstructor
public class OriginalText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;
    private String title;
    private String text;
    @Lob
    private Blob text_img;
    private int century;
    private Date insert_date;
    private int hits;

    @OneToMany(mappedBy = "originalText")
    private Set<TranslatedText> translatedTexts;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="place_id")
    private Place place;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="old_language_id")
    private OldLanguage oldLanguage;
}
