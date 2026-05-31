//Nama : Lintang Aulia Nuraini
//NIM : 24060124120017

package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Person;

public class MySQLPersonDAO implements PersonDAO {

    @Override
    public void savePerson(Person p) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo",
                "root",
                ""
        );

        String sql = "INSERT INTO person(name) VALUES(?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, p.getName());

        ps.executeUpdate();

        System.out.println("Data berhasil disimpan");

        ps.close();
        con.close();
    }
}