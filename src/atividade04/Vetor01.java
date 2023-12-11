package atividade04;

import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int vetor [] = {7, 2, 9, 4, 1, 8, 6, 5, 3, 10};

	        
	        Scanner leia = new Scanner(System.in);
	        System.out.print("Digite um número para pesquisar: ");
	      
	        int numeroDigitado = leia.nextInt();

	      
	        boolean encontrado = false;
	        int posicao = -1;

	       
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numeroDigitado) {
	                encontrado = true;
	                posicao = i;
	                break; 
	            }
	        }

	        
	        if (encontrado) {
	            System.out.println("O número " + numeroDigitado + " foi encontrado na posição " + posicao + ".");
	        } else {
	            System.out.println("Não foi encontrado!");
	        }
	    }
	}



