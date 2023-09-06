package b_Zadania_Domowe.a_Dzien_2;


public class Main3 {

    public static void main(String[] args) {
        String napis="napisinapis";
        int a =3;

        String result = upperCase(napis,a);
        System.out.println(result);

    }
    static String upperCase(String str, int index){
        char[] charArray = str.toCharArray();
        char[] newString = new char[str.length()];
        for(int i=0; i<charArray.length; i++){
            if (i%index==0) {
                newString[i]=Character.toUpperCase(charArray[i]);
            }
            else newString[i]=charArray[i];
        }
        String newOne = new String(newString);
        return newOne;
    }
}
