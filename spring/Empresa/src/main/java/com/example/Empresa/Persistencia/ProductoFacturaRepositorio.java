package com.example.Empresa.Persistencia;

import com.example.Empresa.Persistencia.Crud.ProductoFacturaCrudRepositorio;
import com.example.Empresa.Persistencia.Entity.ProductoFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoFacturaRepositorio {

    @Autowired
    private ProductoFacturaCrudRepositorio productoFacturaCrudRepositorio;

    // Consulta general: devuelve todos los registros
    public List<ProductoFactura> consultaGeneral() {
        return (List<ProductoFactura>) productoFacturaCrudRepositorio.findAll();
    }

    // Consulta individual por código de factura
    public Optional<ProductoFactura> consultaIndividual(String codFactura) {
        return productoFacturaCrudRepositorio.findById(codFactura);
    }

    // Guardar o actualizar un ProductoFactura
    public ProductoFactura guardar(ProductoFactura productoFactura) {
        return productoFacturaCrudRepositorio.save(productoFactura);
    }

    // Eliminar un ProductoFactura por código de factura
    public void eliminar(String codFactura) {
        productoFacturaCrudRepositorio.deleteById(codFactura);
    }
}
