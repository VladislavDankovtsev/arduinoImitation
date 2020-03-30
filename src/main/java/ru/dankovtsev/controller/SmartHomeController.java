package ru.dankovtsev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.dankovtsev.model.SmartHomeClimatControl;
import ru.dankovtsev.model.SmartHomeElevator;
import ru.dankovtsev.model.SmartHomeLighting;
import ru.dankovtsev.model.SmartHomeSecurity;
import ru.dankovtsev.service.SmartHomeService;

@RestController
@RequestMapping("/arduino")
public class SmartHomeController {

    @Autowired
    private SmartHomeService smartHomeService;

    @RequestMapping(path = "/climatcontrol", method = RequestMethod.GET)
    public SmartHomeClimatControl getClimatControl(){
        return smartHomeService.onlineClimateControl();
    }

    @RequestMapping(path = "/elevator", method = RequestMethod.GET)
    public SmartHomeElevator getElevator(){
        return smartHomeService.onlineElevator();
    }
    @RequestMapping(path = "/lighting", method = RequestMethod.GET)
    public SmartHomeLighting getLighting(){
        return smartHomeService.onlineLighting();
    }
    @RequestMapping(path = "/security", method = RequestMethod.GET)
    public SmartHomeSecurity getSecurity(){
        return smartHomeService.onlineSecurity();
    }

}
