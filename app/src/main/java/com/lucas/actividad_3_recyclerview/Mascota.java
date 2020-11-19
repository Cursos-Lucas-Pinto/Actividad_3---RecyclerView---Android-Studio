package com.lucas.actividad_3_recyclerview;

public class Mascota {
    private int imagen;
    private String nombre;
    private int numLikes;

    public Mascota (int imagen, String nombre, int numLikes) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.numLikes = numLikes;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }
}
