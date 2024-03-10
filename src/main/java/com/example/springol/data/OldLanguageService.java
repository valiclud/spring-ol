package com.example.springol.data;

import com.example.springol.entity.OldLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OldLanguageService {

    @Autowired
    OldLanguageRepository oldLanguageRepository;

    public List<OldLanguage> findAll() {
        return this.oldLanguageRepository.findAll();
    }

    public Optional<OldLanguage> save(OldLanguage originalText) {
        OldLanguage placeSaved = this.oldLanguageRepository.save(originalText);
        return Optional.of(placeSaved);
    }

    public Optional<OldLanguage> find(Long id) {
        return this.oldLanguageRepository.findById(id);
    }
}
