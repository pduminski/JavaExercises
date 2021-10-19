package Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1_4 {
    public static void main(String[] args) throws IOException {
        double r, objetosc;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza objętość kuli.");
        System.out.println("Podaj promień r: ");
        r = Double.parseDouble(br.readLine());

        objetosc = 4 * Math.PI * r * r * r / 3;

        System.out.println("Objętość kuli o promieniu " + r + " = ");
        System.out.printf("%2.2f", r);
        System.out.println(" wynosi ");
        System.out.printf("%2.2f.", objetosc);
        System.out.println();
    }
}
