package RemoveDuplicatesLetter;

// Java program to remove duplicates
//  Print String Without Repeating Characters
import java.util.*;

class Main{

    //O(n)/O(1)
    static void removeDuplicates(String str) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }

    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        removeDuplicates(str);
        System.out.println();
        char[] arr = str.toCharArray();
        int n = arr.length;
        removeDuplicate(arr, n);
    }

    //O(n)/O(n)
    static void removeDuplicate(char[] str, int n) {
        HashSet<Character> s = new LinkedHashSet<>(n - 1);
        for (char x : str)
            s.add(x);
        // Print content of the set
        for (char x : s)
            System.out.print(x);
    }
}




