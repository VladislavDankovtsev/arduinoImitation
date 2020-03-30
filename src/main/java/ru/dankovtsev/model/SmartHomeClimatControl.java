package ru.dankovtsev.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class SmartHomeClimatControl {
    private String temperatureIn;
    private String temperatureOut;

    public SmartHomeClimatControl() {
    }

    public String getTemperatureIn() {
        return temperatureIn;
    }

    public void setTemperatureIn(String temperatureIn) {
        this.temperatureIn = temperatureIn;
    }

    public String getTemperatureOut() {
        return temperatureOut;
    }

    public void setTemperatureOut(String temperatureOut) {
        this.temperatureOut = temperatureOut;
    }
}
