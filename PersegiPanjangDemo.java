import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang16[] arrayOfPersegiPanjang = new PersegiPanjang16[3];
        
        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjang16();

            System.out.println("Persegi Panjang ke- " + (i + 1));
            System.out.print("Masukan Panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();        
        }

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i].cetakInfo();
        }
    }
}
