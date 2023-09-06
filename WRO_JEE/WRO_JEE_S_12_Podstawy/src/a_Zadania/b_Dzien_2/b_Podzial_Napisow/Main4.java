package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main4 {

    public static void main(String[] args) {
        String napis="to-jest-napis-java";
        String separator="-";

        String result[]=onlyTwoElements(napis,separator);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
    static String[] onlyTwoElements(String str, String separator) {
        String part1;
        String[] parts = str.split(separator);
        part1 = parts[0];


        StringBuilder sb = new StringBuilder();
        for(int i=1; i<parts.length; i++){
            sb.append(parts[i]);
            if(i<parts.length-1) sb.append(separator);
        }
        String part2=sb.toString();


        String[] tab = new String[2];
        tab[0] = part1;
        tab[1] = part2;
        return tab;
    }
}