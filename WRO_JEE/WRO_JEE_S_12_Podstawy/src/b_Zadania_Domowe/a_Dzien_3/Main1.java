package b_Zadania_Domowe.a_Dzien_3;


public class Main1 {

    public static void main(String[] args) {
        try{
            average("2","3");
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



    }
    static void average(String a, String b){
        if (b.equals("0")){
            throw new IllegalArgumentException("nie można dzielić przez 0!!!");
        }
        int numer1 = Integer.parseInt(a);
        int numer2 = Integer.parseInt(b);
        int c=numer1/numer2;
        System.out.println(c);
    }

}
