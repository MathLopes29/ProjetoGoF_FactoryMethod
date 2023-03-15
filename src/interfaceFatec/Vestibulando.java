package interfaceFatec;

import java.util.Scanner;

public class Vestibulando implements Fatec{

	String Nome;
	int RA;
	
	public Vestibulando(String Nome, int RA) {
		this.Nome = Nome;
		this.RA = RA;
	}
	
	@Override
	public String DigiteNome() {
		try(Scanner s = new Scanner(System.in)){
			System.out.print("Digite seu Nome: ");
			Nome = s.nextLine();
			return Nome;
		}
	}

	@Override
	public int DigiteRA(){
		return RA;
	}
	
	public String ExibeEtec(String Msg) {
		return Msg;
	}
}
