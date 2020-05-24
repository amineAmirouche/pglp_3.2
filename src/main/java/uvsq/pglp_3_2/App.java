package uvsq.pglp_3_2;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;

/**
 * Hello world!.
 *
 */
public class App {
  /**
  * Initialisation des employés et calcule du salaire
  *
  */
  public static void main(String[] args) {
    ArrayList<Employee> t = new ArrayList<Employee>();
    t.add(new Vendeur(4,500));
    t.add(new Manager(3,40));
    int sum = 0;
    for (int a = 0;a < t.size();a++) {
      sum = sum + t.get(a).calculSalaire();
    }
    System.out.println(sum);
  }
}