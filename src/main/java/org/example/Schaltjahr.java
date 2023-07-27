package org.example;

public class Schaltjahr {
    public static void main(String[] args) {
        var jahr = Long.parseLong(args[0]);
        if (istSchaltjahr(jahr)) {
            System.out.println("Das Jahr " +jahr+ " ist ein Schaltjahr");
        } else
            System.out.println("Das Jahr " +jahr+ " ist kein Schaltjahr");
    }

    //1 ,4, 1800, 2000
    private static boolean istSchaltjahr(long jahr) {
        if (jahr % 4 == 0) {// jahr % 100 != 0 && jahr % 400 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }

        return false;
    }
}