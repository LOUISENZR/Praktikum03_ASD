
public class PersegiPanjang16 {
    public int panjang;
    public int lebar;
    public static void main(String[] args) {
        PersegiPanjang16[] arrayOfPersegi = new PersegiPanjang16[3];

        arrayOfPersegi[0] = new PersegiPanjang16();
        arrayOfPersegi[0].panjang = 110;
        arrayOfPersegi[0].lebar = 30;

        arrayOfPersegi[1] = new PersegiPanjang16();
        arrayOfPersegi[1].panjang = 80;
        arrayOfPersegi[1].lebar = 40;

        arrayOfPersegi[2] = new PersegiPanjang16();
        arrayOfPersegi[2].panjang = 100;
        arrayOfPersegi[2].lebar = 20;

        System.out.println("Persegi Panjang ke-1, panjang: "+ arrayOfPersegi[0].panjang +",lebar: "+ arrayOfPersegi[0].lebar );
        System.out.println("Persegi Panjang ke-2, panjang: "+ arrayOfPersegi[1].panjang +",lebar: "+ arrayOfPersegi[1].lebar );
        System.out.println("Persegi Panjang ke-3, panjang: "+ arrayOfPersegi[2].panjang +",lebar: "+ arrayOfPersegi[2].lebar );

    }   
}
