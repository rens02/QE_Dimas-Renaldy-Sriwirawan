package Alterra_Academy;

import java.util.Scanner;
public class basic_prio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Harga Beli: ");
        int hargaBeli = scan.nextInt();
        System.out.print("Masukkan Harga jual: ");
        int hargaJual = scan.nextInt();
        int hasilPenjualan = hargaJual - hargaBeli;
        if (hargaJual > hargaBeli){
            System.out.println("untung sebesar:"+hasilPenjualan);
        }else{
            if (hargaJual < hargaBeli){
                System.out.println("rugi sebesar:"+hasilPenjualan);
            }else{
                System.out.println("Tidak rugi maupun untung");
            }
        }
    }

}
