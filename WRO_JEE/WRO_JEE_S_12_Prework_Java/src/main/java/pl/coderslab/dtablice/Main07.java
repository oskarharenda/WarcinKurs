package pl.coderslab.dtablice;

public class Main07 {

    public static void main(String[] args) {
        double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        double suma=0;
        double avg=0;
        for(int i=0; i<temps.length; i++){
            temps[i] *= 1.8;
            temps[i] += 32;
            suma += temps[i];
        }
        avg = suma / temps.length;
        System.out.println(String.format("%.2f",avg));
    }

}
