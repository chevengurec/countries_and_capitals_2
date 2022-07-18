package com.example.cac2.entity;

import javax.persistence.*;

@Entity
@Table(name = "america")
public class America {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country", nullable = false)
    public String country;

    @Column(name = "capital", nullable = false)
    public String capital;


    public America() {
    }

    public America(String name, String capital) {
        this.country = name;
        this.capital = capital;
    }

    public America(String capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }


    public void setCountry(String name) {
        this.country = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}