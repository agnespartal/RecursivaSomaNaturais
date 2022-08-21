package Controller;

public class SomaController {

	public SomaController() {
		super();
	}

	public int somaNaturais (int num) {
		
		if(num <= 0) {
			return 0;
		} else
			
			return num + somaNaturais(num -1) ;
	}
}
