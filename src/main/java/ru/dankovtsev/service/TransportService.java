package ru.dankovtsev.service;

import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;
import ru.dankovtsev.model.Production;
import ru.dankovtsev.model.Transport;

@Service
public class TransportService {
    public static Double x = 37.1;
    public static Double y = 45.1;
    public Transport online(){
        x=x+0.1;
        y=y+0.2;
        Transport transport = new Transport();
        transport.setStatus("on");
        transport.setX(x);
        transport.setY(y);
        transport.setTypeCargo( String.valueOf( DoubleRounder.round(Math.random()*10,0)));
        return transport;
    }
}
