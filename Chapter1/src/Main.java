import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Exercise1_1");
        double a, b, area;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The objective of this program is to calculate area of the rectangle as double");
        System.out.println("Provide side a: ");
        a = Double.parseDouble(br.readLine());

        System.out.println("Provide side b: ");
        b = Double.parseDouble(br.readLine());

        area = a * b;
        System.out.println("Area of the rectangle with side a = " + a + " and side b = " + b + " equals: " + area);
    }
}
