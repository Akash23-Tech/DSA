
import java.util.HashSet;

 class UnionIntersection {
    public static void main(String[] args) {
        
        int a[] = {1,3,5,4};
        int b[] = {5,3,6,2};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        System.out.println(set);

    }
}
