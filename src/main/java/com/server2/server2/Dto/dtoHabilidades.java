
package com.server2.server2.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHabilidades {
    @NotBlank
    private String nombre;
    @NotBlank
    private int nivel;
    @NotBlank
    private String imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public dtoHabilidades(String nombre, int nivel, String imagen) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.imagen = imagen;
    }

    public dtoHabilidades() {
    }
}
