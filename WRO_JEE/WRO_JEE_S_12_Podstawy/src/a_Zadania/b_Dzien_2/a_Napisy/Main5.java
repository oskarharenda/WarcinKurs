package a_Zadania.b_Dzien_2.a_Napisy;

public class Main5 {

    public static void main(String[] args) {
        String[] tablica={"OSkar","Harenda"};
        String result = stringFromArray(tablica);
        System.out.println(result);
    }

    static String stringFromArray(String[] str){
        String allWord = "";
        for (int i=0; i<str.length; i++){
            allWord=allWord.concat(str[i]);
        }
        return allWord;
    }
}
