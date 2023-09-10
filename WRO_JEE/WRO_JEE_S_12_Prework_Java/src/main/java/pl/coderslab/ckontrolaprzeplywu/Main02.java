package pl.coderslab.ckontrolaprzeplywu;
public class Main02 {

    public static void main(String[] args) {

        int number1 = 3;
        int number2 = 7;
        int number3 = 11;
        if (number1 > number2 && number1 > number3){
            System.out.println("Highest number is " + number1);
        }
        else if (number2 > number3){
            System.out.println("Highest number is " + number2);
        }
        else {
            System.out.println("Highest number is " + number3);
        }

    }

}
