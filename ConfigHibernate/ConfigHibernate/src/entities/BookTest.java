package entities;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest
{
    Configuration config = null;
    ServiceRegistry serviceRegistry = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction transaction = null;

    @Before
    public void init()
    {
        config = new Configuration().configure();

        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                config.getProperties()).build();
        sf = config.buildSessionFactory(serviceRegistry);

        session = sf.openSession();
        transaction = session.beginTransaction();

    }

    @After
    public void destroy()
    {
        transaction.commit();
        session.close();
        sf.close();
    }

    @Test
    public void test()
    {

        Book b1 = (Book) session.get(Book.class, 1);
        System.out.println(b1);
        Book b2 = (Book) session.get(Book.class, 1);
        System.out.println(b2);

    }
}
