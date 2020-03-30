package ru.dankovtsev.service;

import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;
import ru.dankovtsev.model.SoilMoisture;
import ru.dankovtsev.model.TemperatureAndHumidity;

@Service
public class AgricultureService {

    public SoilMoisture online(){
        SoilMoisture soilMoisture = new SoilMoisture();
        String humidity = String.valueOf( DoubleRounder.round(Math.random()*100,1));
        System.out.println(humidity);
        soilMoisture.setHumidity(humidity);
        soilMoisture.setWater(false);
        return soilMoisture;
    }
    public TemperatureAndHumidity onlineTaH(){
        TemperatureAndHumidity temperatureAndHumidity = new TemperatureAndHumidity();
        String humidity = String.valueOf( DoubleRounder.round(Math.random()*100,1));
        temperatureAndHumidity.setFan(true);
        temperatureAndHumidity.setHeatingElement(false);
        temperatureAndHumidity.setHumidity(humidity);
        String temp = String.valueOf( DoubleRounder.round(Math.random()*30,1));
        temperatureAndHumidity.setTemperature(temp);
        return temperatureAndHumidity;
    }


}
