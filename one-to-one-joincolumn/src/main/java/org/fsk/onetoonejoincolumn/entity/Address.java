package org.fsk.onetoonejoincolumn.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Address")
@Table(name = "address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String country;

    public Address() {
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
