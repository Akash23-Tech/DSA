// Rearrange the array in alternating positive and negative items with O(1) extra space

class RearrangePositiveNegative{

    static void rearrange(int[] arr) {
        int n = arr.length;

        int i = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int neg = 0;
        int pos = i + 1;

        while (neg < pos && pos < n && arr[neg] < 0) {
            int temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;

            neg += 2;
            pos++;
        }
    }

    // Driver
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
