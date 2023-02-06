package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

public class TestLocalization {
    private LocalizationServiceImpl localizationService;

    @BeforeEach
    public void setUp() {

        localizationService = new LocalizationServiceImpl();
    }

    @Test
    void returnRusText() {
        Country country = Country.RUSSIA;
        Assertions.assertEquals("Добро пожаловать", localizationService.locale(country));
    }
}
