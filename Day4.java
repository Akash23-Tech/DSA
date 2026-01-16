// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

class Array012{
    public static void sort012(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tempo = arr[i];
        arr[i] = arr[j];
        arr[j] = tempo;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 2, 0, 2, 0, 1};

        sort012(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
