package com.example.Empresa.Persistencia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productofactura")
public class ProductoFactura {
    @EmbeddedId
    private ProductoFacturaFK id;
    @Column(name = "Cod_Factura")
    private String cod_factura;
    @Column(name = "Cod_Producto")
    private String cod_producto;

    @Column(name = "Val_unitario")
    private String Val_unitario;

    @Column(name = "cantidad")
    private int  cantidad;

    @Column(name = "activo")
    private boolean activo;


    public ProductoFacturaFK getId() {
        return id;
    }

    public void setId(ProductoFacturaFK id) {
        this.id = id;
    }

    public String getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(String cod_factura) {
        this.cod_factura = cod_factura;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getVal_unitario() {
        return Val_unitario;
    }

    public void setVal_unitario(String val_unitario) {
        Val_unitario = val_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
