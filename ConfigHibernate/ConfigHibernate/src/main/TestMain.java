package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import entities.Book;

public class TestMain
{
    public static void main(String[] args)
    {
        Configuration config = new Configuration().configure();

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(config.getProperties()).build();
        SessionFactory sf = config.buildSessionFactory(serviceRegistry);

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        Book b = new Book();
        b.setName("兄弟");
        b.setAuthor("unknow");
        b.setPrice(12.1);
        b.setInfo("123qwer");
        b.setPublishDate(new java.util.Date());
        session.save(b);

        transaction.commit();
        session.close();
        sf.close();
    }
}
