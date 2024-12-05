package com.example.Empresa.Persistencia.Entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "clientes")
public class Cliente implements Serializable {
    @Id
    @Column(name = "ident_cliente")
    private String IdenCliente;

    @Column(name = "nom_cliente")
    private String NomCliente;

    @Column(name = "dir_cliente")
    private String DirCliente;

    @Column(name = "tel_cliente")
    private String TelCliente;

    @Column(name = "activo")
    private boolean activo;

    @OneToMany(mappedBy = "factura")
    private List <Factura> Factura;

    public String getIdenCliente() {
        return IdenCliente;
    }

    public void setIdenCliente(String idenCliente) {
        IdenCliente = idenCliente;
    }

    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String nomCliente) {
        NomCliente = nomCliente;
    }

    public String getDirCliente() {
        return DirCliente;
    }

    public void setDirCliente(String dirCliente) {
        DirCliente = dirCliente;
    }

    public String getTelCliente() {
        return TelCliente;
    }

    public void setTelCliente(String telCliente) {
        TelCliente = telCliente;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
