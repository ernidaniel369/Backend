
package com.server2.server2.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String tituloEd;
    @NotBlank
    private String descripcionEd;
    @NotBlank
    private String tiempoEd;

    public dtoEducacion() {
    }

    public dtoEducacion(String tituloEd, String descripcionEd, String tiempoEd) {
        this.tituloEd = tituloEd;
        this.descripcionEd = descripcionEd;
        this.tiempoEd = tiempoEd;
    }

    public String getTituloEd() {
        return tituloEd;
    }

    public void setTituloEd(String tituloEd) {
        this.tituloEd = tituloEd;
    }

    public String getDescripcionEd() {
        return descripcionEd;
    }

    public void setDescripcionEd(String descripcionEd) {
        this.descripcionEd = descripcionEd;
    }

    public String getTiempoEd() {
        return tiempoEd;
    }

    public void setTiempoEd(String tiempoEd) {
        this.tiempoEd = tiempoEd;
    }
    
}
