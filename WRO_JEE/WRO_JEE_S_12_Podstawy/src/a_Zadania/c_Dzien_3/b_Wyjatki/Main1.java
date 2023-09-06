package a_Zadania.c_Dzien_3.b_Wyjatki;


import java.io.FileNotFoundException;

public class Main1 {

    public static void main(String[] args) {
        try{
            System.out.println(factorial(9));
            System.out.println(factorial(-3));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("cos poszło nie tak..."+ e.getMessage());
            e.printStackTrace();
        }

    }

    static int factorial(int number) throws IllegalArgumentException{
        if (number<0){
            throw new IllegalArgumentException("nie ma silni z liczb ujemnych");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
