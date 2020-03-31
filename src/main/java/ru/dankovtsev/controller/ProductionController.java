package ru.dankovtsev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.dankovtsev.model.Production;
import ru.dankovtsev.service.ProductionServer;

@RestController
@RequestMapping("/arduino")
public class ProductionController {

    @Autowired
    private ProductionServer productionServer;

    @RequestMapping(path = "/production", method = RequestMethod.GET)
    public Production online(){
        return productionServer.online();
    }
}
