package interfaceFatec;
import java.util.*;

public interface InterfaceTeste {
	
	/* Method Layout */
	public static void Layout() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("*************************************************");
			System.out.println("                FATEC ZONA SUL                   ");
			System.out.println("*************************************************\n\n");
			
			System.out.println("Qual é sua Relação com a FATEC?");
			System.out.print("(1) Estudante, (2) Profesor, (3) Adiministrador, (4) Coordenador, (5) Diretor, (6) Vestibulando, (7) Nenhum: ");
			int valor = s.nextInt();
			System.out.println("");
			
			if (valor == 1) {
				Escolha1 (new Estudante());	
			}else if (valor == 2) {
				Escolha2 (new Professor());
			}else if (valor == 3){
				Escolha3(new Administrador());
			} else if (valor == 4) {
				Escolha4 (new Coordenador());
			} else if (valor == 5) {
				Escolha5 (new Diretor());
			} else if (valor == 6) {
				Escolha6 (new Vestibulando());
			} else {
				System.out.println("Digite Novamente!");
				return;
			}
			
			
		}	
	}

	/* Clases Abstrata */	
	public static void Escolha1(Estudante Opp1) {	
		System.out.println(Opp1.ExibeEstudante("Estudante da Fatec Zona Sul"));
		System.out.println("Nome: " + Opp1.DigiteNome ("Marcos"));
		System.out.println("RA: " + Opp1.DigiteRA (1036498));
	}
	
	public static void Escolha2(Professor Opp2) {
		System.out.println(Opp2.ExibeProf("Professor / Professora da Fatec Zona Sul"));
		System.out.println("Prof." + Opp2.DigiteNome(null));
		System.out.println("RA:" + Opp2.DigiteRA(1566300));
	}
	
	public static void Escolha3(Administrador Opp3) {	
		System.out.println(Opp3.ExibeAdm("Setor Administrativo da Fatec Zona Sul"));
		System.out.println("Nome Administrador: " + Opp3.DigiteNome (null));
		System.out.println("RA: " + Opp3.DigiteRA (1036498));
	}
		
	public static void Escolha4(Coordenador Opp4) {	
		System.out.println(Opp4.ExibeCoor("Coordenação da Fatec Zona Sul"));
		System.out.println("Nome Coordenador: " + Opp4.DigiteNome (null));
		System.out.println("RA: " + Opp4.DigiteRA (1036498));
	}
	
	public static void Escolha5(Diretor Opp5) {	
		System.out.println(Opp5.ExibeDiretor("Direção da Fatec Zona Sul"));
		System.out.println("Nome Coordenador: " + Opp5.DigiteNome (null));
		System.out.println("RA: " + Opp5.DigiteRA (1036498));
	}
	
	public static void Escolha6(Vestibulando Opp6) {	
		System.out.println(Opp6.ExibeEtec("ETEC do Campus da Fatec Zona Sul"));
		System.out.println("Nome Coordenador: " + Opp6.DigiteNome (null));
		System.out.println("RA: " + Opp6.DigiteRA (1036498));
	}
		
	public static void main (String []args) {
		Layout();
	}
}
