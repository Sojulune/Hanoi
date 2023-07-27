package org.example;

public class Fakultaet {
    public static void main(String[] args) {
        var n = Long.parseLong(args[0]);
        var k = Long.parseLong(args[1]);
        berechneBinomialkoeffizient(n, k);
    }

    private static long berechneFakultaet(long input) {
        var ergebnis = 1L;
        for(long i = 1; i <= input; i++){
            ergebnis = i*ergebnis;
        }

        System.out.println(input + "! = " + ergebnis);
        return ergebnis;
    }

    private static long berechneBinomialkoeffizient(long n, long k) {
        var ergebnis = 1L;
        var zaehler= berechneFakultaet(n);
        var nenner= berechneFakultaet(k)*berechneFakultaet(n-k);
        ergebnis= zaehler / nenner;
        System.out.println("Ergebnis:" +ergebnis);
        return ergebnis;
    }
}