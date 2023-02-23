package Alterra_Academy;

public class basic_prio2_1 {
    public static void drawXYZ(int height) {
        int s = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                s=s+1;
                if (s % 2 == 1) {
                    if(s % 3 == 0){
                        System.out.print("X ");
                    }else{
                        System.out.print("Y ");
                    }
                } else if (s % 2 == 0) {
                    if(s % 3 == 0){
                        System.out.print("X ");
                    }else{
                        System.out.print("Z ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);
    }
}
