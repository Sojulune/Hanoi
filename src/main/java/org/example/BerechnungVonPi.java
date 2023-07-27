package org.example;

public class BerechnungVonPi {
    public static void main(String[] eingabeParameter) {
        var anzahlDerDurchlaeufe = Long.parseLong(eingabeParameter[0]);
        berechnePi(anzahlDerDurchlaeufe);
    }

    /*
      Geometrische Annäherung der Kreiszahl Pi über den Flächeninhalt von regelmäßigen n-Ecken
      Initial n-Eck ist ein Quadrat.
     */
    private static double berechnePi(long m) {
        var anzahlEcken = 4.0;
        var grundseite = wurzel(2.0);
        var hoehe = 1.0/wurzel(2.0);
        var flaechenInhaltVomNEck = anzahlEcken*grundseite*hoehe/2.0;

        for(long i= 1; i <= m; i++){
            anzahlEcken= aktualisiereAnzahlEcken(anzahlEcken);
            grundseite= aktualisiereGrundseite(grundseite, hoehe);
            hoehe= aktualisiereHoehe(grundseite);
            flaechenInhaltVomNEck = aktualisiereFlächeninhalt(anzahlEcken, grundseite, hoehe) ;
        }

        System.out.println("Die Annäherung von Pi ist= " + flaechenInhaltVomNEck);

        return flaechenInhaltVomNEck;
    }
    private static double aktualisiereAnzahlEcken(double n) {
        var ergebnis= n*2;
        return ergebnis;
    }
    private static double aktualisiereGrundseite(double g, double h) {
        var ergebnis= wurzel(potenz(g/2.0,2.0)+potenz(1-h,2.0));

        return ergebnis;
    }
    private static double aktualisiereHoehe(double g) {
        var ergebnis= wurzel(1.0-potenz(g/2.0,2.0));

        return ergebnis;
    }
    private static double aktualisiereFlächeninhalt(double n, double g, double h) {
        var ergebnis= n*g*h/2.0;

        return ergebnis;
    }
    private static double wurzel(double zahl) {
        return Math.sqrt(zahl);
    }
    private static double potenz(double basis, double exponent) {
        return Math.pow(basis, exponent);
    }
}