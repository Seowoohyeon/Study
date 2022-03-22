package application;

import school.MachinelearningStudent;
import school.NetworkStudent;
import school.ProgrammingStudent;
import school.Student;

public class School {
	
	/*
	 	학생들을 쭉 뽑아보자
	 */
	//학번
	int sno;
	// 각 반의 학생들 명부를 뽑는 로직
	public School() {
		sno = 100000;
		
		Student[] program = new Student[30];
		Student[] network = new Student[30];
		Student[] machinelearning = new Student[30];
		
		for (int i = 0; i < program.length; i++) {
			program[i] = new ProgrammingStudent(sno++);
			program[i].printGradeCard();
		}
		System.out.println("\n\n");
		for (int i = 0; i < network.length; i++) {
			network[i] = new NetworkStudent(sno++);
			network[i].printGradeCard();
		}
		System.out.println("\n\n");
		for (int i = 0; i < machinelearning.length; i++) {
			machinelearning[i] = new MachinelearningStudent(sno++);
			machinelearning[i].printGradeCard();
		}
	}
	
	public static void main(String[] args) {
		
		new School();
		
	}

}
