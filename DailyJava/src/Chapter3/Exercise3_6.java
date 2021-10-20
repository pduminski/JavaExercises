package Chapter3;

public class Exercise3_6 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 20) {
            if (i < 20) {
                System.out.printf(i + ",");
            } else {
                System.out.printf(i + ".");
            }
            i++;
        }
    }
}
