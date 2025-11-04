
import java.util.Scanner;

public class rekapNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        double totalNilai = 0.0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;

            double rataRata = totalNilai / jumlahSiswa;
            System.out.println("Rata-rata nilai ujian produktif: " + rataRata);}
                
    }
    
}
