package com.example.ananc.compapp;

/**
 * Created by Hp1 on 12/12/2017.
 */

public class MissionClass {
    private String Mission,Date;

    public  MissionClass(){}

    public MissionClass(String mission, String date) {
        Mission = mission;
        Date = date;
    }

    public String getMission() {
        return Mission;
    }

    public void setMission(String mission) {
        Mission = mission;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "MissionClass{" +
                "Mission='" + Mission + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
