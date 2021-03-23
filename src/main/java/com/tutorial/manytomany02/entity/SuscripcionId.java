package com.tutorial.manytomany02.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SuscripcionId implements Serializable {

    private int idUser;
    private int idCanal;

    public SuscripcionId() {
    }

    public SuscripcionId(int idUser, int idCanal) {
        this.idUser = idUser;
        this.idCanal = idCanal;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(int idCanal) {
        this.idCanal = idCanal;
    }
}
