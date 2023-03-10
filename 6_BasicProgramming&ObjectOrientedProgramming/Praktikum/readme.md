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

![path](assets/basic_prio2_1.jpg)
![path](assets/basic_prio2_2.jpg)
## TUGAS EKSPLORASI
```

```
![path](assets/basic_eksplo.jpg)



# OBJECT ORIENTED PROGRAMMING
## TUGAS PRIO 1
![path](assets/oop_prio1.jpg)
## TUGAS PRIO 2
![path](assets/oop_prio2.jpg)
