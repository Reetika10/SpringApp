package guru.springframework.spring5webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    private Long id;
    private String name;
    //@OneToMany
    //@JoinColumn(name = publisher_id)
    //private Set<Book> books = new HashSet<>();

//    public Set<Book> getBooks() {
//        return books;
//    }

//    public void setBooks(Set<Book> books) {
//        this.books = books;
//    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressline1='" + addressline1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    private String addressline1;

    public Publisher(Long id, String name, String addressline1, String city, String state) {
        this.id = id;
        this.name = name;
        this.addressline1 = addressline1;
        this.city = city;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String city;
    private String state;

    public Publisher() {
    }

}
