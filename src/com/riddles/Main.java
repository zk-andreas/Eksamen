package com.riddles;

import com.riddles.Model.FastLonsMedarbejder;
import com.riddles.Model.ListeAfmedArb;
import com.riddles.Model.ProvisionsMedarbejder;
import com.riddles.Model.TimeLonnetMedarbejder;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Betaling> medarbejder = new ArrayList<>();
    public static void main(String[] args) {

        ListeAfmedArb lm = new ListeAfmedArb();



        FastLonsMedarbejder fm = new FastLonsMedarbejder(24000);
        System.out.println(fm.beregnLon());

        TimeLonnetMedarbejder tm = new TimeLonnetMedarbejder(170, 160);
        System.out.println(tm.beregnLon());

        ProvisionsMedarbejder pm = new ProvisionsMedarbejder(20, 10000.0,20000.0);
        System.out.println(pm.beregnLon());

        medarbejder.add(fm);
        medarbejder.add(tm);
        medarbejder.add(pm);

        for(Betaling bl : medarbejder){

            System.out.println(bl.beregnLon());

        }
        lm.addMed(tm);
    }
}
