package Chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_4 {
    public static void main(String[] args) throws IOException {
        double a, b, c, x;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("System oblicza wartość x z równania liniowego ax + b = c");

        System.out.println("Podaj a: ");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("Niedozlolona wartość współczynnika a");
        } else {
            System.out.println("Podaj b: ");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj c: ");
            c = Double.parseDouble(br.readLine());

            x = (c - b) / a;

            System.out.printf("Dla a = %2.2f,", a);
            System.out.printf(" b = %2.2f,", b);
            System.out.printf(" c = %2.2f", c);
            System.out.printf(" wartość x = %2.2f\n", x);
        }
    }
}
