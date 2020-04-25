package ru.dankovtsev.service;

import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;
import ru.dankovtsev.model.Production;

@Service
public class ProductionServer {
    public static int c =0 ;
    public static int b=0 ;
    public Production online(){
        c++;
        b=c+1;
        if (c>=6) c=1;
        if (b>=6) b=1;
        Production production = new Production();
        production.setManipulator1(c);
        production.setManipulator2(b);
        production.setStatus("on");
        return production;
    }
}
