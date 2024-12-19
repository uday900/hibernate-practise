package com.darla.connection_setup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Movie movie = new Movie();
        
        movie.setName("wild future");
        movie.setDirector("dark darla");
        movie.setId(102);
        movie.setRelease_year(2050);
        
        Configuration configure = new Configuration().configure();
        
        SessionFactory session_factory = configure.buildSessionFactory();
        
        Session session = session_factory.openSession();
        
        Transaction tr = session.beginTransaction();
        session.save(movie);
        
        tr.commit();
        session.close();
        System.out.println("record saved success");
        
    }
}
