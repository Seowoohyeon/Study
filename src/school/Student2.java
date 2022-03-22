package school;

import java.util.Random;

// ���� �ʿ� �����Ƿ� �����̺�
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
	
	// �л����� ���� ������ ����
	public Student2() {
		kor = getRandomScore();
		eng = getRandomScore();
		math = getRandomScore();
		name = String.format("�л�%06d", sno++);
		BEST_TOTAL = (int)Math.max(getTotal(), BEST_TOTAL);
	}
	
	// ������ ����
	public int getTotal() {
		return kor + eng + math;
	}
	
	// ���
	public double getAvg() {
		return getTotal() / 3.0;
	}
	
	// ����ǥ ���
	public String getTranscript() {
		return String.format("%s\t/ %d\t/ %.2f", name, getTotal(), getAvg());
	}
}




















