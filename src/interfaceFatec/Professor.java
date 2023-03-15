package interfaceFatec;
import java.util.*;

public class Professor implements Fatec {

	String Nome;
	int RA;
	
	public Professor(String Nome, int RA) {
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
	
	public String ExibeProf(String Msg) {
		return Msg;
	}
}
