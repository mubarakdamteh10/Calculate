import java.util.Scanner ;

public class CalculateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input Score");
		int score = in.nextInt();
		CalculateGrade c = new CalculateGrade(score);
		System.out.println("grade"+c.calcuate());
	}

}
