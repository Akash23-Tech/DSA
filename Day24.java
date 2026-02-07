import java.util.*;

class MoreThanNByK {

    public static void findElements(int[] arr, int k) {
        int n = arr.length;

        // Step 1: Count frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print elements appearing more than n/k times
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / k) {
                System.out.println(entry.getKey());
            }
        }
    }   
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3, 2, 3};
        int k = 4;

        findElements(arr, k);
    }
}
