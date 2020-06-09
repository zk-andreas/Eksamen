package com.riddles.Model;

import com.riddles.Betaling;

//Klassen ProvisionsMedarbejder har flg. attributter:
//• grundløn
//• salg
//• provision (procentsats)
//Lønberegning er grundløn plus provision af medarbejderens salg.
//Eksempel: Grundløn 20000 kr. Salg 10000 kr. Provision 20% giver en løn på 22000kr.
public class ProvisionsMedarbejder implements Betaling {
    private double provision;
    private double salg;
    private double grundLon;

    public ProvisionsMedarbejder(double provision, double salg, double grundLon) {
        this.provision = provision;
        this.salg = salg;
        this.grundLon = grundLon;
    }

    @Override
    public double beregnLon() {
        //double lonBeregner = (double)(salg*(provision/grundLon));
        //provision = (salg/grundLon)*100;
        //double lonBeregner =  salg * grundLon / provision;

        double lonBeregner = (grundLon) + salg * provision/100;

        return lonBeregner;

    }
}
