package com.example.weather.web.dao;

import com.example.weather.web.entity.WeatherSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface WeatherSummaryDao extends JpaRepository<WeatherSummary, Integer> {

    List<WeatherSummary> getAllByCity(List<String> cities);

    @Override
    List<WeatherSummary> findAll();

    List<WeatherSummary> findAllByOrderByIdDesc();

    @Transactional
    void deleteById(Integer id);
}
