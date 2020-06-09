package com.riddles.Model;

import com.riddles.Betaling;

import java.util.ArrayList;

public class ListeAfmedArb {
    public ArrayList<Betaling> medList;

    public ListeAfmedArb() {
        this.medList = new ArrayList<>();
    }
    public void addMed(Betaling medarbejder){
        medList.add(medarbejder);
    }
}
