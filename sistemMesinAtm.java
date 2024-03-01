public class sistemMesinAtm {
    int saldoAwal, pin, nomorRekening;

    public sistemMesinAtm(int saldoAwal, int pin, int nomorRekening) {
        this.saldoAwal = saldoAwal;
        this.pin = pin;
        this.nomorRekening = nomorRekening;
    }
    public void mengecekSaldo(){
        System.out.println("Sisa saldo anda: "+ saldoAwal);
    }
    public void menarikTunai(int jumlah){
        if (jumlah > saldoAwal) {
            System.out.println("Maaf, saldo tidak mencukupi.");
        } else {
            saldoAwal -= jumlah;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + saldoAwal);
        } 
    }
    public void menTransfer(sistemMesinAtm penerima, int jumlah) {
        if (jumlah > saldoAwal) {
            System.out.println("Maaf, saldo tidak mencukupi untuk melakukan transfer.");
        } else {
            saldoAwal -= jumlah;
            penerima.saldoAwal += jumlah;
            System.out.println("Transfer berhasil. Saldo Anda saat ini: " + saldoAwal);
        }
    }
}
