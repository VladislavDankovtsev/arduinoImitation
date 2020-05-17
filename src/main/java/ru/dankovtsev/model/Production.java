package ru.dankovtsev.model;

public class Production {

    private Integer manipulator1;
    private Integer manipulator2;
    private String status1;
    private String status2;

    public Production() {
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getStatus() {
        return status1;
    }

    public void setStatus(String status) {
        this.status1 = status;
    }

    public Integer getManipulator1() {
        return manipulator1;
    }

    public void setManipulator1(Integer manipulator1) {
        this.manipulator1 = manipulator1;
    }

    public Integer getManipulator2() {
        return manipulator2;
    }

    public void setManipulator2(Integer manipulator2) {
        this.manipulator2 = manipulator2;
    }
}
