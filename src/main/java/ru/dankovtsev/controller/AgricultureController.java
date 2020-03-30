package ru.dankovtsev.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.dankovtsev.modlel.Agriculture;
import ru.dankovtsev.modlel.SoilMoisture;
import ru.dankovtsev.modlel.TemperatureAndHumidity;
import ru.dankovtsev.service.AgricultureService;

@RestController
@RequestMapping("/arduino")
public class AgricultureController {

    @Autowired
    private AgricultureService agricultureService;


    @RequestMapping(path = "/soilmoisture", method = RequestMethod.GET)
    public SoilMoisture getSoilMoistureNow(){

        //List<Agriculture> agricultureList = agriculureRepository.findAll();
        return agricultureService.online();
    }

    @RequestMapping(path = "/temperatureandhumidity", method = RequestMethod.GET)
    public TemperatureAndHumidity getTemperatureAndHumidityNow(){

        //List<Agriculture> agricultureList = agriculureRepository.findAll();
        return agricultureService.onlineTaH();
    }

}

