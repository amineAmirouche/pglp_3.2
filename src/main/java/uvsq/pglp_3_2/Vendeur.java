package uvsq.pglp_3_2;

public class Vendeur extends Employee {
	  public int prime;
	  
	  /**
	   * Constructeur du vendeur. 
	   * @param exp : les années d'experiences
	   * @param com : la prime du vendeur
	   */
	  public  Vendeur(int exp,int com) {
	    if (com < 0 || exp < 0) {
	      throw new IllegalArgumentException();
	    }
	    prime = com;
	    ancienete = exp;
	  }
	  
	  /**
	   * Calcul du salaire de base d'un employee et ajout de la prime
	   */ 
	  public int calculSalaire() {
	    return super.calculSalaire() + prime;
	  }
	}
