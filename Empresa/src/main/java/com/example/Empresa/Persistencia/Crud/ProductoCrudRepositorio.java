package com.example.Empresa.Persistencia.Crud;

import com.example.Empresa.Persistencia.Entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepositorio extends CrudRepository<Producto,String> {
}
