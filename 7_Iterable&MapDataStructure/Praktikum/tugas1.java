import java.util.*;

public class tugas1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the size of the first array
        System.out.print("Masukkan jumlah array pertama: ");
        int size1 = input.nextInt();

        // Read the elements of the first array
        String[] array1 = new String[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Masukan elemen array ke-"+i+": ");
            array1[i] = input.next();
        }

        // Read the size of the second array
        System.out.print("Masukkan jumlah array kedua: ");
        int size2 = input.nextInt();

        // Read the elements of the second array
        String[] array2 = new String[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Masukan elemen array ke-"+i+": ");
            array2[i] = input.next();
        }

        String[] mergedArray = mergeArrays(array1, array2);

        System.out.println(Arrays.toString(mergedArray));

    }
    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        HashSet<String> set = new HashSet<String>();
        ArrayList<String> mergedList = new ArrayList<String>();

        for (String element : arr1) {
            if (!set.contains(element)) {
                mergedList.add(element);
                set.add(element);
            }
        }

        for (String element : arr2) {
            if (!set.contains(element)) {
                mergedList.add(element);
                set.add(element);
            }
        }

        String[] mergedArray = new String[mergedList.size()];
        mergedList.toArray(mergedArray);

        return mergedArray;
    }

}

