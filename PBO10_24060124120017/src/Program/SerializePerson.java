// Nama : Lintang Aulia Nuraini
//NIM : 24060124120017
package program;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import model.Person;

public class SerializePerson {

    public static void main(String[] args) {

        try {

            Person p = new Person();

            p.setName("Lintang Aulia");

            FileOutputStream fileOut =
                    new FileOutputStream("person.ser");

            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);

            out.writeObject(p);

            out.close();
            fileOut.close();

            System.out.println("Objek berhasil diserialisasi");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}