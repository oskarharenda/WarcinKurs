package a_Zadania.a_Dzien_1.b_Metody;


public class Main10 {

    public static void main(String[] args) {
        int a=2;
        int b=2;
        int c=1;
        int d=1;
        String result=factorial(a,b,c,d);
        System.out.println(result);
    }
    static String factorial(int a, int b, int c,int d){
        /*
        a-gole przez druzyne A na boisku A;
        b-gole przez druzyne B na boisku A;
        c-gole przez druzyne A na boisku B;
        d-gole przez druzyne B na boisku B;
         */
        if (a+c>b+d) return "1"; //wygrywa drużyna A
        else if (b+d>a+c) return "2"; //wygrywa drużyna B
        else if (b>c) return "2"; //wygrywa drużyna B
        else if (c>b) return "1"; //wygrywa drużyna A
        else return "x"; //rems
    }
}
