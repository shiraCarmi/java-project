/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import libraryClass.ClientLibrary;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author The user
 */
public class ClientService {

    public void addClient(ClientLibrary client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(client);
        tx.commit();
        session.close();
    }

    public void getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ClientLibrary c1 = (ClientLibrary) session.get(ClientLibrary.class, id);
        session.close();
        System.out.println("libraryClass.Main.getById()");
        System.out.println("name" + " " + " " + c1.getName() + " " + " " + "nam of book" + "" + c1.getNumOfBooks());

    }

    public boolean exist(String name, int password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query qry = session.createQuery("from ClientLibrary where name=" + name + '"');
        List<ClientLibrary> listName = qry.list();
       session.close();
        for (ClientLibrary clientLibrary : listName) {
            if (clientLibrary.getPassword() == password) 
                return true;
        }
        return false;
    }
}
