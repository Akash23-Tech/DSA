// Maximum size rectangle - Matrix DSA problem

import java.util.*;

class Main{

    static int maxHistogram(int[] h) {
        Stack<Integer> st = new Stack<>();
        int max = 0;

        for (int i = 0; i <= h.length; i++) {
            int height = (i == h.length) ? 0 : h[i];

            while (!st.isEmpty() && height < h[st.peek()]) {
                int ht = h[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                max = Math.max(max, ht * width);
            }
            st.push(i);
        }
        return max;
    }
    static int maxRectangle(int[][] mat) {
        int c = mat[0].length, max = 0;
        int[] h = new int[c];

        for (int[] row : mat) {
            for (int j = 0; j < c; j++)
                h[j] = row[j] == 0 ? 0 : h[j] + 1;

            max = Math.max(max, maxHistogram(h));
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}
        };
        System.out.println(maxRectangle(mat));
    }
}