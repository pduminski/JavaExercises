package Chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Exercise2_5 {
    public static void main(String[] args) throws IOException {
        double losuj_liczbe, zgadnij_liczbe;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program losuje liczbę z przedziału 1 - 9. Zgadnij tę liczbę");

        Random r = new Random();
        losuj_liczbe = Math.round(10 * (r.nextDouble()));
        zgadnij_liczbe = Double.parseDouble(br.readLine());

        if (losuj_liczbe == zgadnij_liczbe) {
            System.out.println("Gratulacje! Odgadłeś liczbę!");
        } else {
            System.out.println("Bardzo mi przykro, ale wylosowana liczba to: ");
            System.out.println((int)losuj_liczbe + ".");
        }
    }
}
