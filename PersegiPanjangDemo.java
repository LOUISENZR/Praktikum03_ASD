import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang16[] arrayOfPersegiPanjang = new PersegiPanjang16[3];
        int panjang, lebar;;
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke- " + (i + 1));
            System.out.print("Masukan Panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang16(panjang, lebar);

        }
        for (int i=0; i<3; i++){
            System.out.println("Persegi Panjang ke- "+ (i+1) + 
            ", panjang: "+ arrayOfPersegiPanjang[i].panjang+ 
            ", lebar: "+arrayOfPersegiPanjang[i].lebar);
        }

       
    }
}
