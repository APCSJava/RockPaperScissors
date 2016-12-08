
public class RockPaperScissors {

	public static final int ROCK = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	public static void main(String[] args) {
		System.out.println(check3(ROCK, SCISSORS));
		System.out.println(check3(ROCK, PAPER));
		System.out.println(check3(ROCK, ROCK));
		System.out.println(check3(SCISSORS, PAPER));
		System.out.println(check3(SCISSORS, ROCK));
		System.out.println(check3(SCISSORS, SCISSORS));
		System.out.println(check3(PAPER, ROCK));
		System.out.println(check3(PAPER, SCISSORS));
		System.out.println(check3(PAPER, PAPER));

	}

	public static boolean checkWins(int thisThrow, int otherThrow) {
		if (thisThrow == ROCK) {
			if (otherThrow == SCISSORS)
				return true;
			else
				return false;
		} else if (thisThrow == SCISSORS) {
			if (otherThrow == PAPER)
				return true;
			else
				return false;
		} else {
			if (otherThrow == ROCK) {
				return true;
			} else
				return false;
		}
	}

	public static boolean check2(int throw1, int throw2) {
		if (throw1 == ROCK)
			return throw2 == SCISSORS;
		if (throw1 == SCISSORS)
			return throw2 == PAPER;
		return throw2 == ROCK;
	}

	public static boolean check3(int throw1, int throw2) {
		return (throw1 + 1) % 3 == throw2;
	}

}
