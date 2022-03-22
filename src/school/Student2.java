package school;

import java.util.Random;

// 보일 필요 없으므로 프라이빗
public class Student2 {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private static Random ran = new Random();
	private static int sno = 0;
	
	private static int BEST_TOTAL = 0;
	
	private static int getRandomScore() {
		return ran.nextInt(101);
	}
	
	// 학생들의 랜덤 점수와 총점
	public Student2() {
		kor = getRandomScore();
		eng = getRandomScore();
		math = getRandomScore();
		name = String.format("학생%06d", sno++);
		BEST_TOTAL = (int)Math.max(getTotal(), BEST_TOTAL);
	}
	
	// 총점을 구함
	public int getTotal() {
		return kor + eng + math;
	}
	
	// 평균
	public double getAvg() {
		return getTotal() / 3.0;
	}
	
	// 성적표 출력
	public String getTranscript() {
		return String.format("%s\t/ %d\t/ %.2f", name, getTotal(), getAvg());
	}
}




















