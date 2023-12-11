package atividade04;

import java.util.Scanner;

public class Matrix01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int numParticipantes = 10;
	        int numBimestres = 4;

	       
	        double[][] notas = new double[numParticipantes][numBimestres];

	        
	        lerNotas(notas);

	        
	        double[] medias = calcularMedias(notas);

	        
	        System.out.println("\nMédias de cada participante:");
	        for (int i = 0; i < numParticipantes; i++) {
	            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
	        }
	    }

	    
	    private static void lerNotas(double[][] notas) {
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < notas.length; i++) {
	            System.out.println("Digite as notas do participante " + (i + 1) + ":");
	            for (int j = 0; j < notas[i].length; j++) {
	                System.out.print("Bimestre " + (j + 1) + ": ");
	                notas[i][j] = scanner.nextDouble();
	            }
	        }
	    }

	   
	    private static double[] calcularMedias(double[][] notas) {
	        double[] medias = new double[notas.length];

	        for (int i = 0; i < notas.length; i++) {
	            double soma = 0;
	            for (int j = 0; j < notas[i].length; j++) {
	                soma += notas[i][j];
	            }
	            medias[i] = soma / notas[i].length;
	        }

	        return medias;
	    }
	
		
	}


