package ru.dankovtsev.modlel;

import org.springframework.stereotype.Component;


import java.time.LocalDateTime;


public class Agriculture {
    private SoilMoisture soilMoisture;
    private TemperatureAndHumidity temperatureAndHumidity;

    public Agriculture() {
    }

    public TemperatureAndHumidity getTemperatureAndHumidity() {
        return temperatureAndHumidity;
    }

    public void setTemperatureAndHumidity(TemperatureAndHumidity temperatureAndHumidity) {
        this.temperatureAndHumidity = temperatureAndHumidity;
    }

    public SoilMoisture getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(SoilMoisture soilMoisture) {
        this.soilMoisture = soilMoisture;
    }
}
