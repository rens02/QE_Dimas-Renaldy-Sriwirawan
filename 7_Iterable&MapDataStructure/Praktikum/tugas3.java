public class tugas3 {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 6};
        int targetSum = 6;
        int[] pairIndices = findPairIndices(sortedArray, targetSum);
        if(pairIndices == null) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Pair found at indices: " + pairIndices[0] + ", " + pairIndices[1]);
        }
    }

    public static int[] findPairIndices(int[] sortedArray, int targetSum) {
        int left = 0;
        int right = sortedArray.length - 1;
        while(left < right) {
            int currentSum = sortedArray[left] + sortedArray[right];
            if(currentSum == targetSum) {
                return new int[]{left, right};
            } else if(currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}
