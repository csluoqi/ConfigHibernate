package entities;


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
    /**
     * flush: 使数据库表何session缓存中的对象保持一致,为了保持一致,可能发送对应的sql语句
     * 1.在Transaction的commit()方法中:先调用session的flush的flush方法,再提交事物
     * flush() 方法可能会发送sql语句,但不会提交事物.
     * 3.注意:
     * 1).在未提交事物或者显示调用session.flush(),方法之前,也有可能进行flush()操作.
     * 2)执行HQL,或者QBC查询,会先进行flush()操作,以得到数据库表的最新的记录
     * 
     */  
    @Test
    public void testSessionFlush()
    {
        Book b = (Book) session.get(Book.class, 1);
        System.out.println(b);
        b.setAuthor("sun123");
        //session.flush();
        //这个方法的使用还不太清楚,但是现在在测试时数据库中应该只有一条记录就不会错
        Book b2 = (Book) session.createCriteria(Book.class).uniqueResult();
        System.out.println(b2);
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
