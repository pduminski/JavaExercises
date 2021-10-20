package Chapter3;

public class Exercise3_2 {
    public static void main(String[] args) {
        int x = 0, y = 0; // ustalenie wartości początkowych

        do {
            y = 3 * x;
            System.out.println("x = " + x + " \t y = " + y);
            x++;
        } while(x <= 10);
    }
}
