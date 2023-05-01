package org.example.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entity.Car;
import org.example.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateConfig {

    public static EntityManager getEntityManager() {
        try {
            Configuration configuration = new Configuration();
            configuration.setProperty(DRIVER, "org.postgresql.Driver");
            configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/postgres");
            configuration.setProperty(USER, "postgres");
            configuration.setProperty(PASS, "1234");
            configuration.setProperty(HBM2DDL_AUTO, "create");
            configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            configuration.setProperty(SHOW_SQL, "true");
            configuration.addAnnotatedClass(Car.class);
            configuration.addAnnotatedClass(User.class);
            return configuration.buildSessionFactory().createEntityManager();
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    }


