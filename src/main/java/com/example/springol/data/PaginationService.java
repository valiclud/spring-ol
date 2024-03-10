package com.example.springol.data;

import com.example.springol.entity.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaginationService {

    @Autowired
    PaginationRepository paginationRepository;

    public List<Pagination> findAll() {
        return this.paginationRepository.findAll();
    }

    public Optional<Pagination> save(Pagination originalText) {
        Pagination paginSaved = this.paginationRepository.save(originalText);
        return Optional.of(paginSaved);
    }

    public Optional<Pagination> find(Long id) {
        return this.paginationRepository.findById(id);
    }
}
