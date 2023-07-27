package org.example;

import java.util.ArrayList;
import java.util.List;

public class TuermeVonHanoi {
    public static void main(String[] args) {
        var anzahlDerSteine = Integer.parseInt(args[0]);
//        System.out.println(turm1.toString());

//        turm1.remove(0);
//        var n = Long.parseLong(args[0]);
//        berechneQuadratische(n);
//        berechneQuadratischesummeNachFormel(n);
    }
    private static void berechneQuadratische(int anzahlDerSteine) {
        var turm1 = new ArrayList<Integer>();

        for (int stein= 1; stein<=anzahlDerSteine; stein++){
            turm1.add(stein-1,stein);
        }
        var turm2 = new ArrayList<Integer>();
        var turm3 = new ArrayList<Integer>();

        while (istSpielGeloest(turm3, anzahlDerSteine)){

        }
    }
    private static boolean istSpielGeloest(List<Integer> turm3, int anzahlDerSteine) {
        if (turm3.size()!=anzahlDerSteine){
            return false;
        }
        for(int position=0;position<anzahlDerSteine;position++){
            turm3.get(position);
            if (turm3.get(position)!=position+1){
                return false;
            }
        }

        return true;
    }

    private static long berechneQuadratischesummeNachFormel(long n) {
        var ergebnis = 0L;
        var zaehler= n * (n+1)* (2*n+1);
        var nenner= 6;
        ergebnis= zaehler / nenner;
        System.out.println("Ergebnis nach Formel:" +ergebnis);
        return ergebnis;
    }
}