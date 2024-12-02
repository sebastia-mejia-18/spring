package com.example.Empresa.Persistencia.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class ProductoFacturaFK {
    @Column(name = "cod_factura")
    private String CodFactura;

    @Column(name = "cod_producto")
    private String Cod_Producto;

    public String getCodFactura() {
        return CodFactura;
    }

    public void setCodFactura(String codFactura) {
        CodFactura = codFactura;
    }

    public String getCod_Producto() {
        return Cod_Producto;
    }

    public void setCod_Producto(String cod_Producto) {
        Cod_Producto = cod_Producto;
    }
}
