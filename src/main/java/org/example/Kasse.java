package org.example;

import java.util.Map;

public class Kasse {
    public static void main(String[] args) {
        Map<String, Double> produktPreise = Map.of("joghurt", 1.99, "brot", 2.19,
                "schokolade", 2.00, "apfel", 0.80, "milch", 2.99,
                "chips", 2.50, "müsli", 4.50, "sushi", 7.85,
                "tomaten", 2.95, "salat", 3.75);
        var preis = 0.0;
        for (String produkt : args) {
            var produktbezeichnungKleinbuchstaben = produkt.toLowerCase();
             if  (produktPreise.get(produktbezeichnungKleinbuchstaben)== null){
                 System.out.println("Produkt "+ produkt+" nicht vorhanden");
                 break;
             }

            preis = preis + produktPreise.get(produktbezeichnungKleinbuchstaben).doubleValue();
        }
        System.out.println("Preis: " + preis);
    }

//        berechneQuadratische(n);
//        berechneQuadratischesummeNachFormel(n);
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