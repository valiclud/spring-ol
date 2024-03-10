package com.example.springol.data;

import com.example.springol.entity.OldLanguage;
import com.example.springol.entity.Place;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OldLanguageRepository extends CrudRepository<OldLanguage, Long> {

    @Override
    List<OldLanguage> findAll();
}
