package ru.dankovtsev.service;

import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;
import ru.dankovtsev.model.SmartHomeClimatControl;
import ru.dankovtsev.model.SmartHomeElevator;
import ru.dankovtsev.model.SmartHomeLighting;
import ru.dankovtsev.model.SmartHomeSecurity;

@Service
public class SmartHomeService {

    public SmartHomeClimatControl onlineClimateControl(){
        SmartHomeClimatControl smartHomeClimatControl = new SmartHomeClimatControl();
        smartHomeClimatControl.setTemperatureIn(String.valueOf( DoubleRounder.round(Math.random()*30,1)));
        smartHomeClimatControl.setTemperatureOut(String.valueOf( DoubleRounder.round(Math.random()*30-10,1)));
        return smartHomeClimatControl;
    }

    public SmartHomeElevator onlineElevator(){
        SmartHomeElevator smartHomeElevator= new SmartHomeElevator();
        smartHomeElevator.setPlace_arrival("first");
        smartHomeElevator.setPlace_department("second");
        return smartHomeElevator;
    }

    public SmartHomeLighting onlineLighting(){
        SmartHomeLighting smartHomeLighting = new SmartHomeLighting();
        smartHomeLighting.setSystem_status("off");
        smartHomeLighting.setSignal_source("room");
        return smartHomeLighting;
    }

    public SmartHomeSecurity onlineSecurity(){
        SmartHomeSecurity smartHomeSecurity = new SmartHomeSecurity();
        smartHomeSecurity.setId_personal("unknow");
        smartHomeSecurity.setDoor_status("off");
        return smartHomeSecurity;
    }
}
