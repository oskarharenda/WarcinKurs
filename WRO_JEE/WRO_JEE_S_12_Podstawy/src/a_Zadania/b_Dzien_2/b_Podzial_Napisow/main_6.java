package a_Zadania.b_Dzien_2.b_Podzial_Napisow;

public class main_6 {
    int n=1000;
    public static void main (String[] args){
        testStrings(1_000);
        testStrings(10_000);
        testStrings(100_000);
        testStrings(200_000);
        testStrings(500_000);
        testStrings(1_000_000);
    }

    private static void testStrings(int n) {
        long start, end;
        start=System.currentTimeMillis();
        buildStringWithString(n);
        end=System.currentTimeMillis();
        System.out.println(end-start+" ms ");
    }

    static void buildStringWithString(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append("a");
        }
        String str = s.toString();
        System.out.println(str.length());
    }

}
//6 ms
//30 ms
//1434 ms
//3723 ms
//23556 ms
//125582 ms