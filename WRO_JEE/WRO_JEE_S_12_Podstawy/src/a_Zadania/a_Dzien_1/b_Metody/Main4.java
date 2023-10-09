package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {
    public static void main (String[] args){
        String dowyswietlenia = createName("Maciek", "Dul", "Admiral");
        System.out.println(dowyswietlenia);
    }
    static String createName(String name, String surname, String nickname){
        return name +" " + nickname + " " + surname;
    }
}
