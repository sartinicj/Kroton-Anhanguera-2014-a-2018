package aula;

public class Pessoa {

	String nome;
	Integer idade;

	public Pessoa(String n, Integer i) {
		nome = n;
		idade = i;
	}
	
	void apresenteSe() {
		System.out.println("Eu sou " + nome + " e tenho " +
				idade + " anos.");
	}

}
