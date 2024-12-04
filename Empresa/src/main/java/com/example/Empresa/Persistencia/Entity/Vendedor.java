package com.example.Empresa.Persistencia.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "vendedor")
public class Vendedor {
    @Id
    @Column(name = "ident_vendedor")
    private String Ident_vendedor;

    @Column(name = "nom_vendedor")
    private String nom_vendedor;

    @Column(name = "tel_vendedor")
    private String tel_vendedor;


    @Column(name = "activo")
    private boolean Activo;

    @OneToMany(mappedBy = "vendedor")
    private List <Factura> Factura;

    public String getIdent_vendedor() {
        return Ident_vendedor;
    }

    public void setIdent_vendedor(String ident_vendedor) {
        Ident_vendedor = ident_vendedor;
    }

    public String getNom_vendedor() {
        return nom_vendedor;
    }

    public void setNom_vendedor(String nom_vendedor) {
        this.nom_vendedor = nom_vendedor;
    }

    public String getTel_vendedor() {
        return tel_vendedor;
    }

    public void setTel_vendedor(String tel_vendedor) {
        this.tel_vendedor = tel_vendedor;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean activo) {
        Activo = activo;
    }
}
