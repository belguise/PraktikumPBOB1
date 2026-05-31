package program;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.Person;

public class ReadSerializedPerson {

    public static void main(String[] args) {

        try {

            FileInputStream fileIn =
                    new FileInputStream("person.ser");

            ObjectInputStream in =
                    new ObjectInputStream(fileIn);

            Person p = (Person) in.readObject();

            System.out.println("Nama : " + p.getName());

            in.close();
            fileIn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}