package exercicios;


	    import java.util.ArrayList;
		import java.util.List;

		public class Main {
		    public static void main(String[] args) {
		        // Criar uma lista de inteiros
		        List<Integer> numeros = new ArrayList<>();

		        // Adicionar números à lista
		        numeros.add(11);
		        numeros.add(21);
		        numeros.add(31);
		        numeros.add(41);
		        numeros.add(51);

		        // Imprimir todos os números na lista
		        System.out.println("Números na lista:");
		        for (Integer numero : numeros) {
		            System.out.println(numero);
		        }
		    }
		}
	

