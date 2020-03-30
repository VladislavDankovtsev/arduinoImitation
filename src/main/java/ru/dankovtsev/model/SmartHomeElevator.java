package ru.dankovtsev.model;

public class SmartHomeElevator {

    private String place_arrival;
    private String place_department;

    public SmartHomeElevator() {
    }

    public String getPlace_arrival() {
        return place_arrival;
    }

    public void setPlace_arrival(String place_arrival) {
        this.place_arrival = place_arrival;
    }

    public String getPlace_department() {
        return place_department;
    }

    public void setPlace_department(String place_department) {
        this.place_department = place_department;
    }
}
