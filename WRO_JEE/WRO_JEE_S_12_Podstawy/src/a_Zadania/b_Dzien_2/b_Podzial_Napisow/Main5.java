package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


public class Main5 {
        public static void main(String[] args) {
            String sourceText = "[Its] language is as bare as a monk's cell, and as uninviting";
            String computedText = computeThoughts(sourceText);
            System.out.println(computedText);
        }
        /**
         * Metoda computeThoughts wykonuje przekształcenie przekazanej myśli do nowej, lepszej postaci.
         *
         * UWAGA: Szczegóły implementacyjne metody
         *
         * Krok 1:  Znajduje w przekazanym tekście źródłowym pierwsze słowo zaczynające się na literę 'i'.
         *
         * Krok 2.  Wycina znalezione słowo z tekstu źródłowego do późniejszego użycia.
         *
         * Krok 3.  Oblicza długość znalezionego słowa, zwiększa ją czterokrotnie i dodaje do niej 1. Wyliczona wartość
         *          zostaje zapamiętana do późniejszych obliczeń.
         *
         * Krok 4.  Znajduje w tekście źródłowym pierwsze wystąpienie znaku `l` (litera el) i wycina z tekstu źródłowego
         *          fragment od tego znaku (włącznie) i kolejne X znaków (niewłącznie), gdzie X jest równe wartości wyliczonej w Kroku 3.
         *          Wartość zostaje zapamiętana do późniejszego użycia.
         *
         * Krok 5.  Oblicza długość tekstu źródłowego, dzieli ją przez 1.17 i zwiększa o 1. Wyliczona wartość zostaje
         *          zapamiętana do późniejszych obliczeń.
         *
         * Krok 6.  Wycina z tekstu źródłowego fragment zaczynający się od indeksu o wartości Y (gdzie Y to wartość obliczona
         *          w Kroku 5.) oraz kolejnych 2 do potęgi 3-ej znaków (Math.pow(2, 3)). Wartość zostaje zapamiętana do późniejszego użycia
         *
         * Krok 7.  Zwraca połączenie tekstu "Java ", tekstu z Kroku 4., tekstu z Kroku 2., tekstu " ", tekstu z Kroku 6.
         oraz tekstu " \u003B\u0029".
         */
        public static String computeThoughts(String source) {
            String[] parts = source.split(" ");
            // Tutaj uzupełnij implementację, aby była zgodną z algorytmem w dokumentacji metody.
            return "";
        }
    }