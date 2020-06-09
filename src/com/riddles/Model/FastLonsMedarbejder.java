package com.riddles.Model;

import com.riddles.Betaling;

public class FastLonsMedarbejder implements Betaling {
    private double maanedsLon;

    public FastLonsMedarbejder(double maanedslon) {
        maanedsLon = maanedslon;
    }
    public FastLonsMedarbejder(){

    }

    @Override
    public double beregnLon() {

        return maanedsLon;
    }

    @Override
    public String toString() {
        return "FastLonsMedarbejder{" +
                "maanedsLon=" + maanedsLon +
                '}';
    }
}
