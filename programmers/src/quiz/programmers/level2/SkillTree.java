package quiz.programmers.level2;

import java.util.Arrays;

public class SkillTree {
	public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        int skillLength = skill.length();
        int[] skillArray = new int[skillLength];
        int[] checkArray = new int[skillLength];
        
        for(int i = 0; i < skill_trees.length; i++) {
        	for(int j = 0; j < skillLength ; j++) {
        		skillArray[j] = skill_trees[i].indexOf(skill.charAt(j));
        	}
        	checkArray = Arrays.copyOf(skillArray, skillLength);
        	Arrays.sort(checkArray);
        	for(int k = 0; k < skillLength; k++) {
        		if(skillArray[k] == checkArray[k]) {
        			continue;
        		}else {
        			answer = answer - 1;
        			break;
        		}
        		
        	}
        }
	        
        return answer;
        
    }
	public static void main(String[] args) {
		SkillTree a = new SkillTree();
		String skill = new String("CBD");
		String[] tree = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = a.solution(skill, tree);
		System.out.println(answer);
	}
}
