package br.com.generation.lista1;

import java.util.*;

public class Programa��o_Sequencial_ex8 {
public static void main(String[] args) {
		
		float custoDeFabrica, custoFinal, distribuidor = 0.28f, impostos = 0.45f;

		Scanner l = new Scanner(System.in);
		
		System.out.println("Escreva o custo de f�brica do carro: ");
			custoDeFabrica = l.nextFloat();
		
			custoFinal = custoDeFabrica * (1 + (distribuidor + impostos));
		
		System.out.println("O custo final para o consumidor ser� de R$"+custoFinal);
		l.close();
		
	}

}
