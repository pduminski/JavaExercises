package Chapter3;

public class Exercise3_5 {
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i < 20) {
                System.out.printf(i + ",");
            } else {
                System.out.printf(i + ".");
            }
            i++;
        } while (i <= 20);
    }
}
