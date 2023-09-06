package b_Zadania_Domowe.a_Dzien_3;


public class Main3 {

    public static void main(String[] args) {
        //dla null zeraca wyjątek: NullPointerException
            System.out.println(getLength(null));


    }
    static int getLength(String str){
        if(str==null){
            System.out.println("String nie moze byc null");
            throw new NullPointerException("nie można obliczyć długości dla null!!!");
        }
        return str.length();
    }


}
