/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryClass;

import javax.persistence.*;

/**
 *
 * @author The user
 */ 

@Entity
//@DiscriminatorValue("Book")
public class Book extends Item{
    private String author;
    private String category;

    public Book(Long id, String name,String author, String category ) {
        super(id, name);
        this.author = author;
        this.category = category;
    }
    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }}

