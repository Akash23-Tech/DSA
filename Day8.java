// Find Largest sum contiguous Subarray (Maximum Subarray Sum - Kadane's Algorithm)

 class KadensAlgo {
    static int maxSubArraySum(int[] arr){

        int maxSum = 0;
        int curSum = 0;

        for (int i = 0; i<arr.length; i++){

            curSum= curSum + arr[i];
            if(curSum>maxSum){
                maxSum = curSum;
            }

            if(curSum< 0){
                curSum = 0;
            }
        }
        return maxSum;


    }
     public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Largest Sum Contiguous Subarray: " + maxSubArraySum(arr));
     }
}
