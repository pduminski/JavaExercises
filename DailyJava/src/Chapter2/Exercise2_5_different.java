package Chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Exercise2_5_different {
    public static void main(String[] args) throws IOException {
        double losuj_liczbe, zgadnij_liczbe;
        int liczba_prob = 0;
        boolean czy_nadal_gra = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program losuje liczbę z przedziału 1 - 9. Zgadnij tę liczbę");

        Random r = new Random();
        losuj_liczbe = Math.round(10 * (r.nextDouble()));
        zgadnij_liczbe = Double.parseDouble(br.readLine());

        while(czy_nadal_gra) {
            liczba_prob++;
            if (losuj_liczbe == zgadnij_liczbe) {
                System.out.println("Gratulacje! Odgadłeś liczbę!");
                System.out.println("Liczba prób: " + liczba_prob);
                czy_nadal_gra = false;
            } else {
                System.out.println("Nie zgadłeś! Podaj kolejną liczbę ");
                zgadnij_liczbe = Double.parseDouble(br.readLine());
            }
        }
    }
}
