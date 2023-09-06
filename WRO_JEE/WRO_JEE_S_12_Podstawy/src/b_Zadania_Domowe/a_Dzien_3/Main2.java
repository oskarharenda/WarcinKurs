package b_Zadania_Domowe.a_Dzien_3;


public class Main2 {

    public static void main(String[] args) {
        String[] tab ={"oskar", "patka","targon","armand"};
        try {
            safeGet(tab,6);
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    static String safeGet(String[] strTab, int index) {
        if (index >= strTab.length) {
            throw new IllegalArgumentException("Nie ma takiej zawartości tablicy");
        }
        String napis=strTab[index];
        System.out.println(napis);
        return napis;
    }

}
