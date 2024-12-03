package com.example.Empresa.Persistencia.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "factura-compra")
public class Factura implements Serializable {
    @Id
    @Column(name = "cod_factura")
    private String CodFactura;
    private LocalDate fecha;
    @Column (name = "ident_cliente")
    private String IdentCliente;
    @Column (name = "ident_vendedor")
    private String IdentVendedor;
    @Column(name = "activo")
    private boolean Activo;

    @ManyToOne
    @JoinColumn(name = "ident_cliente", insertable = false, updatable = false)
    private Cliente cliente;
    public String getCodFactura() {
        return CodFactura;
    }

    public void setCodFactura(String codFactura) {
        CodFactura = codFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdentCliente() {
        return IdentCliente;
    }

    public void setIdentCliente(String identCliente) {
        IdentCliente = identCliente;
    }

    public String getIdentVendedor() {
        return IdentVendedor;
    }

    public void setIdentVendedor(String identVendedor) {
        IdentVendedor = identVendedor;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean activo) {
        Activo = activo;
    }
}
