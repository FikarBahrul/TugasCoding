public class contohNestedIf {
    public static void main(String[] args) {
        int number = 3;

        if (number > 0) {
            System.out.println("Angka positif");

            if (number % 2 == 0) {
                System.out.println("Angka genap");
            } else {
                System.out.println("Angka ganjil");
            }

        } else {
            if (number == 0) {
                System.out.println("Angka adalah nol");
            } else {
                System.out.println("Angka negatif");
            }
        }
    }
}
