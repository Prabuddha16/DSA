package AlternateString;

class Main {
    public static void main(String[] args) {
            String sentence = "i.love.solving.complex.problems";
            String[] words = sentence.split("\\.");
            for(int i = 0 ; i < words.length ; i++){
                if(i%2 != 0){
                    words[i] = new StringBuffer(words[i]).reverse().toString();
                }
            }
            StringBuffer output = new StringBuffer();
            for(String x : words){
                output.append(x+".");
            }
            System.out.println(output);
    }
}

