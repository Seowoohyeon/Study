package school;

import java.util.Random;

public abstract class Student {
	
	//학생들의 이름(바뀌지 않을 것. final)
	final static String[] lastName = {"김","이","박","최","장","서"};
	final static String[] firstName = {"우현","재욱","예지","예림","승운","보람","승주",
			"현준","주현","민석"};
	String name;
	int kor;
	int sno;
	int eng;
	// 학생들의 성과 이름을 무작위로 섞기 위함
	Random ran;
	
	// 학생의 학번을 기준으로 성적 등을 랜덤으로 섞음.
	public Student(int sno) {
		this.sno = sno;
		ran = new Random();
		kor = getRandomScore();
		eng = getRandomScore();
		name = getRandomName();
	}
	
	public abstract void printGradeCard();
	
	// 학생들의 성적을 랜덤으로 섞어줌
	int getRandomScore() {
		return ran.nextInt(101);
	}
	
	//학생들의 성과 이름을 랜덤으로 섞어줌
	String getRandomName() {
		return lastName[ran.nextInt(lastName.length)] + 
				firstName[ran.nextInt(firstName.length)];
	}
}
