// Trapping Rain water problem

class TrappingRainWater{

    public static int trap(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int left = 0, right = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left <= right) {

            if (arr[left] <= arr[right]) {

                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    water += leftMax - arr[left];
                }
                left++;

            } else {

                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    water += rightMax - arr[right];
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {

        int[] arr1 = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(trap(arr1));  // Output: 10

        int[] arr2 = {3, 0, 2, 0, 4};
        System.out.println(trap(arr2));  // Output: 7
    }
}
