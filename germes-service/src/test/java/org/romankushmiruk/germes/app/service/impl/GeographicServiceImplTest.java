package org.romankushmiruk.germes.app.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.romankushmiruk.germes.app.model.entity.geography.City;
import org.romankushmiruk.germes.app.service.GeographicService;
import static org.junit.Assert.*;
import java.util.List;

/**
 * Contain unit-tests for {@link GeographicServiceImpl}
 * @author RomanKushmiruk
 *
 */
public class GeographicServiceImplTest {
    private GeographicService service;

    @Before
    public void setup(){
        service = new GeographicServiceImpl();
    }

    @Test
    public void testNoDataReturnedAtStart(){
        List<City> cities = service.findCities();
        assertTrue(cities.isEmpty());
    }

    @Test
    public void testSaveNewCitySuccess(){
        City city = new City("Odessa");
        service.saveCity(city);

        List<City> cities = service.findCities();
        assertEquals(cities.size(),1);
        assertEquals(cities.get(0).getName(),"Odessa");

    }
}
