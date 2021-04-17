package quiz.javachobostudy.quiz1;

class WordScrambleEx1 {
    public static void main(String[] args) {
          String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

          String answer = getAnswer(strArr);
          String question = getScrambledWord(answer);

          System.out.println("Question:"+question);
          System.out.println("Answer:"+answer);
          
    } // main

    public static String getAnswer(String[] strArr) { 
         return strArr[(int) (Math.random()*strArr.length)];
    }
   
    public static String getScrambledWord(String str) { 
    	char[] chars = str.toCharArray();
        for(int i=0; i<str.length(); i++) {
        	int a = (int) (Math.random() * str.length());
        	char c = chars[i];
        	chars[i] = chars[a];
        	chars[a] = c;
        }
        String s = String.copyValueOf(chars);
    	return s;

    } // scramble(String str)
}
