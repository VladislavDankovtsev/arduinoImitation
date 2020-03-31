package ru.dankovtsev.service;

import org.springframework.stereotype.Service;
import ru.dankovtsev.model.Production;
import ru.dankovtsev.model.Transport;

@Service
public class TransportService {
    public Transport online(){
        Transport transport = new Transport();
        transport.setStatus("work");
        return transport;
    }
}
