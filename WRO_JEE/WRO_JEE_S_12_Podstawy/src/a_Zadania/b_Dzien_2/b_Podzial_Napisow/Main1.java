package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) {

    String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
        StringTokenizer podzielacz = new StringTokenizer(str);
        System.out.println(podzielacz.countTokens());

        while(podzielacz.hasMoreTokens()){
            String token = podzielacz.nextToken();
            System.out.println('\''+token+'\'');
        }
        String[] parts = str.split(" ");
        System.out.println();
        System.out.println(parts.length);
        for (String part :parts) {
            System.out.println('\'' + part + '\'');
        }


    }
}
