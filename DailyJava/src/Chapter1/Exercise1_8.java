package Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1_8 {
    public static void main(String[] args) throws IOException {
        double a, b, pole;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Program oblicza pole prostokąta.");
            System.out.println("Podaj bok a: ");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj bok b: ");
            b = Double.parseDouble(br.readLine());

            pole = a * b;

            System.out.println("Pole prostokąta o boku a = " + a + " i boku b = " + b);
            System.out.println("wynosi: " + pole + ".");
        } catch (NumberFormatException exception) {
            System.out.println("Nie wczytano liczby. Koniec programu");
        }
    }
}
