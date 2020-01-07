public class GameScoreCode{

	public static void main(String[] args){
		int initLine = 15;
		int rotControl = 10;
		int posControl = 20;
		int genLevel = 15;
		int hangScore = 75;
		int pcValT = 3;
		int pcValA = 6;
		int pcNumT = 40;
		int pcNumA = 9;
		int tpcs = (pcValT * pcNumT) + (pcValA * pcNumA);
		int maxScore = tpcs + initLine + rotControl + posControl + genLevel + hangScore;
		System.out.println("Maximum score is " + maxScore);
	}

}