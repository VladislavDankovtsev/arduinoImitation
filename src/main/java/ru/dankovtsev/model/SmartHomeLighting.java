package ru.dankovtsev.model;

import java.time.LocalDateTime;

public class SmartHomeLighting {

    private String system_status;
    private String signal_source;

    public SmartHomeLighting() {
    }

    public String getSystem_status() {
        return system_status;
    }

    public void setSystem_status(String system_status) {
        this.system_status = system_status;
    }

    public String getSignal_source() {
        return signal_source;
    }

    public void setSignal_source(String signal_source) {
        this.signal_source = signal_source;
    }
}
