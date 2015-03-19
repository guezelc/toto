
public class Main {

	public static void main(String[] args) {
		
		PileEntiersPositifsOuNuls Pile1= new PileEntiersPositifsOuNuls() ;
		Pile1.empiler(2);
		System.out.println(Pile1.getTaille())	;
		Pile1.empiler(3);
		System.out.println(Pile1.voirSommet())	;
		System.out.println(Pile1.getTaille())	;
	}

}
