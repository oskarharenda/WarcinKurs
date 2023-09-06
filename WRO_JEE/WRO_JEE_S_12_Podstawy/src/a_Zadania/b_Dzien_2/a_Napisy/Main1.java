package a_Zadania.b_Dzien_2.a_Napisy;

public class Main1 {

    public static void main(String[] args) {

    String str = "CodersLab jak dobrze zacząć programować";
        int length = str.length();
        int secondLastIndex = length-2;
        char secondLastChar = str.charAt(secondLastIndex);
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c==secondLastChar) count++;
        }
        System.out.println(count);
    }
}
