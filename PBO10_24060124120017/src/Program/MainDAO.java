// nama : lintang aulia nuraini
// nim : 24060124120017
package Program;

import model.Person;
import services.DAOManager;

public class MainDAO {

    public static void main(String[] args) {

        try {

            Person p = new Person();

            p.setName("Lintang Aulia Nuraini");

            DAOManager.getPersonDAO().savePerson(p);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}