package a_Zadania.b_Dzien_2.a_Napisy;

public class Main4 {

    public static void main(String[] args) {
        String str="oskar harenda";
        String str2="r ha";
        boolean result = containsStr(str,str2);
        System.out.println(result);
    }

    static boolean containsStr(String str, String search){
        int dlugosc=search.length();
        for(int i=0; i<str.length()+1-search.length(); i++) {
            if (str.substring(i, i + search.length()).equals(search)) return true;
        }
        return false;
    }
}
