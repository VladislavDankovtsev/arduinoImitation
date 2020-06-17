package ru.dankovtsev.service;

import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;
import ru.dankovtsev.model.SoilMoisture;
import ru.dankovtsev.model.TemperatureAndHumidity;

@Service
public class AgricultureService {
    private static Double dmain = 67.1;
    private static Double d1main = 56.1;
    private static Double temp = 20.1;

    public SoilMoisture online(){
        SoilMoisture soilMoisture = new SoilMoisture();
        Double k = Math.random()*2;
        Double dd = DoubleRounder.round(Math.random()*2,1);
        if (k>1)
            d1main = d1main+dd;
        else
            d1main= d1main-dd;
        String humidity = String.valueOf( d1main);
        System.out.println(humidity);
        soilMoisture.setHumidity(humidity);
        if (d1main>60)
            soilMoisture.setWater(false);
        else
            soilMoisture.setWater(true);
        return soilMoisture;
    }
    public TemperatureAndHumidity onlineTaH(){
        TemperatureAndHumidity temperatureAndHumidity = new TemperatureAndHumidity();
        Double k = Math.random()*2;
        Double dd = DoubleRounder.round(Math.random()*2,1);
        if (k>1)
            dmain = dmain+dd;
        else
            dmain= dmain-dd;
        String humidity = String.valueOf(dmain);
        temperatureAndHumidity.setHumidity(humidity);
        if ((dmain>70)&&(dmain<40))
            temperatureAndHumidity.setFan(true);
        else
            temperatureAndHumidity.setFan(false);

        k = Math.random()*2;
        Double tt = DoubleRounder.round(Math.random()*1,1);
        if (k>1)
            temp = temp+tt;
        else
            temp= temp-tt;
        String temps = String.valueOf(temp);
        temperatureAndHumidity.setTemperature(temps);
        if (temp>21)
            temperatureAndHumidity.setHeatingElement(false);
        else
            temperatureAndHumidity.setHeatingElement(true);
        temperatureAndHumidity.setHumidity(humidity);
        return temperatureAndHumidity;
    }


}
