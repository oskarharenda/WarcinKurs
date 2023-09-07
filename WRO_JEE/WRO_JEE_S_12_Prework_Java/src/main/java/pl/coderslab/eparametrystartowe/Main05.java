package pl.coderslab.eparametrystartowe;

public class Main05 {

    public static void main(String[] args) {
        float points = Integer.parseInt(args[0]);
        String mark="BADVALUE";
        if (0<=points && points<=50) mark="F";
        else if (50<points && points<=70) mark="E";
        else if (70<points && points<=90) mark="C";
        else if (90<points && points<=100) mark="A";
        System.out.println(mark);
    }

}
