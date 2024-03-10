package com.example.springol.data;

import com.example.springol.entity.OriginalText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OriginalTextService {

    @Autowired
    OriginalTextRepository originalTextRepository;

    public List<OriginalText> findAll() {
        return this.originalTextRepository.findAll();
    }

    public Optional<OriginalText> save(OriginalText originalText) {
        OriginalText origTextSaved = this.originalTextRepository.save(originalText);
        return Optional.of(origTextSaved);
    }

    public Optional<OriginalText> find(Long id) {
        return this.originalTextRepository.findById(id);
    }
}
