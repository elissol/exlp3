package exercicio5;



public class Main {
	 public static void main(String[] args) {
	    
	    
		 DispositivoEletronico televisao = new Televisao();
	     DispositivoEletronico computador = new Computador();

	     // Chamando os métodos tocar() e afinar() para cada instrumento
	     televisao.ligar();
	     televisao.desligar();

	     System.out.println();

	     computador.ligar();
	     computador.desligar();
	 }
	}
