/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import libraryClass.ClientLibrary;
import libraryClass.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author The user
 */
public class ItemService {
    
       public  void addItem(Item item)
    {
      Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.persist(item);
        tx.commit();
    }
    public  void getById(Long id)
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Item i1=(Item)session.get(Item.class,id);
        System.out.println("The Item you want");
        System.out.println("name"+" " +i1.getName());
      
    }
}
