// hree way partitioning of an array around a given value

class ThreeWayPartition {

    public static void threeWayPartition(int[] arr, int x) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < x) {
                swap(arr, low, mid);
                low++;
                mid++;
            } 
            else if (arr[mid] == x) {
                mid++;
            } 
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5, 2, 3, 1};
        int x = 5;

        threeWayPartition(arr, x);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
