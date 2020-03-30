package ru.dankovtsev.modlel;



import java.time.LocalDateTime;


public class SoilMoisture {

    private String humidity;
    private Boolean water;

    public SoilMoisture() {
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Boolean getWater() {
        return water;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

}
