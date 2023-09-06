package b_Zadania_Domowe.a_Dzien_3;


public class Main4 {

    public static void main(String[] args) {
        System.out.println(toInt("m"));

    }
    static int toInt(String str){
        char[] charArray = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if (!Character.isDigit(charArray[i])) {
                throw new IllegalArgumentException("Wprowadzony ciąg znaków nie jest liczbą w systemie dziesiętnym");
            }
        }
        return Integer.parseInt(str);
    }
}
