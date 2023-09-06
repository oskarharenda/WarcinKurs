package b_Zadania_Domowe.a_Dzien_2;

public class Main7 {

    public static void main(String[] args) {
        String napis="Oskar kurwa poszedł chuj";
        String[] wulgarne = {"kurwa","chuj"};

        String result = censor(napis, wulgarne);
        System.out.println(result);


    }
    static String censor(String str, String[] words){
        String nowy=" ";
        String[] parts = str.split(" ");
        for(int i =0; i<parts.length; i++){
            for(int j=0; j<words.length; j++){
                if (parts[i].equals(words[j])) parts[i]="****";
            }
        }
        for(int i=0; i<parts.length; i++){
            nowy+=parts[i];
            nowy+=" ";
        }
        return nowy;
    }


}
