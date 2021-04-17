package quiz.programmers.level2;

public class DartGame {
	public int solution(String dartResult) {
        int answer = 0;
        int j = 0;
        int k = 0;
        String[] point3 = new String[3];
        int scoreLen = dartResult.length() ;
        for(int i = 1; i < scoreLen; i++) {
        	if(Character.isDigit(dartResult.charAt(i))) {
        		point3[k] = dartResult.substring(j, i);
        		j = i;
        		k++;
        	}
        }
        point3[2] = dartResult.substring(j, scoreLen);
        
        int fPoint = Integer.parseInt(point3[0])  ;
        int sPoint = point3[1].charAt(1);
        int tPoint = point3[2].charAt(2);
        answer = fPoint + sPoint + tPoint;
        return answer;
    }
	
	public static void main(String[] args) {
		DartGame dg = new DartGame();
		System.out.println(dg.solution("1S*2D*#3T*"));
	}
}
