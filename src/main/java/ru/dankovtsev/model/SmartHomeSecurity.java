package ru.dankovtsev.model;


import java.time.LocalDateTime;
import java.util.UUID;

public class SmartHomeSecurity {

    private UUID id_personal;
    private String door_status;

    public SmartHomeSecurity() {
    }

    public UUID getId_personal() {
        return id_personal;
    }

    public void setId_personal(UUID id_personal) {
        this.id_personal = id_personal;
    }

    public String getDoor_status() {
        return door_status;
    }

    public void setDoor_status(String door_status) {
        this.door_status = door_status;
    }
}
