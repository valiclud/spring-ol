package com.example.springol.data;

import com.example.springol.entity.Pagination;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaginationRepository extends CrudRepository<Pagination, Long> {

    @Override
    List<Pagination> findAll();
}
