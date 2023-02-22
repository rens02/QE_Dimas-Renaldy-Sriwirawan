package Alterra_Academy;

public class oop_prio2 {
    public static void add(int x, int y){
        int hasil = x + y;
        System.out.println(hasil);
    }
    public static void substract(int x, int y) {
        int hasil = x - y;
        System.out.println(hasil);
    }
    public static void multiply(int x, int y){
        int hasil = x * y;
        System.out.println(hasil);
    }
    public static void divide(int x, int y){
        float hasil = x / y;
        System.out.println(hasil);
    }
    public static void main(String[] args) {
        add(3,4);
        substract(15,4);
        multiply(10,10);
        divide(12,3);
    }
}

