Penjelasan Cara Kerja Program
import java.util.Scanner;: Baris ini "mengimpor" kelas Scanner dari pustaka Java, yang penting agar program bisa membaca input dari keyboard pengguna.

Scanner scanner = new Scanner(System.in);: Baris ini membuat objek scanner baru yang terhubung ke input standar sistem (keyboard).

System.out.print("Masukkan jumlah siswa: ");: Program menampilkan teks ini untuk memberi tahu pengguna apa yang harus diinput.

int jumlahSiswa = scanner.nextInt();: Program akan berhenti sejenak dan menunggu pengguna mengetikkan angka (jumlah siswa). Angka tersebut kemudian disimpan dalam variabel jumlahSiswa.

double totalNilai = 0.0;: Kita membuat "wadah" bernama totalNilai untuk menjumlahkan semua nilai siswa. Kita mulai dari 0.

for (int i = 1; i <= jumlahSiswa; i++) { ... }: Ini adalah perulangan (loop). Kode di dalam kurung kurawal {...} akan diulang sebanyak jumlahSiswa.

i adalah counter yang dimulai dari 1.

Setiap kali loop berjalan, program meminta nilai (Masukkan nilai siswa ke-i:).

Nilai yang diinput (scanner.nextDouble()) akan ditambahkan (+=) ke totalNilai.

double rataRata = totalNilai / jumlahSiswa;: Setelah loop selesai, program menghitung rata-rata dengan membagi total nilai dengan jumlah siswa.

System.out.printf("... %.2f\n", rataRata);: Ini adalah perintah untuk mencetak hasil. %.2f adalah format khusus untuk menampilkan angka floating-point (desimal) dengan dua angka di belakang koma.
adalah praktik yang baik untuk "menutup" scanner setelah selesai digunakan.
scanner.close();: Ini a
