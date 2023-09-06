package a_Zadania.b_Dzien_2.a_Napisy;

public class Main2 {

    public static void main(String[] args) {
        String napis = "napisp";
        char a = 'p';
        int position = charPos(napis,a);
        System.out.println(position);
    }

    static int charPos(String str, char c) {
        int firstIndeks = 0;
        for(int i=0; i<str.length(); i++) {
            if (c == str.charAt(i)) {
                firstIndeks = i;
                break;
            }
        }
        return firstIndeks;
    }
}
