package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class TestGeo {
    private GeoServiceImpl geoService;

    @BeforeEach
    void setUp() {
        geoService = new GeoServiceImpl();
    }

    @Test
    public void testByIp() {
        String ipTest = "172.0.22.11";
        Country country = Country.RUSSIA;
        Location testLocation = geoService.byIp(ipTest);
        Assertions.assertEquals(country, testLocation.getCountry());
    }
}
