package b_Zadania_Domowe.a_Dzien_2;


public class Main1 {

    public static void main(String[] args) {
//        char a='a';
//        int b=(int)a;
//
//        int c=97;
//        char d=(char)c;

        String widomocs="XYz n";

        String result=encode(widomocs);
        System.out.println(result);

    }
    static String encode(String str){
        int[] tab = new int[str.length()];
        char[] tab2 = new char[str.length()];
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if (Character.isLowerCase(charArray[i])){
                if ((int)charArray[i]+3>122) tab[i]=(int)charArray[i]+3-26;
                else tab[i]=(int)charArray[i]+3; // małe litery w kodzie ASCII mają numery od 97 do 122
                tab2[i]=(char)tab[i];
            }
            if (Character.isUpperCase(charArray[i])){
                if ((int)charArray[i]+3>90) tab[i]=(int)charArray[i]+3-26;
                else tab[i]=(int)charArray[i]+3; // małe litery w kodzie ASCII mają numery od 97 do 122
                tab2[i]=(char)tab[i];
            }
        }
        String newOne = new String(tab2);
        return newOne;
    }

}
