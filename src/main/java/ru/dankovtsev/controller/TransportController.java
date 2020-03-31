package ru.dankovtsev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.dankovtsev.model.Transport;
import ru.dankovtsev.service.TransportService;

@RestController
@RequestMapping("/arduino")
public class TransportController {

    @Autowired
    private TransportService transportService;

    @RequestMapping(path = "/transport", method = RequestMethod.GET)
    public Transport online(){return transportService.online();}
}
