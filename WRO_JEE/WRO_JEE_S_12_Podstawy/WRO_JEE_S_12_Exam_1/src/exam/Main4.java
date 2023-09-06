package exam;

import java.util.Scanner;

public class Main4 {
    public static void main (String[] args){
        int[] tab = returnTab();
        for (int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }


    }
    public static int[] returnTab(){
        Scanner scanner = new Scanner(System.in);
        int tabLanght = scanner.nextInt();
        int[] tab = new int[tabLanght];
        for (int i=0; i<tab.length; i++){
            tab[i]=i+1;
        }
        return tab;
    }
}
