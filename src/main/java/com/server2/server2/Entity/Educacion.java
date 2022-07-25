
package com.server2.server2.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloEd;
    private String descripcionEd;
    private String tiempoEd;

    public Educacion() {
    }

    public Educacion(String tituloEd, String descripcionEd, String tiempoEd) {
        this.tituloEd = tituloEd;
        this.descripcionEd = descripcionEd;
        this.tiempoEd = tiempoEd;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
