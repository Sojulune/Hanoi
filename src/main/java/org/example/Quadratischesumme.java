package org.example;

public class Quadratischesumme {
    public static void main(String[] args) {
        var n = Long.parseLong(args[0]);
        berechneQuadratische(n);
        berechneQuadratischesummeNachFormel(n);
    }
    private static long berechneQuadratische(long n) {
        var ergebnis = 0L;
        for(long i = 0; i <= n; i++){
            ergebnis = berechnePotenz(2,i)+ergebnis;
        }

        System.out.println("Summe von 0 bis "+ n +" von q^k= " + ergebnis);
        return ergebnis;
    }
    private static long berechnePotenz(long n, long q) {
        var ergebnis = 1L;
        for(long i = 1; i <= n; i++){
            ergebnis = q*ergebnis;
        }

        System.out.println(q + "^" + n + " = " + ergebnis);
        return ergebnis;
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