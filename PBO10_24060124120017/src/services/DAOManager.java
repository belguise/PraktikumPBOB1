package services;

public class DAOManager {

    private static PersonDAO personDAO;

    public static PersonDAO getPersonDAO() {

        if (personDAO == null) {
            personDAO = (PersonDAO) new MySQLPersonDAO();
        }

        return personDAO;
    }
}