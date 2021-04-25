package com.spzhu.entity;

public class LevelEntity extends PageEntity{

    String time;
    String pointName;
    String settlingValue;


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }


    public String getSettlingValue() {
        return settlingValue;
    }

    public void setSettlingValue(String settlingValue) {
        this.settlingValue = settlingValue;
    }

    @Override
    public String toString() {
        return "pointName = " + pointName + ", time = " + time + ", settling_value = " + settlingValue +  "\n";

    }
}




