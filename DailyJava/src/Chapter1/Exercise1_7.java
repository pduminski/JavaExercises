package Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1_7 {
    public static void main(String[] args) throws IOException {
        float x, y, suma, roznica, iloczyn, iloraz;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza sumę, różnicę, iloczyn oraz iloraz dwóch liczb x oraz y.");
        System.out.println("Podaj x: ");
        x = Float.parseFloat(br.readLine());
        System.out.println("Podaj y: ");
        y = Float.parseFloat(br.readLine());

        suma = x + y;
        roznica = x - y;
        iloczyn = x * y;
        iloraz = x / y;

        System.out.printf("Dla liczb: x = " + "%2.2f", x);
        System.out.printf(" i y = " + "%2.2f", y);
        System.out.println(" "); // wyświetlenie pustej linii
        System.out.printf("Suma = " + "%2.2f\n", suma);
        System.out.printf("Różnica = " + "%2.2f\n", roznica);
        System.out.printf("Iloczyn = " + "%2.2f\n", iloczyn);
        System.out.printf("Iloraz = " + "%2.2f\n", iloraz);
    }
}
