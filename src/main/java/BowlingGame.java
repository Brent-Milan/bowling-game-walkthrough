
public class BowlingGame {

	private int rolls[] = new int[21];
	private int currentRoll = 0;  //index
	
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}
	
//	public int score() {
//		int score = 0;
//		int index = 0;
//		for(int roll: rolls) {
////		for(int frame = 0; frame < 10; frame++) {
////			if(rolls[index] + rolls[index + 1] == 10) {
////				scor]
////			}
//		}
//	}
//		return score;
//	}
//}
