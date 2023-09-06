package exam;

public class Main6 {
    public static void main (String[] args){
        String str1="OSkar Harenda i Patrycja Wojtowicz";
        String str2="Wojtowicz";
        String str3="Harenda";
        System.out.println(replaceStr(str1,str2,str3));

    }
    public static String replaceStr(String str, String forReplace, String replacement){
        String replace = str.replaceAll(forReplace, replacement);
        return replace;
    }
}
