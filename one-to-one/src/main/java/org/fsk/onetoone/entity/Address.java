package org.fsk.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
