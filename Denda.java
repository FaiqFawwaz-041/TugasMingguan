import java.util.Scanner;

public class Denda {
    private int jmlh_denda;


    public void setjmlh_denda(int jmlh_denda){
        this.jmlh_denda = jmlh_denda;
    }

    public void displayInfo(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Denda :");
        setjmlh_denda(userinput.nextInt());

        System.out.println("Jumlah Denda :"+this.jmlh_denda);
    }

}
