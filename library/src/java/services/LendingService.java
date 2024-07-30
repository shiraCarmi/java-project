/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import libraryClass.Lending;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author כרמי שירה
 */
public class LendingService {

    public void addBook(Lending lending) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(lending);
        tx.commit();
        session.close();
    }

    public void update(Lending lending) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(lending);
        tx.commit();
        session.close();
    }
}
