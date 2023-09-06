package exam;

public class Main7 {
    public static void main (String[] args){
        String name ="PO5ZUK4J I DOD4J UKRYT3 CYFRY";
        System.out.println(countNumbers(name));

    }
    public static int countNumbers(String str){
        int sum = 0;
        char[] charArray = str.toCharArray();
        for (int i=0; i<charArray.length; i++){
            if(Character.isDigit(charArray[i]) ){
                int num = Integer.parseInt(String.valueOf(charArray[i]));
                sum+=num;
            }
        }
        return sum;
    }
}
