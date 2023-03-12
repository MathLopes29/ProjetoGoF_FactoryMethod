package interfaceFatec;

import java.util.Scanner;

public class Vestibulando implements Fatec{

	@Override
	public String DigiteNome(String Nome) {
		try(Scanner s = new Scanner(System.in)){
			System.out.print("Digite seu Nome: ");
			Nome = s.nextLine();
			return Nome;
		}
	}

	@Override
	public int DigiteRA(int RA) {
		return RA;
	}
	
	public String ExibeEtec(String Msg) {
		return Msg;
	}
}
