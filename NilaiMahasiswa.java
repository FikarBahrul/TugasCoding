import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai mahasiswa: ");
        int nilaiMHS = scanner.nextInt();

        if (nilaiMHS >= 50) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}