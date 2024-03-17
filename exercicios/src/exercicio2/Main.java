package exercicio2;
//exercicio2

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de compras (lista de Strings)
        List<String> listaDeCompras = new ArrayList<>();

        // Adicionando alguns itens à lista
        listaDeCompras.add("Maçãs");
        listaDeCompras.add("Leite");
        listaDeCompras.add("Pão");
        listaDeCompras.add("Laranja");

        // Imprimindo todos os itens da lista
        System.out.println("Lista de Compras:");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        // Removendo um item da lista 
        listaDeCompras.remove("Pão");

        // Imprimir depois da remoção
        System.out.println("\nLista de Compras após remover 'Pão':");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }
    }
}

