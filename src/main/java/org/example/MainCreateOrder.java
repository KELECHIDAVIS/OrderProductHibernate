package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreateOrder {

    public static void main(String[] args){
            SessionFactory factory = new Configuration().
                configure("src/main/hibernate.cfg.xml").
                addAnnotatedClass(Order.class).
                buildSessionFactory();


    }
}
