package com.example.springol.entity;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@RequiredArgsConstructor
public class OldLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String language;
    private String period;

    @OneToMany(mappedBy = "old_language")
    private Set<OriginalText> originalTexts;
}
