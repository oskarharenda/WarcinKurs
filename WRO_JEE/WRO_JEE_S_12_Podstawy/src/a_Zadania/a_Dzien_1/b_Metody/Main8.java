package a_Zadania.a_Dzien_1.b_Metody;


public class Main8 {
    static int maxOfThree(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else {
                return c;
            }
        }
        else {
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
}
