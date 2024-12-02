package com.example.Empresa.Persistencia.Crud;

import com.example.Empresa.Persistencia.Entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaCrudRepositorio extends CrudRepository<Factura,String> {}
