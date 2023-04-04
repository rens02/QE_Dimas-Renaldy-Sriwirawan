# BASIC PROGRAMMING
## TUGAS PRIORITAS 1
```
public class basic_prio1_1 {
    public static void main(String[] args) {


        // segitiga
        float alas = 20;
        float tinggi = 25;
        double outputSegitiga = (0.5 * alas * tinggi);
        System.out.println("Luas segitiga adalah: "+outputSegitiga);

        // TODO: hitung luas segitiga

        // persegi panjang
        float panjang = 40;
        float lebar = 6;
        double outputpPanjang = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: "+outputpPanjang);

        //TODO: hitung luas persegi panjang

        // lingkaran
        double jari2 = 7;
        double phi = 3.14;
        double outputLingkaran = jari2 * jari2 * phi;
        System.out.println("Luas lingkaran adalah: "+outputLingkaran);
        //TODO: hitung luas lingkaran
    }
}
```
![path](assets/basic_prio1_1.jpg)
```
import java.util.Scanner;
public class basic_prio1_2 {
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
```
![path](assets/basic_prio1_2.png)
## TUGAS PRIORITAS 2
```
public class basic_prio2_1 {
    public static void drawXYZ(int height) {
        int s = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                s++;
                if (s % 3 == 0) {
                    System.out.print("X ");
                } else if (s % 2 == 1) {
                    System.out.print("Y ");
                } else {
                    System.out.print("Z ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);
    }
}
```
![path](assets/basic_prio2_1.jpg)
```
public class basic_prio_2_2 {
    public static void printAsterisk(int n) {
        int space = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
    }
    public static void main(String[] args) {
        printAsterisk(5);
    }
}
```
![path](assets/basic_prio2_2.jpg)
## TUGAS EKSPLORASI
```
class Main {
    private static String encrypt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                // melakukan pergeseran huruf sebanyak 10 urutan ke kanan pada susunan alfabet
                c = (char) (((c - 'A' + 10) % 26) + 'A');
            } else if (c >= 'a' && c <= 'z') {
                c = (char) (((c - 'a' + 10) % 26) + 'a');
            }
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
```
![path](assets/basic_eksplo.jpg)



# OBJECT ORIENTED PROGRAMMING
## TUGAS PRIO 1
```
public class oop_prio1 {
    private String nama;
    private String deskripsi;
    private int harga;
    private int stok;

    // constructor
    public oop_prio1(String nama, String deskripsi, int harga, int stok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }

    // setter and getter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setHarga(int harga) {
        this.harga = (int) harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    // method to display product info
    public void getInfo() {
        System.out.println("================================");
        System.out.println("Nama: " + nama);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("================================");

    }

    public static void main(String[] args) {
        oop_prio1 produk1 = new oop_prio1("coffe", "this is coffe", 15000, 10);
        oop_prio1 produk2 = new oop_prio1("milk", "this is fresh milk", 25000, 10);
        oop_prio1 produk3 = new oop_prio1("apple juice", "this is juice", 18000, 20);


        // display the product info
        produk1.getInfo();
        produk2.getInfo();
        produk3.getInfo();
    }
}
```
![path](assets/oop_prio1.jpg)
## TUGAS PRIO 2
```
public class oop_prio2 {
    public static void add(int x, int y){
        int hasil = x + y;
        System.out.println("Penjumlahan: "+hasil);
    }
    public static void substract(int x, int y) {
        int hasil = x - y;
        System.out.println("Pengurangan: " +hasil);
    }
    public static void multiply(int x, int y){
        int hasil = x * y;
        System.out.println("Perkalian: "+ hasil);
    }
    public static void divide(int x, int y){
        float hasil = x / y;
        System.out.println("Pembagian: "+ hasil);
    }
    public static void main(String[] args) {
        add(3,4);
        substract(15,4);
        multiply(10,10);
        divide(12,3);
    }
}
```
![path](assets/oop_prio2.jpg)
