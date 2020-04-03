package ru.dankovtsev.service;

import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;
import ru.dankovtsev.model.Production;

@Service
public class ProductionServer {
    public static Integer c;
    public static Integer b;
    public Production online(){
        c=(int) DoubleRounder.round(Math.random()*5,0)+1;
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
