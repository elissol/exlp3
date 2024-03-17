package exercicio3;



//Classe principal 
public class Main {
 
	public static void main(String[] args) {
     // Testando as classes
     Planta planta = new Planta();
     Flor flor = new Flor();
     Arvore arvore = new Arvore();

     // Chamando o método fotossintese de cada objeto
     planta.fotossintese(); 
     flor.fotossintese();   
     arvore.fotossintese(); 
 }
}

