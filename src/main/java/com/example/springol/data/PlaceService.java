package com.example.springol.data;

import com.example.springol.entity.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceService {

    @Autowired
    PlaceRepository placeRepository;

    public List<Place> findAll() {
        return this.placeRepository.findAll();
    }

    public Optional<Place> save(Place originalText) {
        Place placeSaved = this.placeRepository.save(originalText);
        return Optional.of(placeSaved);
    }

    public Optional<Place> find(Long id) {
        return this.placeRepository.findById(id);
    }
}
