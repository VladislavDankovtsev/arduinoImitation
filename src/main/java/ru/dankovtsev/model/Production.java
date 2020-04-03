package ru.dankovtsev.model;

public class Production {

    private Integer manipulator1;
    private Integer manipulator2;
    private String status;

    public Production() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
