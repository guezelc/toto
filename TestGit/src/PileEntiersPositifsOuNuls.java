/**
 * Une pile d'entier positifs ou nuls
 * @author Coste Louis / Guezel Clément
 */

public class PileEntiersPositifsOuNuls {

	
	/**
	 *  Capacité par default 
	 */
	public static final int CAPACITE_DEFAULT = 4;
	/**
	 *  Taille par default 
	 */
	public final static int TAILLE_DEFAULT = 0;
	
	private int capacite;
	private int taille ;
	private int[] elements ;
	
	/**
	 * Créer une pile avec	- la capacité par défault
	 * 						- la taille par défault
	 * 						- un tableau d'élément par rapport à la capacité par défault
	 */
	
	public PileEntiersPositifsOuNuls() {
		
		this.capacite=CAPACITE_DEFAULT;
		this.taille=TAILLE_DEFAULT;
		this.elements=new int [CAPACITE_DEFAULT];
		
	}
	
	/**
	 * Créer une pile avec	- une capacité saisie : "capaciteDefault"
	 * 						- la taille par défault
	 * 						- un tableau d'élément par rapport à la "capaciteDefault"
	 */
	
	 public PileEntiersPositifsOuNuls(int capaciteDefault) {
		 
		this.capacite=capaciteDefault;
		this.taille=TAILLE_DEFAULT;
		this.elements=new int [capaciteDefault];
		 
	 }
	 
	 /**
	  *retourne la capacité de la pile 
	  * @return la capacité de la pile 
	  */
	 
	 public int getCapacite() {
		 
		 return (capacite);	
		 
	 }
	 
	 /**
	  * retourne la taille de la pile
	  * @return la taille de la pile
	  */
	 public int getTaille() {
		 
		 return(taille);
		 
	 }
	 
	  
	 /**
	  * rajoute un élément et augmente la taille de la pile
	  * si la taille est inférieur à la capacité de la pile
	  * @param newElement
	  */
	 public void empiler(int newElement) {		 
		 
		 if(this.taille<this.capacite) {
			 this.elements[taille]=newElement;
			 this.taille=taille+1;
		 }
		 	 
		 
	 }
	/**
	 *  reduis la taille de la pile si la taille n'est pas nul
	 */
	 
	 public void depiler() {
		 
		 if(taille>TAILLE_DEFAULT) {
			 this.taille=taille-1;
			 
		 }
		 
		 
	 }
	 /**
	  * retourne l'élément au sommet de la pile
	  * @return voirSommet
	  */
	 
	 public int voirSommet() {
		 
		 return(this.elements[taille]);
		 
	 }
	
}
