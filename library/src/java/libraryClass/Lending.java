/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author The user
 */
@Entity
public class Lending {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ClientLibrary client; 
}
