package uvsq.pglp_3_2;

public abstract class Employee {
	  protected int ancienete;
	  /**
	  * Calcul du salaire de base d'un employee.
	  */  

	  public int calculSalaire() {
	    return 1500 + 20 * ancienete;
	  }
	}
