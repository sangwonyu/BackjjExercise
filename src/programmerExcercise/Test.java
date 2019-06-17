package programmerExcercise;

public class Test {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		int answer = 0;
		char[] skillChar = new char[skill.length()];

		for (int i = 0; i < skill.length(); i++) {
			skillChar[i] = skill.charAt(i);
		}

		for (int i = 0; i < skill_trees.length; i++) {
			String checkSkill = skill_trees[i];
			
			for (int z = 1; z < skill.length(); z++) {
				if (checkSkill.indexOf(skillChar[z - 1]) < checkSkill.indexOf(skillChar[z])) {
					if (z+1 < skill.length()) {
						continue;
					} else {
						System.out.println(checkSkill + " : 가능한 스킬트리입니다.");
						++answer;
					}
				} else {
					System.out.println(checkSkill + " : 가능한 스킬트리입니다.");
					break;
				}
			}
		}
		System.out.println("가능 스킬 수 :" + answer);
	}

}
