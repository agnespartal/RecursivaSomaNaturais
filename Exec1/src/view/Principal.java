package view;

import Controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		SomaController soma = new SomaController();
		
		int num = 5;
		
		int resultado = soma.somaNaturais(num);
		System.out.println(resultado);
	}

}
