package com.example.springol.data;

import com.example.springol.entity.OriginalText;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OriginalTextRepository extends CrudRepository<OriginalText, Long> {

    @Override
    List<OriginalText> findAll();
}
