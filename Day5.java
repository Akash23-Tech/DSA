// Move all the negative elements to one side of the array

class Solution{
    public void rearrangeElements(int[] arr) {
        int n = arr.length;
        int[] tempo = new int[n];
        int index = 0;

        // Store non-negative elements first
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                tempo[index++] = arr[i];
            }
        }

        // Store negative elements next
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                tempo[index++] = arr[i];
            }
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = tempo[i];
        }
    }
}

