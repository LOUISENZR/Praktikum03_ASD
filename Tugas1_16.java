
public class Tugas1_16 {
        String nama;
        String nim;
        char jenisKelamin;
        double ipk;

        public Tugas1_16(String nama, String nim, char jenisKelamin, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.jenisKelamin = jenisKelamin;
            this.ipk = ipk;
        }

        public void cetakInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Jenis Kelamin: " + jenisKelamin);
            System.out.println("IPK: " + ipk);
            System.out.println();
        }   

}

