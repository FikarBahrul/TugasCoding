public class ContohFaktor{
    public static int hitungFaktorial(int n) {
        if (n==0) {
            return 1;

        } else {
            return n * hitungFaktorial(n-1);

        }
    }
    public static void main(String[] args) {
        int n = 5;
        int hasilFaktorial = hitungFaktorial(n);
        System.out.println("Faktorial dari " +n+ " adalah " + hasilFaktorial);
    }
}
