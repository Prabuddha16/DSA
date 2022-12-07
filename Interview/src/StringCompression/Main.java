package StringCompression;

public class Main {
    static void printRLE(String s) {
        for (int i = 0; i < s.length(); i++) {
            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            if(count==1) {
                System.out.print(s.charAt(i));
            }else{
                System.out.print(s.charAt(i)+""+count);
            }
        }
    }

    public static void main(String[] args)
    {
        printRLE("aaabbacdd");
        System.out.println();
        printRLE("aaaabbbc");
    }
}
