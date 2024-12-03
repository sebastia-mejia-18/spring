package com.example.Empresa.Persistencia.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    @Id

    @Column(name = "Cod_Producto")
    private String cod_producto;

    @Column(name = "Nom_Producto")
    private String nom_producto;

    @Column(name = "existencia")
    private Integer Existencias;

    @Column (name = "Valor_Actual")
    private float valor_actual;

    @Column(name = "activo")
    private boolean activo;

    @OneToMany(mappedBy = "producto")
    private List<ProductoFactura> ProductoFactura;



    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public Integer getExistencias() {
        return Existencias;
    }

    public void setExistencias(Integer existencias) {
        Existencias = existencias;
    }

    public float getValor_actual() {
        return valor_actual;
    }

    public void setValor_actual(float valor_actual) {
        this.valor_actual = valor_actual;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

