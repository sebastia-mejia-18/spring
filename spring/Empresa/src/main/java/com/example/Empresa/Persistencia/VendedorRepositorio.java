package com.example.Empresa.Persistencia;

import com.example.Empresa.Persistencia.Crud.VendedorCrudRepositorio;
import com.example.Empresa.Persistencia.Entity.Vendedor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VendedorRepositorio {
    VendedorCrudRepositorio vendedorCrudRepositorio;

    public List<Vendedor> ConsultaGeneral(){
       return (List<Vendedor>) vendedorCrudRepositorio.findAll();
    }

    public Optional<Vendedor> ConsultaIndividual (String ident_vendedor){
        return vendedorCrudRepositorio.findById(ident_vendedor);
    }

    public Vendedor Guardar (Vendedor vendedor){
        return vendedorCrudRepositorio.save(vendedor);
    }

    public void Eliminar (String ident_vendedor){
        vendedorCrudRepositorio.deleteById(ident_vendedor);
    }
}
