package Chapter1;

import java.io.*;

public class Exercise1_1 {
    public static void main(String[] args) throws IOException {
        double a;
        double b;
        double area;

        System.out.println("Exercise1_1");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program's objective is to calculate area of a rectangle");
        System.out.println("Provide side a: ");
        a = Double.parseDouble(br.readLine());

        System.out.println("Provide side b: ");
        b = Double.parseDouble(br.readLine());

        area = a * b;
        System.out.println(
                "Area of the rectangle with side a = " + a
                        + " and side b = " + b
                        + "equals: " + area);
    }
}
