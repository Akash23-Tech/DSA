//Find the "Kth" max and min element of an array

import java.util.Arrays;
 class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {

        Arrays.sort(arr);
        return arr [k-1];
    }

    public static void main(String[] args) {
        
        int [] arr = {5, 8, 12, 3, 23, 45, 2, 9};
        int k = 3;

        System.out.println(kthSmallest(arr, k));
    }
    
}
