package Alterra_Academy;

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
