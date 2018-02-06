package com.assist_software.interview.repository;

import com.assist_software.interview.model.CountryPopulation;

import java.io.IOException;
import java.util.List;

/**
 * Repository for retrieving Country population statistics.
 */
public interface StatRepository {

  /**
   * Gets a list of Pairs that are 'country:population'
   *
   * @return Country population list
   * @throws IOException connection problems
   */
  List<CountryPopulation> getCountryPopulations() throws IOException;

}
