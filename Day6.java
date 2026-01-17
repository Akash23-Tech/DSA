// Find the Union and Intersection of the two sorted arrays.

import java.util.HashSet;

 class UnionIntersection {
    public static void main(String[] args) {
        
        int a[] = {1,3,5,4,6};
        int b[] = {5,3,6,2};

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> result = new HashSet<>();

        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }

        for(int i=0; i<b.length; i++){
            if(set.contains(b[i])){
                result.add(b[i]);
            }
        }
         System.out.println(set);
        System.out.println(result);

        

    }
}
