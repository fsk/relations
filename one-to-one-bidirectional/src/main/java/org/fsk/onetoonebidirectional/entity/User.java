package org.fsk.onetoonebidirectional.entity;

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

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Address address;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public void setAddressDetail(Address address) {
        if (address == null) {
            if (this.address != null) {
                this.address.setUser(null);
            }
        }
        else {
            address.setUser(this);
        }
        this.address = address;
    }


}
