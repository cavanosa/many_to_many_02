package com.tutorial.manytomany02.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Canal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "canal")
    private Set<Suscripcion> subs = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Suscripcion> getSubs() {
        return subs;
    }

    public void setSubs(Set<Suscripcion> subs) {
        this.subs = subs;
    }
}
