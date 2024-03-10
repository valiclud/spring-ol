package com.example.springol.data;

import com.example.springol.entity.OriginalText;
import com.example.springol.entity.Place;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlaceRepository extends CrudRepository<Place, Long> {

    @Override
    List<Place> findAll();
}
