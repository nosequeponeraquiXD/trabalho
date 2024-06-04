package candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSelectivo {
	public static void main(String[] args){
		System.out.println("Processo selectivo");
		
	}
	
	static void imprimirSelecionados(){
		String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println(" O candidato de n " + (indice+1) + " é " +candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de interacao for each");
		
		for(String candidato: candidatos ) {
			System.out.println("O candidato selecionado foi " +candidato);
		}	
	}
	
	static void entrandoEmContacto(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu=atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contato realizado com sucesso ");
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("Conseguemos contato com " +candidato+ "na" +tentativasRealizadas+ "tentativa");
		else
			System.out.println("Nao conseguimos contato com " +candidato+ ", numero maximo tentativas " +tentativasRealizadas+ "realizada");
	}
	
	static boolean atender(){
		return new Random().nextInt(3)==1;
	}
	
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Felipe","Maria","Julia","Paulo","Monica","Augusto","Fabricio","Mirela","Daniela","Jorge"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos [candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println(" O candidato " +candidato + " Solicitou este valor de salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println(" O candidato " +candidato+ " Foi selecionado para vaga ");
				candidatosSelecionados++;
				
			}
		candidatoAtual++;	
		}
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
		
	}static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
	}else if(salarioBase == salarioPretendido)
		System.out.println("Ligar para o candidado com contra proposta");
	else {
		System.out.println("Aguardando o resultado dos demais candidados");
	}
			
	}
	
	
}