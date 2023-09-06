package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {

    public static void main(String[] args) {
        String imie="Oskar ";
        String nazwisko="Harenda ";
        String nick="Sos ";
        String result = createName(imie,nazwisko,nick);
        System.out.println(result);
    }
    static String createName (String name, String surname, String nickname){
        String all=name+surname+nickname;
        return all;
    }

}
