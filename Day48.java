// WAP - Why strings are immutable in Java?

class StringImmutabilityDemo {
    public static void main(String[] args) {

        String str = "Akash";
        System.out.println("Original String: " + str);

        // String remains unchanged
        System.out.println("After concat (without assignment): " + str);

        // Now assigning the result
        str = str.concat(" Kulal");
        System.out.println("After concat (with assignment): " + str);
        
    }
}