package org.fsk.onetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "User")
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Address address;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, Address address) {
        this.userName = userName;
        this.address = address;
    }
}
