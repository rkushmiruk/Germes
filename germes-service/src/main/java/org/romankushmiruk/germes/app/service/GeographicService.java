package org.romankushmiruk.germes.app.service;

import org.romankushmiruk.germes.app.model.entity.geography.City;
import java.util.List;

/**
 * Entry point to perform operations
 * over geographic entities
 * @author RomanKushmiruk
 *
 */
public interface GeographicService {

    /**
     * Returns list of existing cities
     * @return
     */
    List<City> findCities();


    /**
     * Saves specified city instance
     * @param city
     */
    void saveCity(City city);

}
