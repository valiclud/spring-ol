package com.example.springol.entity;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@RequiredArgsConstructor
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String old_place;
    private String country;

    @OneToMany(mappedBy = "place")
    private Set<OriginalText> originalTexts;
}
