package com.emergentes;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "libroBean")
@RequestScoped
public class LibroBean {
    private String titulo;
    private String autor;
    private String resumen;
    private String medio;
    
    public LibroBean() {
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getResumen() {
        return resumen;
    }
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    public String getMedio() {
        return medio;
    }
    public void setMedio(String medio) {
        this.medio = medio;
    }
}
