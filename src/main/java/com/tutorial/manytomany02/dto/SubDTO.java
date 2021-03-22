package com.tutorial.manytomany02.dto;

public class SubDTO {

    private int idUser;

    private int idCanal;

    public SubDTO() {
    }

    public SubDTO(int idUser, int idCanal) {
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
