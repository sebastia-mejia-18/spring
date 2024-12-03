package com.example.Empresa.Persistencia.Crud;

import com.example.Empresa.Persistencia.Entity.Vendedor;
import org.springframework.data.repository.CrudRepository;

public interface VendedorCrudRepositorio extends CrudRepository<Vendedor, String> {
}
