package org.example;

public class GaussFormel {
    public static void main(String[] args) {
        var n = Long.parseLong(args[0]);
        berechneSumme(n);
        berechneSummeNachGauss(n);
    }

    private static long berechneSumme(long input) {
        var ergebnis = 0L;
        for(long i = 0; i <= input; i++){
            ergebnis = i+ergebnis;
        }

        System.out.println("Summe von 0 bis "+ input +" = " + ergebnis);
        return ergebnis;
    }

    private static long berechneSummeNachGauss(long n) {
        var ergebnis = 0L;
        var zaehler= n*(n+1);
        var nenner= 2;
        ergebnis= zaehler / nenner;
        System.out.println("Ergebnis nach Gauss:" +ergebnis);
        return ergebnis;
    }
}