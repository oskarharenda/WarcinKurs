package pl.coderslab.eparametrystartowe;

public class Main04 {

    public static void main(String[] args) {
        int bok[]= new int[3];
        boolean trojkat=false;
        for(int i=0; i<args.length; i++)
        {
            bok[i] = Integer.parseInt(args[i]);
        }
        if (bok[0]+bok[1]>bok[2] && bok[0]+bok[1]>bok[2] && bok[0]+bok[1]>bok[2] ) trojkat=true;
        System.out.println(trojkat);
    }
}
