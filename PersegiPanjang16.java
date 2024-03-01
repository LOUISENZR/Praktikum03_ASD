import java.util.Scanner;
public class PersegiPanjang16 {
    public int panjang;
    public int lebar;
    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        PersegiPanjang16[] arrayOfPersegiPanjang = new PersegiPanjang16[3];

        for (int i=0; i<3; i++){
            arrayOfPersegiPanjang[i] = new PersegiPanjang16();

            System.out.println("Persegi Panjang ke- " + (i + 1));
            System.out.print("Masukan Panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc16.nextInt();
            System.out.println("Masukan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc16.nextInt();        
        }

        for (int i=0; i<3; i++){
            System.out.println("Persegri Panjang ke- "+ (i+1)+ ",panjang: "
            + arrayOfPersegiPanjang[i].panjang + ", lebar: "+ arrayOfPersegiPanjang[i].lebar);
        }

    }   
}
