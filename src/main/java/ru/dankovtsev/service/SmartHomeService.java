package ru.dankovtsev.service;

import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;
import ru.dankovtsev.model.SmartHomeClimatControl;
import ru.dankovtsev.model.SmartHomeElevator;
import ru.dankovtsev.model.SmartHomeLighting;
import ru.dankovtsev.model.SmartHomeSecurity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@Service
public class SmartHomeService {

    public SmartHomeClimatControl onlineClimateControl(){
        SmartHomeClimatControl smartHomeClimatControl = new SmartHomeClimatControl();
        smartHomeClimatControl.setTemperatureIn(String.valueOf( DoubleRounder.round(Math.random()*5+20,1)));
        smartHomeClimatControl.setTemperatureOut(String.valueOf( DoubleRounder.round(Math.random()*5+10,1)));
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
        ArrayList<String>  lists =  new ArrayList(Arrays.asList( "20114567-e89b-12d3-a456-426655440000",
                "20114567-e89b-12d3-a456-426655440001",
                "20114567-e89b-12d3-a456-426655440002",
                "20114567-e89b-12d3-a456-426655440003", null,  null, null, null, null, null, null, null));
        Integer count = lists.size()-1;
        System.out.println(count);
        Double rand1 = Math.random()*count.intValue();
        int rand = rand1.intValue();
        System.out.println(rand);
       // smartHomeSecurity.setId_personal(UUID.fromString(lists.get(rand)));
        if(lists.get(rand)==null){
            smartHomeSecurity.setId_personal(null);
            smartHomeSecurity.setDoor_status("off");}
        else if (lists.get(rand).equals("20114567-e89b-12d3-a456-426655440003")) {
            smartHomeSecurity.setId_personal(UUID.fromString(lists.get(rand)));
            smartHomeSecurity.setDoor_status("off");
        }
        else {
            smartHomeSecurity.setId_personal(UUID.fromString(lists.get(rand)));
            smartHomeSecurity.setDoor_status("on");
        };
        return smartHomeSecurity;
    }
}
