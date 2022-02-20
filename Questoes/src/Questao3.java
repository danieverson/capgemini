/*
Algoritmo para verificar a posição das substrings que são anagramas.
 */
public class Questao3 {

    public static void main(String[] args) {
        String palavra = "ifailhuqq";
        String atual, anterior, posterior, posterior1;
        int tamanhoPalavra = palavra.length();
        int tamanhoPosterior, indexAtual;

        for(int i = 0; i < tamanhoPalavra; i++){
            atual = palavra.substring(i,i+1);
            posterior = palavra.substring(i+1);
            tamanhoPosterior = posterior.length();
            for (int j =0; j< tamanhoPosterior; j++){
                posterior1 = posterior.substring(j,j+1);
                if (atual.equals(posterior1) ){
                    System.out.println(i +" "+ j+ " " + atual +" "+posterior1);

                }

            }
        }


    }
    public static void imprimeAnagramas(String prefix, String word) {

    }

}