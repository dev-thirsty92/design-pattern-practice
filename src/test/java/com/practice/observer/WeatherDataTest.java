package com.practice.observer;

import com.practice.observer.model.CurrentConditionsDisplay;
import com.practice.observer.model.WeatherData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherDataTest {

    @Test
    @DisplayName("기상스테이션 동작 테스트")
    void currentConditionsDisplayTest() {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        assertEquals(80, currentConditionsDisplay.getTemperature());
        assertEquals(65, currentConditionsDisplay.getHumidity());

    }

    @Test
    @DisplayName("옵저버 제거 테스트")
    void removeObserverTest() {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        assertTrue(weatherData.containsObserver(currentConditionsDisplay),
                "옵저버 등록 후 포함이 되어있는 것을 확인");

        weatherData.removeObserver(currentConditionsDisplay);
        assertFalse(weatherData.containsObserver(currentConditionsDisplay),
                "옵저버 제거 후 포함이 되어 있지 않다는 것을 확인");
    }


}
