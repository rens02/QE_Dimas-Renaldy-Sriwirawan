package Alterra_Academy;

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

