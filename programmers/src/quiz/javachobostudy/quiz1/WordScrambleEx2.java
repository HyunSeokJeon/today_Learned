package quiz.javachobostudy.quiz1;

import java.util.Scanner;

class WordScrambleEx2 {
	public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

        String answer = getAnswer(strArr);
        String question = getScrambledWord(answer);
        
        Scanner sc = new Scanner(System.in);
        String next;
        while(true) {
              System.out.println("Question :" + question);
              System.out.print("Your answer is :"); 

              // 1. 화면을 통해 사용자의 입력을 받는다.(Scanner클래스 사용)
              next = sc.next();
              // 2. 사용자가 q 또는 Q를 입력하면 프로그램을 종료한다.
              if (next.equals("q") || next.equals("Q")){
            	  break;
              }
              // 3. 사용자가 정답을 맞출때까지 반복하다가
              if (next.equals(answer)) {
            	  System.out.println("정답입니다.");
            	  break;
              } else {
            	  System.out.println("틀렸습니다.");
              }
              //     사용자가 정답을 맞추면, while문을 빠져나간다.

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
