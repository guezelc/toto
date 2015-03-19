/**
 * Une pile d'entier positifs ou nuls
 * @author Coste Louis / Guezel Cl�ment
 */

public class PileEntiersPositifsOuNuls {

	
	/**
	 *  Capacit� par default 
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
	 * Cr�er une pile avec	- la capacit� par d�fault
	 * 						- la taille par d�fault
	 * 						- un tableau d'�l�ment par rapport � la capacit� par d�fault
	 */
	
	public PileEntiersPositifsOuNuls() {
		
		this.capacite=CAPACITE_DEFAULT;
		this.taille=TAILLE_DEFAULT;
		this.elements=new int [CAPACITE_DEFAULT];
		
	}
	
	/**
	 * Cr�er une pile avec	- une capacit� saisie : "capaciteDefault"
	 * 						- la taille par d�fault
	 * 						- un tableau d'�l�ment par rapport � la "capaciteDefault"
	 */
	
	 public PileEntiersPositifsOuNuls(int capaciteDefault) {
		 
		this.capacite=capaciteDefault;
		this.taille=TAILLE_DEFAULT;
		this.elements=new int [capaciteDefault];
		 
	 }
	 
	 /**
	  *retourne la capacit� de la pile 
	  * @return la capacit� de la pile 
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
	  * rajoute un �l�ment et augmente la taille de la pile
	  * si la taille est inf�rieur � la capacit� de la pile
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
	  * retourne l'�l�ment au sommet de la pile
	  * @return voirSommet
	  */
	 
	 public int voirSommet() {
		 
		 return(this.elements[taille]);
		 
	 }
	
}
