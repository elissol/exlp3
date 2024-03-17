package exercicio4;


public class Main {
 public static void main(String[] args) {
    
    
	 InstrumentoMusical violao = new Violao();
     InstrumentoMusical piano = new Piano();

     // Chamando os métodos tocar() e afinar() para cada instrumento
     violao.tocar();
     violao.afinar();

     System.out.println();

     piano.tocar();
     piano.afinar();
 }
}

