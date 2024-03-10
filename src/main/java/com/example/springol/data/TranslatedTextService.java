package com.example.springol.data;

import com.example.springol.entity.TranslatedText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TranslatedTextService {

    @Autowired
    TranslatedTextRepository translatedTextRepository;

    public List<TranslatedText> findAll() {
        return this.translatedTextRepository.findAll();
    }

    public Optional<TranslatedText> save(TranslatedText translatedText) {
        TranslatedText transTextSaved = this.translatedTextRepository.save(translatedText);
        return Optional.of(transTextSaved);
    }

    public Optional<TranslatedText> find(Long id) {
        return this.translatedTextRepository.findById(id);
    }
}
