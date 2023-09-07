package pl.coderslab.ckontrolaprzeplywu;

public class Main03 {

	public static void main(String[] args) {

        int nr1 = 3;
        int nr2 = 7;
        int nr3 =11;
        if (nr1 > nr2 && nr1 > nr3) {
            System.out.println("najwieksza liczba to: " + nr1);
        } else if(nr2>nr3) {
            System.out.println("najwieksza liczba to: " + nr2);
        }
        else {
            System.out.println("największa liczba to: " + nr3);
        }

	}

}
