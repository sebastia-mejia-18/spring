package com.example.Empresa.Persistencia.Crud;

import com.example.Empresa.Persistencia.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClientenCrudRepositorio extends CrudRepository<Cliente, String> {}
