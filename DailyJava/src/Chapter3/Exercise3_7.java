package Chapter3;

public class Exercise3_7 {
    public static void main(String[] args) {
        int suma = 0;

        for(int i = 1; i <= 100; i++) {
            suma += i;
            if (i < 100) {
                System.out.printf(suma + ",");
            } else {
                System.out.printf(suma + ".");
            }

        }
        System.out.println(" ");
        System.out.println("Suma końcowa: " + suma);
    }
}
