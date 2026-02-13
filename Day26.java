// Find whether an array is a subset of another array

import java.util.*;

class SubsetCheck{
    public static boolean isSubset(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4};

        System.out.println(isSubset(arr1, arr2)); // true
    }
}

