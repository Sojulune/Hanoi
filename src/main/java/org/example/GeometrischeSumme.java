package org.example;

public class GeometrischeSumme {
    public static void main(String[] args) {
        var n = Long.parseLong(args[0]);
        var q = Long.parseLong(args[1]);
        berechneGeometrischeSumme(n, q);
        berechneGeometrischesummeNachFormel(n, q);
    }
    private static long berechneGeometrischeSumme(long n, long q) {
        var ergebnis = 0L;
        for(long i = 0; i <= n; i++){
            ergebnis = berechnePotenz(i,q)+ergebnis;
        }

        System.out.println("Summe von 0 bis "+ n +" von q^k= " + ergebnis);
        return ergebnis;
    }
    private static long berechnePotenz(long n, long q) {
        var ergebnis = 1L;
        for(long i = 1; i <= n; i++){
            ergebnis = q*ergebnis;
        }

        System.out.println("q^n = " + ergebnis);
        return ergebnis;
    }

    private static long berechneGeometrischesummeNachFormel(long n, long q) {
        var ergebnis = 0L;
        var zaehler= 1- berechnePotenz(n+1,q);
        var nenner= 1-q;
        ergebnis= zaehler / nenner;
        System.out.println("Ergebnis nach Formel:" +ergebnis);
        return ergebnis;
    }
}