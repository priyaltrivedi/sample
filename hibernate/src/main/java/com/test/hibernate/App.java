package com.test.hibernate;

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
        
        Address addr =new Address();
        addr.setHono(18);
        addr.setStreet("south tukoganj");
        addr.setCity("Indore");
        addr.setState("MP");
        addr.setPincode(454001);
        
        
        
        
        Student std = new Student();
        std.setName("priyal");
        std.setRollno("ec21");
        std.setMarks(88);
        std.setAddress(addr);
        
        Configuration cfg = new Configuration().configure()
        		.addAnnotatedClass(Student.class);
       
       
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session s = sf.openSession();
        
        Transaction tx = s.beginTransaction();
        s.save(std);
        tx.commit();
        
        s.close();
        
    }
}
