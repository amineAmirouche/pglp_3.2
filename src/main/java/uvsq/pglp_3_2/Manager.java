package uvsq.pglp_3_2;

public class Manager extends Employee {
	  public int nbEmp;
	  /**
	  * Constructeur du manager. 
	  * @param exp : les années d'experience
	  * @param nbElem : nombre d'employee sous la responsabilité 
	  */
	  
	  public Manager(int exp,int nbEm) {
	    if (nbEm < 0 || exp < 0) { 
	      throw new IllegalArgumentException(); 
	    }
	    nbEmp = nbEm;
	    ancienete = exp;
	  }

	  /**
	   * Calcul du salaire de base d'un employee en considerant la prime manager.
	   */ 
	  public int calculSalaire() {
	    return super.calculSalaire() + nbEmp * 100;
	  }
	}
