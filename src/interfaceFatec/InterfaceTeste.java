package interfaceFatec;
import java.util.*;


public interface InterfaceTeste {
	
	/* Layout */
	public static void Layout() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("*************************************************");
			System.out.println("                FATEC ZONA SUL                   ");
			System.out.println("*************************************************\n\n");
			
			System.out.println("Qual é sua Relação com a FATEC?");
			System.out.print("(1) Estudante, (2) Profesor, (3) Adiministrador, (4) Coordenador, (5) Diretor, (6) Vestibulando, (7) Nenhum: ");
			int valor = s.nextInt();
			System.out.println("");
		
			System.out.print("Digite seu RA: ");
			int RA = s.nextInt();
			System.out.println("");
			
			if (valor == 1) {
				Escolha1 (new Estudante(null, RA));	
			}else if (valor == 2) {
				Escolha2 (new Professor(null, RA));
			}else if (valor == 3){
				Escolha3(new Administrador(null, RA));
			} else if (valor == 4) {
				Escolha4 (new Coordenador(null, RA));
			} else if (valor == 5) {
				Escolha5 (new Diretor(null, RA));
			} else if (valor == 6) {
				Escolha6 (new Vestibulando(null, RA));
			} else {
				System.out.println("Digite Novamente!");
				return;
			}
			
			
		}	
	}

	/* Clases Abstrata */
	public static void Escolha1(Estudante Opp1) {
		System.out.println(Opp1.ExibeEstudante("Estudante da Fatec Zona Sul"));
		System.out.println("\nEstudante: " + Opp1.DigiteNome());
		System.out.println("RA:" + Opp1.RA);
	}
	
	public static void Escolha2(Professor Opp2) {
		System.out.println(Opp2.ExibeProf("Professor / Professora da Fatec Zona Sul"));
		System.out.println("\nProf." + Opp2.DigiteNome());
		System.out.println("RA:" + Opp2.DigiteRA());
	}
	
	public static void Escolha3(Administrador Opp3) {	
		System.out.println(Opp3.ExibeAdm("Setor Administrativo da Fatec Zona Sul"));
		System.out.println("\nNome do(a) Administrador / Administradora: " + Opp3.DigiteNome ());
		System.out.println("RA: " + Opp3.DigiteRA ());
	}
		
	public static void Escolha4(Coordenador Opp4) {	
		System.out.println(Opp4.ExibeCoor("Coordenação da Fatec Zona Sul"));
		System.out.println("\nNome do(a) Coordenador / Cordenadora: " + Opp4.DigiteNome ());
		System.out.println("RA: " + Opp4.DigiteRA ());
	}
	
	public static void Escolha5(Diretor Opp5) {	
		System.out.println(Opp5.ExibeDiretor("Direção da Fatec Zona Sul"));
		System.out.println("\nNome do(a) Diretor / Diretora: " + Opp5.DigiteNome ());
		System.out.println("RA: " + Opp5.DigiteRA ());
	}
	
	public static void Escolha6(Vestibulando Opp6) {	
		System.out.println(Opp6.ExibeEtec("ETEC do Campus da Fatec Zona Sul"));
		System.out.println("Nome do Vestibulando: " + Opp6.DigiteNome ()); 
		System.out.println("\nRA: " + Opp6.DigiteRA ());
	}
		
	public static void main (String []args) {
		Layout();
	}
}
