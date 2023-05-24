import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] tablica = {'P','E','P','S','I'};

        System.out.println("Tablica wejsciowa: " + Arrays.toString(tablica));

        int indeksDoUsuniecia = 2;
        int dlugoscTablicy = tablica.length;

        if (indeksDoUsuniecia >= 0 && indeksDoUsuniecia < dlugoscTablicy) {
            char[] nowaTablica = new char[tablica.length - 1];
            for (int i = 0, j = 0; i < tablica.length; i++) {
                if (i != indeksDoUsuniecia) {
                    nowaTablica[j] = tablica[i];
                    j++;
                }
            }
            System.out.println("Tablica wyjsciowa: " + Arrays.toString(nowaTablica));
        } else {
            System.out.println("Zle");
        }
    }
}

