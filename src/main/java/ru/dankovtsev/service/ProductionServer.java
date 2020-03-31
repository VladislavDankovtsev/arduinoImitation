package ru.dankovtsev.service;

import org.springframework.stereotype.Service;
import ru.dankovtsev.model.Production;

@Service
public class ProductionServer {
    public Production online(){
        Production production = new Production();
        production.setStatus("work");
        return production;
    }
}
