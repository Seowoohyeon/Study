package school;

import java.util.Random;

public abstract class Student {
	
	//�л����� �̸�(�ٲ��� ���� ��. final)
	final static String[] lastName = {"��","��","��","��","��","��"};
	final static String[] firstName = {"����","���","����","����","�¿�","����","����",
			"����","����","�μ�"};
	String name;
	int kor;
	int sno;
	int eng;
	// �л����� ���� �̸��� �������� ���� ����
	Random ran;
	
	// �л��� �й��� �������� ���� ���� �������� ����.
	public Student(int sno) {
		this.sno = sno;
		ran = new Random();
		kor = getRandomScore();
		eng = getRandomScore();
		name = getRandomName();
	}
	
	public abstract void printGradeCard();
	
	// �л����� ������ �������� ������
	int getRandomScore() {
		return ran.nextInt(101);
	}
	
	//�л����� ���� �̸��� �������� ������
	String getRandomName() {
		return lastName[ran.nextInt(lastName.length)] + 
				firstName[ran.nextInt(firstName.length)];
	}
}
