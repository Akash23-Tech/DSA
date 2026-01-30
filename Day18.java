// Find common elements in three sorted arrays

import java.util.*;

class Solution {
    public static List<Integer> findCommon(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        Integer lastAdded = null; 

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                
                if (lastAdded == null || arr1[i] != lastAdded) {
                    result.add(arr1[i]);
                    lastAdded = arr1[i];
                }
                i++; j++; k++;
            }
            
            else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 30};
        int[] arr2 = {5, 13, 15, 20};
        int[] arr3 = {5, 20, 9};

        List<Integer> commonElements = findCommon(arr1, arr2, arr3);
        if (commonElements.isEmpty()) {
            System.out.println("No common elements");
        } else {
            System.out.println("Common elements: " + commonElements);
        }
    }
}
