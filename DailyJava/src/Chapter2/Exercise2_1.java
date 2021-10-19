package Chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_1 {
    public static void main(String[] args) throws IOException {
        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj bok a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok b: ");
        b = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok b: ");
        c = Integer.parseInt(br.readLine());

        if ((a * a + b * b) == c * c) {
            System.out.println("Boki: ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("tworzą trójkąt postokątny");
        } else {
            System.out.println("Boki: ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("nie tworzą trójkąta postokątnego");
        }
    }
}
