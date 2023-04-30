package app;

import java.util.Locale;
import java.util.Scanner;

import notas.Calculo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		System.out.print("Digite a quarta nota: ");
		double nota4 = sc.nextDouble();

		Calculo calculo = new Calculo(nota1, nota2, nota3, nota4);
		System.out.println();
		System.out.println(calculo.resultado());
		System.out.println();

		sc.close();
	}

}
