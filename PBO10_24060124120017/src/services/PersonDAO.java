package services;

import model.Person;

public interface PersonDAO {
    public void savePerson(Person p) throws Exception;
}