package com.tutorial.manytomany02.entity;

import javax.persistence.*;

@Entity
public class Suscripcion {

    @EmbeddedId
    private SuscripcionId suscripcionId;

    private int likes;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @MapsId("idUser")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "canal_id")
    @MapsId("idCanal")
    private Canal canal;

    public Suscripcion() {
    }

    public Suscripcion(SuscripcionId suscripcionId, Usuario usuario, Canal canal) {
        this.suscripcionId = suscripcionId;
        this.usuario = usuario;
        this.canal = canal;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }
}
