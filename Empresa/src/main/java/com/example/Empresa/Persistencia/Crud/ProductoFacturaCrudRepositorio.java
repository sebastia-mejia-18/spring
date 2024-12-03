package com.example.Empresa.Persistencia.Crud;

import com.example.Empresa.Persistencia.Entity.ProductoFactura;
import org.springframework.data.repository.CrudRepository;

public interface ProductoFacturaCrudRepositorio extends CrudRepository<ProductoFactura, String> {
}

