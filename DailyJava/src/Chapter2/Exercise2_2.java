package Chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_2 {
    public static void main(String[] args) throws IOException {
        double a, b, c, delta, x1, x2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pierwiastki równania ax^2 + bx + c = 0");
        System.out.println("Podaj a: ");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("Niedozwolona warość współczynnika a.");
        } else {
            System.out.println("Podaj b: ");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj c: ");
            c = Double.parseDouble(br.readLine());

            delta = b * b - 4 * a * c;

            if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.printf("Dla a = " + "%4.2f", a);
                System.out.printf(" b = " + "%4.2f", b);
                System.out.printf(" c = " + "%4.2f\n", c);
                System.out.println("trójmian ma jeden pierwiastek podwójny x1 = ");
                System.out.printf("%4.2f", x1);
                System.out.println(" ");
            } else {
                // TODO I don't wanna to it right now. Too boring.
            }
        }
    }
}
