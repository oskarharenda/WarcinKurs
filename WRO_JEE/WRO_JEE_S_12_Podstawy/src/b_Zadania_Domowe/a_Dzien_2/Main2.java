package b_Zadania_Domowe.a_Dzien_2;


public class Main2 {

    public static void main(String[] args) {
//        char a='a';
//        int b=(int)a;
//
//        int c=97;
//        char d=(char)c;

        String widomocs="efg Os s p";
        int przesuniecie=3;

        String result=encode(widomocs,przesuniecie);
        System.out.println(result);

        String result2=decode(result,przesuniecie);
        System.out.println(result2);

    }
    static String encode(String str,int shift){
        int[] tab = new int[str.length()]; //tworzymy tablice do przecchowania wartosci znakow asci
        char[] tab2 = new char[str.length()]; //
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if (Character.isLowerCase(charArray[i])){
                if ((int)charArray[i]+shift>122) tab[i]=(int)charArray[i]+shift-26;
                else tab[i]=(int)charArray[i]+shift; // małe litery w kodzie ASCII mają numery od 97 do 122
                tab2[i]=(char)tab[i];
            }
            if (Character.isUpperCase(charArray[i])){
                if ((int)charArray[i]+shift>90) tab[i]=(int)charArray[i]+shift-26;
                else tab[i]=(int)charArray[i]+shift; // małe litery w kodzie ASCII mają numery od 97 do 122
                tab2[i]=(char)tab[i];
            }
        }
        String newOne = new String(tab2);
        return newOne;
    }
    static String decode(String str,int shift){
        int[] tab = new int[str.length()];
        char[] tab2 = new char[str.length()];
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if (Character.isLowerCase(charArray[i])){
                if ((int)charArray[i]-shift<97) tab[i]=(int)charArray[i]-shift+26;
                else tab[i]=(int)charArray[i]-shift; // małe litery w kodzie ASCII mają numery od 97 do 122
                tab2[i]=(char)tab[i];
            }
            if (Character.isUpperCase(charArray[i])){
                if ((int)charArray[i]-shift<65) tab[i]=(int)charArray[i]-shift+26;
                else tab[i]=(int)charArray[i]-shift; // duze litery w kodzie ASCII mają numery od 65 do 90
                tab2[i]=(char)tab[i];
            }
        }
        String newOne = new String(tab2);
        return newOne;
    }

}
