package com.luv2code.springdemo.mvc.hibernate.homework.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * @author Dmytro Melnychuk
 */
public class EmployeeOffice {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Employee adik = new Employee("Sam", "Parker", "Lincoln");
        Employee mary = new Employee("Mary", "Widson", "Absolute");

        Session session = factory.getCurrentSession();

        session.beginTransaction();
        session.save(adik);
        session.save(mary);

        Employee receivedMary = session.get(Employee.class, 2);
        System.out.println("I'm Mary from DB. My name in DB: " + receivedMary.getFirst_name());

        List<Employee> resultList = session.createQuery("from Employee e where e.company LIKE '%coln'").getResultList();
        resultList.forEach(System.out::println);
        session.createQuery("delete from Employee e where e.company LIKE '%coln'").executeUpdate();
        session.getTransaction().commit();
        session.close();


    }
}
