package FirstNonRepeatingCharInString;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s= scn.next();
        System.out.println(solution(s));
        int res = solution(s);
        if(res==-1){
            System.out.println("No repeating character");
        }else {
            System.out.println(s.charAt(res));
        }
    }

    public static int solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ;i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0 ; i< s.length() ;i++) {
            char ch = s.charAt(i);
            if(map.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }
}



