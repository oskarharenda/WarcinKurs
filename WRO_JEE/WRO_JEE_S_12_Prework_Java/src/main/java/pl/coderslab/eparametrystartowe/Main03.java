package pl.coderslab.eparametrystartowe;

public class Main03 {
    public static void main(String[] args) {
        int elements[]= new int[5];
        int sum=0;
        for(int i=0; i<args.length; i++)
        {
            elements[i] = Integer.parseInt(args[i]);
            sum+=elements[i];
        }
        int avarage=sum/args.length;
        System.out.println("średnia: "+avarage);
    }
}
