package ru.dankovtsev.modlel;

import java.time.LocalDateTime;

public class TemperatureAndHumidity {

    private String temperature;
    private String humidity;
    private Boolean heatingElement;
    private Boolean fan;

    public TemperatureAndHumidity() {
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Boolean getHeatingElement() {
        return heatingElement;
    }

    public void setHeatingElement(Boolean heatingElement) {
        this.heatingElement = heatingElement;
    }

    public Boolean getFan() {
        return fan;
    }

    public void setFan(Boolean fan) {
        this.fan = fan;
    }
}
