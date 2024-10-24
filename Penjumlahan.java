import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        // Menjumlahkan kedua angka
        int hasil = angka1 + angka2;
        
        // Menampilkan hasil
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
