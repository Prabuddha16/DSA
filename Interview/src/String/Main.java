package String;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        char ch;
        ch = 'A';
        HashMap<Integer,Character> map = new HashMap<>();
        for(int i=1;i<=26;i++){
            map.put(i,ch);
            ch++;
        }
        System.out.println(map);
        char c = 'D';
        int d = 3;
        int i = 0;
        if(map.containsValue(c)){
            System.out.println(map.get(c));
        }
        System.out.println(i);
//        if(map.containsKey(c)) {
//
//        }
        /*
        String s = "PRABUDDHA";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                System.out.println('1');;
            }else{
                System.out.println('0');
            }
        }
        */
    }
}
