package pl.coderslab.ckontrolaprzeplywu;

public class Main08Sample {

    public static void main(String[] args) {
        //definicja zmiennej z ilością rzędów i gwiazdek w wierszu
        int n = 5;

        //tworzymy pętlę która będzie generowała nam WIERSZE
        for (int i = 0; i < n; i++) {
            String row = "";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza

            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 0; j < n; j++) {
                if(i>=j ) System.out.print("* ");
                else System.out.print(j+" ");
            }
            System.out.print(row + "\n");//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
        }
    }

}
