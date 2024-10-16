package Main;

import work.FuncoesUteis;

public class Main {

    public static void main(String[] args) {
    
        // Chamando o metodo soma, triangulo e lerArquivo e retornando o resultado
        System.out.println("Resultado da soma: " + FuncoesUteis.soma(5, 4) + "\n");
        
        System.out.println("Triangulo de altura 5:");
        FuncoesUteis.triangulo(5);
        
        String conteudo = "Este e o conteudo do arquivo.";
        System.out.println("\nConteudo do arquivo:");
        System.out.println(FuncoesUteis.lerArquivo(conteudo) + "\n");
    }
}
