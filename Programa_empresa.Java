package programa_empresa;

import java.util.Scanner;

public class empresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mesa;
		int quantidade1;
		int quantidade2;
		double valor1;
		double valor2;
		double subtotal1;
		double subtotal2;
		double total;
		String produto1;
		String produto2;
		
		System.out.println("Digite o numero da mesa: ");
		mesa = sc.nextInt();
		sc.nextLine();
		
		System.out.println("-----Pedido-----\n");
		System.out.println("Digite o nome da refeição ou bebida: ");
		produto1 = sc.nextLine();
		
		System.out.println("Digite o valor do produto: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		quantidade1 = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("-----Segundo Pedido-----");
		System.out.println("Digite o nome da refeição ou bebida: ");
		produto2 = sc.nextLine();
		
		System.out.println("Digite o valor do produto: ");
		valor2 = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		quantidade2 = sc.nextInt();
		
		subtotal1 = valor1 * quantidade1;
		subtotal2 = valor2 * quantidade2;
		total = subtotal1 + subtotal2;
		
		System.out.println("-------Resumo do Pedido-------\n");
		System.out.println("Numero da mesa: " + mesa);
		System.out.printf("1)Produto: %s - 2)Valor: %.2f - 3)Quantidade: %d - 4)Total do 1 pedido: %.2f%n", produto1, valor1, quantidade1, subtotal1);
		System.out.printf("1)Produto: %s - 2)Valor: %.2f - 3)Quantidade: %d - 4)Total do 2 pedido: %.2f%n", produto2, valor2, quantidade2, subtotal2);
		System.out.printf("\nValor total do pedido: %.2f%n", total);
		
		
		sc.close();

	}

}
