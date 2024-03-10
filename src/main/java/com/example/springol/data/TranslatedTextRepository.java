package com.example.springol.data;

import com.example.springol.entity.TranslatedText;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TranslatedTextRepository extends CrudRepository<TranslatedText, Long> {

    @Override
    List<TranslatedText> findAll();
}