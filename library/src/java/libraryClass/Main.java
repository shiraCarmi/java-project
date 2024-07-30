/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryClass;
//import org.hibernate.Session;

import services.HibernateUtil;
import org.hibernate.*;

/**
 *
 * @author The user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void addClient(ClientLibrary client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        client.setName(client.getName());
        client.setNumOfBooks(client.getNumOfBooks());

        session.persist(client);
        tx.commit();
    }

    public static void getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ClientLibrary c1 = (ClientLibrary) session.get(ClientLibrary.class, id);
        System.out.println("libraryClass.Main.getById()");
        System.out.println("name" + " " + " " + c1.getName() + " " + " " + "nam of book" + "" + c1.getNumOfBooks());

    }

    public static void main(String[] args) {
        ClientLibrary c1 = new ClientLibrary();
        c1.setName("Noa");
        c1.setNumOfBooks(4);
        c1.setPassword(123456789);
        c1.setPhone("0548459578");

//        ClientLibrary c2 = new ClientLibrary();
//        c1.setName("Sari");
//        c1.setNumOfBooks(3);
//        c1.setPassword(123456789);
//
//        ClientLibrary c3 = new ClientLibrary();
//        c1.setName("Natan");
//        c1.setNumOfBooks(2);
//        c1.setPassword(123456789);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
//         Item item=new Item();
//        item.setName("my sister");
//        session.save(item);

//         Book book=new Book();
//         book.setCategory("holocaust");
//         book.setAuthor("Uri");
//         book.setName("Ana Hlch");
//         session.save(book);
//         tx.commit();
        // addClient(c1);
        // addClient(c2);
        // addClient(c3);
        // getById(new Long(1));
    }
}
