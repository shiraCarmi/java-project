    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */
    package libraryClass;

    import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
 
import javax.persistence.Id;

/**
 *
 * @author The user
 */
 
/**
 *
 * @author The user
 */
@Entity
public class ClientLibrary implements Serializable {

     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private int password;
    private String phone;
    private int numOfBooks;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private  List<Lending> lendingList;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public List<Lending> getLendingList() {
        return lendingList;
    }

    public void setLendingList(List<Lending> lendingList) {
        this.lendingList = lendingList;
    }
  
    
    
    
   

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumOfBooks() {
        return numOfBooks;
    }
    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }
 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientLibrary)) {
            return false;
        }
        ClientLibrary other = (ClientLibrary) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.Client[ id=" + id + " ]";
    }
    
}
