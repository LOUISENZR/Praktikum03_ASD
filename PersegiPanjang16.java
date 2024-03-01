public class PersegiPanjang16 {
    public int panjang;
    public int lebar;
    int hitungLuas, hitungKeliling; 

    void cetakInfo(){
        hitungLuas = panjang*lebar;
        hitungKeliling = (panjang+lebar)*2;
        System.out.println("persegi panjang, panjang: "+ 
        panjang + ", lebar: "+ lebar+",Luas: "+ hitungLuas+", keliling: "+hitungKeliling);
    }
    public PersegiPanjang16(int p, int l){
        panjang = p;
        lebar = l;
    }
}
