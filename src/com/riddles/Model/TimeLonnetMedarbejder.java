package com.riddles.Model;

import com.riddles.Betaling;

public class TimeLonnetMedarbejder implements Betaling {
    private double timeLon;
    private double antalTimer;

    public TimeLonnetMedarbejder(double timeLon, double antalTimer) {
        this.timeLon = timeLon;
        this.antalTimer = antalTimer;
    }
//lønberegning er antal timer ganget med timelønnen.
    @Override
    public double beregnLon() {
        double lonBeregner = antalTimer * timeLon;
        return lonBeregner;
    }
}
