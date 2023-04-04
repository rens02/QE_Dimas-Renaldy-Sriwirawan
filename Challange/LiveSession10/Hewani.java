package hewanChallange;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/hewanChallange.Main.java to edit this template
 */

import java.util.Scanner;

public class Hewani {
    int kaki;
    int attackPoin;

    protected void attack(int s){
        System.out.println("Serang");
        this.attackPoin = s;
    }
    protected void jalan(int k){
        System.out.println("Jalan");
        this.kaki = k;
    }
    protected void lawan(){
        System.out.println("Lawan");
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Sapi sapi = new Sapi();
        anjing anjg = new anjing();
        kucing kucing = new kucing();
        Scanner scan = new Scanner(System.in);

        System.out.println("Daftar Makhluk :");
        System.out.println("1. hewanChallange.Sapi");
        System.out.println("2. Anjing");
        System.out.println("3. Kucing");
        System.out.println("Silahkan Pilih makhluk yang akan dijelaskan :");
        int pil = scan.nextInt();

        switch(pil){
            case 1:
                sapi.attack(20);
                sapi.jalan(4);
                sapi.lawan();
                break;
            case 2:
                anjg.attack(70);
                anjg.jalan(4);
                anjg.lawan();
                break;
            case 3:
                kucing.attack(50);
                kucing.jalan(4);
                kucing.lawan();

        }

    }

}
