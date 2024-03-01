import java.util.Scanner;
public class mesinAAtmMain {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        sistemMesinAtm[] accounts = new sistemMesinAtm[3];
        accounts[0] = new sistemMesinAtm(50000, 1234, 1001);
        accounts[1] = new sistemMesinAtm(100000, 5678, 1002);
        accounts[2] = new sistemMesinAtm(75000, 9012, 1003);

        for (sistemMesinAtm account : accounts) {
            System.out.println("\nNomor Rekening: " + account.nomorRekening);
            System.out.println("1. Mengecek Saldo");
            System.out.println("2. Menarik Tunai");
            System.out.println("3. Transfer");
            System.out.print("Pilih operasi yang ingin dilakukan: ");
            int pilihsn = scanner.nextInt();
            
            switch (pilihsn) {
                case 1:
                    account.mengecekSaldo();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah yang ingin ditarik: ");
                    int withdrawAmount = scanner.nextInt();
                    account.menarikTunai(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Masukkan nomor rekening penerima: ");
                    int receiverAccountNumber = scanner.nextInt();
                    sistemMesinAtm receiver = null;
                    for (sistemMesinAtm a : accounts) {
                        if (a.nomorRekening == receiverAccountNumber) {
                            receiver = a;
                            break;
                        }
                    }
                    if (receiver == null) {
                        System.out.println("Nomor rekening penerima tidak ditemukan.");
                    } else {
                        System.out.print("Masukkan jumlah yang ingin ditransfer: ");
                        int transferAmount = scanner.nextInt();
                        account.menTransfer(receiver, transferAmount);
                    }
                    break;
                default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
        }         
    }
}

