public class tugas5{
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 3, 3, 6, 9, 9};
        int[] arr2 = {2, 2, 2, 11};

        int length1 = removeDuplicates(arr1);
        int length2 = removeDuplicates(arr2);

        System.out.println(length1);
        System.out.println(length2);
    }

    public static int removeDuplicates(int[] arr) {
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
