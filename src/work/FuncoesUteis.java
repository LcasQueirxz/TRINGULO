package work;

public class FuncoesUteis {

    // Metodo para somar dois numeros
    public static int soma(int a, int b) {
        return a + b;
    }

    // Metodo para criar um triangulo com a altura especificada
    public static void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    // Metodo para retornar o conteudo de um arquivo como string
    public static String lerArquivo(String conteudoArquivo) {
        return conteudoArquivo;
    }
}
