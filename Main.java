public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("|                            |");
        System.out.println("|   KOPERASI SIMPAN PINJAM   |");
        System.out.println("|                            |");
        System.out.println("------------------------------");
        System.out.println();

        Transaksi transaksi = new Transaksi();
        BuktiPinjaman bktipnjman = new BuktiPinjaman();
        Anggota pelanggan = new Anggota();
        Denda sanksi = new Denda();
        BuktiAngsuran ba = new BuktiAngsuran();


    transaksi.displayInfo();
    bktipnjman.displayInfo();
    pelanggan.displayInfo();
    sanksi.displayInfo();
    ba.displayInfo();



    }
}