
package utspbo;
import java.util.Scanner;

public class main {
      
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahPenumpang, penumpangPorong, turunPorong, naikPorong, penumpangSurabaya, turunSurabaya, naikSurabaya;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan karyawan yang berangkat awal dari PULL/Kantor: ");
        jumlahPenumpang = input.nextInt();
        rute_bus rute = new rute_bus(jumlahPenumpang);
        
        System.out.print("Masukkan jumlah penumpang yang menunggu di Halte Porong: ");
        penumpangPorong = input.nextInt();
        halte porong = new halte(penumpangPorong);
        
        System.out.println("-> Masukkan Bus yang Berangkat dari PULL/Kantor:");
        System.out.println("- Jumlah Penumpang: " + rute.getJumlahPenumpang() + " penumpang");
        
        System.out.println("-> Penumpang yang menunngu di halte Porong: " + porong.getPenumpangMenunggu() + " Penumpang menunggu");
        
        System.out.println("-> Bus Sampai di Halte Porong:");
        System.out.println("Penumpang yang Turun:");
        turunPorong = input.nextInt();
        rute.turun(turunPorong);
        System.out.println("Penumpang yang Naik:");
        naikPorong = input.nextInt();
        rute.naik(naikPorong);
        porong.setPenumpangMenunggu(penumpangPorong - naikPorong);
        System.out.println("- " + turunPorong + " penumpang turun");
        System.out.println("- " + naikPorong + " penumpang naik");
        System.out.println("1. Penumpang Tujuan Surabaya");
        System.out.println("2. Penumpang Tujuan Gresik");
        System.out.println("- Jumlah Penumpang: " + rute.getJumlahPenumpang() + " penumpang");
        
        System.out.println("-> Halte Porong: " + porong.getPenumpangMenunggu() + " Penumpang menunggu");
        System.out.print("Masukkan jumlah penumpang yang menunggu di Halte Surabaya: ");
        penumpangSurabaya = input.nextInt();
        halte surabaya = new halte(penumpangSurabaya);
        
        System.out.println("-> Halte Surabaya: " + surabaya.getPenumpangMenunggu() + " Penumpang menunggu");
        System.out.println("-> Bus Sampai di Halte Surabaya:");
        System.out.println("Penumpang yang Turun:");
        turunSurabaya = input.nextInt();
        rute.turun(turunSurabaya);
        System.out.println("Penumpang yang Naik:");
        naikSurabaya = input.nextInt();
        rute.naik(naikSurabaya);
        surabaya.setPenumpangMenunggu(penumpangSurabaya - naikSurabaya);
        System.out.println("- " + turunSurabaya + " penumpang turun");
        System.out.println("- " + naikSurabaya + " penumpang naik");
        System.out.println("- " + naikSurabaya + " penumpang tujuan Gresik");
        System.out.println("- jumlah penumpang: " + rute.getJumlahPenumpang() + " penumpang");
        System.out.println("-> Halte Surabaya: " + surabaya.getPenumpangMenunggu() + " Penumpang menunggu");
    }
}
