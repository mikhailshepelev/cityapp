package com.example.cityapp.repository;

import com.example.cityapp.domain.CityEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<CityEntity, Long> {

    List<CityEntity> findByNameContaining(String name);

    Page<CityEntity> findByNameContaining(String name, Pageable pageable);

}
