package Controller;

public class SomaController {

	public SomaController() {
		super();
	}

	public int somaNaturais (int num) {
		//Condição de parada quando valor inicial chegar a zero
		if(num <= 0) {
			return 0;
		} else
			return num + somaNaturais(num -1) ;
		//soma o valor inicial diminuindo em um a cada chamada
	}
}
