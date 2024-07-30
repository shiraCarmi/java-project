/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryClass;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author The user
 */
    @Entity
 @Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public class Item implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    private String name;

    public Item() {
    }
    
    public Item( Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

