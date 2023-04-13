import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tugas4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan elemen-elemen array pertama (dipisahkan dengan spasi): ");
        String[] arr1String = input.nextLine().split(" ");
        int[] arr1 = new int[arr1String.length];
        for (int i = 0; i < arr1String.length; i++) {
            arr1[i] = Integer.parseInt(arr1String[i]);
        }

        System.out.print("Masukkan elemen-elemen array kedua (dipisahkan dengan spasi): ");
        String[] arr2String = input.nextLine().split(" ");
        int[] arr2 = new int[arr2String.length];
        for (int i = 0; i < arr2String.length; i++) {
            arr2[i] = Integer.parseInt(arr2String[i]);
        }

        int[] result = getUniqueElements(arr1, arr2);
        System.out.println("Hasil: " + Arrays.toString(result));
    }

    public static int[] getUniqueElements(int[] arr1, int[] arr2) {
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueElements.add(arr1[i]);
            }
        }
        int[] result = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            result[i] = uniqueElements.get(i);
        }
        return result;
    }
}
