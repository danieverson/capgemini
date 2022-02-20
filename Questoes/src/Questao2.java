/*
Algoritmo para verificar a força de uma senha pelo critério de número de caracteres
 */
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        int diferencatamanhoSenha, tamanhoSenha, tamanhoSenhaMinimo = 6;
        Scanner entrada = new Scanner(System.in);
        String senha ;
        System.out.print("Digite uma senha: ");
        senha = entrada.nextLine();
        tamanhoSenha = senha.length();
        diferencatamanhoSenha = tamanhoSenhaMinimo - tamanhoSenha ;
        if (diferencatamanhoSenha > 0) {
            System.out.printf("Faltam %d caracteres para compor o número mínimo de caracteres exigido para a senha ", diferencatamanhoSenha);
        }else{
            System.out.printf("A senha satisfaz os requisitos de quantidade de caracteres! ");
        }
    }
}
