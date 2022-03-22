package school;

public class NetworkStudent extends Student {
	final static String[] sub = {"����","����","������","CCNA"};
	int math;
	int pl;
	
	public NetworkStudent(int sno) {
		super(sno);
		math = getRandomScore();
		pl = getRandomScore();
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("��Ʈ��ũ ��");
		System.out.printf("�й�\t�̸�\t%s\t%s\t%s\t%s\t����\t���\n",
				sub[0],sub[1],sub[2],sub[3]);
		System.out.printf("%X\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				sno,name,kor,eng,math,pl, kor+eng+math+pl, (kor+eng+math+pl) / 4.0);
		System.out.println("----------------------------------------------------------------------");
	}
}
