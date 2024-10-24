/*Nilai Mahasiswa ada A B C, A = 80-100, B= 70 - 80, C= 50-70 */
import java.util.Scanner;
public class MahasiswaNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai anda : ");
        int nilaiMHS = sc.nextInt();

        if (nilaiMHS >=80 && nilaiMHS <= 100) {
            System.out.println("Mahasiswa A");
        } else if (nilaiMHS >=70 && nilaiMHS <= 80) {
            System.out.println("Mahasiswa B");
        } else if (nilaiMHS >= 50 && nilaiMHS <=70) {
            System.out.println("Mahasiswa C");
        } else {System.out.println("Nilai Invalid");
    }
        
    }
}
