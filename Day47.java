// Find Duplicate characters in a string

class DuplicateCharactersCount {
    public static void main(String[] args) {
        String str = "akashkulal";
        char[] arr = str.toCharArray();

        System.out.println("Duplicate characters with count:");

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            if (arr[i] == '0') continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0'; 
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " : " + count);
            }
            System.out.println("Day47 Dsa problem completed");
        }
    }
}
