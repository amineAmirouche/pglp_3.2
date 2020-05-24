package uvsq.pglp_3_2;

public class Vendeur extends Employee {
	  public int prime;
	  
	  /**
	   * Constructeur du vendeur. 
	   * @param anc : les années d'experiences
	   * @param com : la commision du vendeur
	   */
	  public  Vendeur(int exp,int com) {
	    if (com < 0 || exp < 0) {
	      throw new IllegalArgumentException();
	    }
	    prime = com;
	    ancienete = exp;
	  }
	  
	  /**
	   * Calcul du salaire de base d'un employee et ajout de la commision.
	   */ 
	  public int calculSalaire() {
	    return super.calculSalaire() + prime;
	  }
	}
