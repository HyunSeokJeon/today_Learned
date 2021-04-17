package quiz.javachobostudy.quiz1;

import java.util.Scanner;

class WordScrambleEx3 {
	public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};
        
        Scanner sc = new Scanner(System.in);
        String next;
        
        String answer="";
        String question="";
        boolean flag = true;
        while(true) {
        	if(flag) {
        		answer = getAnswer(strArr);
                question = getScrambledWord(answer);
        	}
        	
			System.out.println("Question :" + question);
			System.out.print("Your answer is :");

			next = sc.next();
			if (next.toLowerCase().equals("q")) {
				break;
			}
			if (next.toLowerCase().equals(answer.toLowerCase())) {
				flag = true;
				System.out.println("정답입니다.");
			} else {
				flag = false;
				System.out.println("틀렸습니다.");
			}

        } // while

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
