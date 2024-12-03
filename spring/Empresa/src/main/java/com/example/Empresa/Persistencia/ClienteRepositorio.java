package com.example.Empresa.Persistencia;

import com.example.Empresa.Persistencia.Crud.ClientenCrudRepositorio;
import com.example.Empresa.Persistencia.Entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepositorio {
    ClientenCrudRepositorio clientenCrudRepositorio;

    public List<Cliente> ConsultaGeneral(){
        return (List<Cliente>) clientenCrudRepositorio.findAll();
    }

    public Optional<Cliente> ConsultaIndividual(String ident_cliente){
        return clientenCrudRepositorio.findById(ident_cliente);
    }

    public Cliente Guardar(Cliente cliente){

        return  clientenCrudRepositorio.save(cliente);
    }

    public void Eliminar (String ident_cliente){
        clientenCrudRepositorio.deleteById(ident_cliente);
    }


}
