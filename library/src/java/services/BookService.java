/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import libraryClass.Book;
import libraryClass.ClientLibrary;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author כרמי שירה
 */
public class BookService {
    
    public Book getById(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Book book = (Book) session.get(Book.class, id);
        session.close();
        System.out.println("libraryClass.Main.getById()");
        System.out.println("name" + "  "+ book.getName() + "  " +"id of book: "+id);  
        return book;
    }
    
   public void addBook(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(book);
        tx.commit();
        session.close();
    }
    
    
}
