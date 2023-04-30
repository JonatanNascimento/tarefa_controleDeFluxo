package notas;

public class Calculo {

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	public Calculo(double nota1, double nota2, double nota3, double nota4) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public double mediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	public String resultado() {

		System.out.printf("Sua media foi: %.2f%n", mediaNota());

		if (mediaNota() >= 7) {
			return "Aprovado";
		} else if (mediaNota() >= 5) {
			return "Recuperação";
		} else {
			return "Reprovado";
		}
	}

}
