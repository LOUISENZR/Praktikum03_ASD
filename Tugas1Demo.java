import java.util.Scanner;
public class Tugas1Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        Tugas1_16[] daftarMahasiswa = new Tugas1_16[jumlahMahasiswa];


        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Jenis Kelamin: ");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            daftarMahasiswa[i] = new Tugas1_16(nama, nim, jenisKelamin, ipk);
        }
        int i = 1;
        for (Tugas1_16 mahasiswa : daftarMahasiswa) {
            System.out.println("\nData Mahasiswa ke-" + i++);
            mahasiswa.cetakInfo();
        }

        double totalIPK = 0;
        for (Tugas1_16 mahasiswa : daftarMahasiswa) {
            totalIPK += mahasiswa.ipk;
        }
        double rataRataIPK = totalIPK / jumlahMahasiswa;
        System.out.println("\nRata-rata IPK Mahasiswa: " + rataRataIPK);
    }
}
