package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score <5000 && score >1000) {
//			System.out.println("Your score was less than 5000 but greater than 1000");
//		}else if (score < 1000){
//        	System.out.println("Your score was less than 5000");
//
//		} else {
//        	System.out.println("Got here");
//		}
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was" + finalScore);
		}

//		int savedFinalScore = finalScore;
//
//		boolean newGameOver = true;
//		int newscore = 1000;
//		int newlevelCompleted = 8;
//		int newbonus = 200;
//
//		if (newGameOver == true) {
//			int finalScore = newscore + (newlevelCompleted * newbonus);
//			System.out.println("Your final score was" + finalScore);
//		}
		score = 1000;
		levelCompleted = 8;
		bonus = 200;
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was" + finalScore);
		}
    }
}
