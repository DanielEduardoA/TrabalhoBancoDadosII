package br.edu.univas.passageiro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private static final EntityManagerFactory entityManagerFactory = buildSessionFactory();

    private static EntityManagerFactory buildSessionFactory() {
        try {
            return Persistence.createEntityManagerFactory("passageiroPU"); 
        } catch (Exception e) {
            System.err.println(" Error creating EntityManagerFactory ." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
