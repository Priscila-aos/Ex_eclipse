package br.com.generation.lista1;

import java.util.Scanner;

public class Programa��o_Sequencial_ex2 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o n�mero de dias totais: ");
		int dias = leia.nextInt();
		
		int ano = dias / 365;
		int mes = (dias % 365) / 30;		
		int dia = (dias % 365) % 30;
		
		System.out.println("Total de anos: " + ano + "\nmeses: "+mes+"\ne dias: " +dia);
		
		leia.close(); 	
}
}
