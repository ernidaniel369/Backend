
package com.server2.server2.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String resumen;
    private String enlace;
    private String imagen;

    public Proyecto() {
    }

    public Proyecto(String titulo, String resumen, String enlace, String imagen) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.enlace = enlace;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    
    public String getImagen(){
        return imagen;
    }
    
    public void setImagen(String imagen){
        this.imagen = imagen;
    }
    

}
