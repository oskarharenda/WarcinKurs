package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main6 {

    public static void main(String[] args) {
        try{
            divide(3,0);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    static int divide (int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Nie dziel przez 0");
        }
        return a/b;
    }

}
