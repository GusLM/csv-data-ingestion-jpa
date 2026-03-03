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

        em.getTransaction().begin();
        personList.forEach(em::persist);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
