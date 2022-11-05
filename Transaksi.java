import java.util.Scanner;

public class Transaksi {
    private int id_peminjaman;
    private int tgl_peminjaman;
    private int tgl_angsuran;
    private int tgl_haruslunas;

    public void setId_peminjaman(int id_peminjaman){
        this.id_peminjaman = id_peminjaman;
    }
    public void setTgl_peminjaman(int tgl_peminjaman){
        this.tgl_peminjaman = tgl_peminjaman;
    }
    public void setTgl_angsuran(int tgl_angsuran){
        this.tgl_angsuran = tgl_angsuran;
    }
    public void setTgl_haruslunas(int tgl_haruslunas){
        this.tgl_haruslunas = tgl_haruslunas;
    }

    public void displayInfo(){
        Scanner userinput = new Scanner(System.in);
        System.out.println(" Masukkan ID Peminjam : ");
        setId_peminjaman(userinput.nextInt());
        System.out.println("Masukkan Tanggal Peminjaman : ");
        setTgl_peminjaman(userinput.nextInt());
        System.out.println("Masukkan Tanggal Mulai Angsuran : ");
        setTgl_angsuran(userinput.nextInt());
        System.out.println("Masukkan Tanggal Pelunasan : ");
        setTgl_haruslunas(userinput.nextInt());

        System.out.println("ID Peminjam "+ this.id_peminjaman);
        System.out.println("Tanggal Mulai Peminjaman "+this.tgl_peminjaman);
        System.out.println("Tanggal Angsuran "+ this.tgl_angsuran);
        System.out.println("Tanggal Pelunasan "+this.tgl_haruslunas);
    }
}
