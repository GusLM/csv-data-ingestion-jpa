package application;

import domain.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import service.FileReaderService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new FileReaderService().personList("personsList.csv");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // ======== Create the person table if it doesn't exist and insert data. ========
        em.getTransaction().begin();
        personList.forEach(em::persist);
        em.getTransaction().commit();

        // ======== Executes a query and returns the data from the table. ========
        Person person = em.find(Person.class, 2);
        System.out.println(person);

        em.close();
        emf.close();
    }
}
