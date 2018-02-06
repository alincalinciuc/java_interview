package com.assist_software.interview.service;

import com.assist_software.interview.model.CountryPopulation;

import java.util.List;
import java.util.Optional;

public interface StatisticsService {
  Optional<CountryPopulation> findCountry(String countryName);
  List<CountryPopulation> getAllCountries();
}
