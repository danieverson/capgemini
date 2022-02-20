/*
Algoritmo para criar uma escada de n degraus.
 */

import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;
        int x=0;
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        for	(int	i	=	1; i	<=	n;	i++)	{
            for	(int	j	=	n;	j	>	i;	j--) {
                System.out.print(" ");
                x=i;
            }
            if (i==n){
                System.out.print("*");
            }
            for	(int	z	=	0;	z	<	x;	z++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
