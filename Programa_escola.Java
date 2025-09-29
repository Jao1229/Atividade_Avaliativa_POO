package programa_escola;

import java.util.Scanner;

public class escola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aluno;
		String professor;
		double nota1;
		double nota2;
		double media;
		
		System.out.println("Digite o nome do seu professor: ");
		professor = sc.nextLine();
		
		System.out.println("Digite o seu nome aluno: ");
		aluno = sc.nextLine();
		
		System.out.println("Digite a nota do 1 semestre: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota do 2 semestre: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("---------Boletim do ano---------\n ");
		System.out.println("Nome do aluno: " + aluno);
		System.out.println("Nota do 1 semestre: " + nota1);
		System.out.println("Nota do 2 semestre: " + nota2);
		System.out.println("Sua media do ano: " + media);
		System.out.println("------Obrigado pelo seu acesso------");
		
		sc.close();
		
	}

}
