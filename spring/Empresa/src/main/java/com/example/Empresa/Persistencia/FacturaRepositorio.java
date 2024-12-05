package com.example.Empresa.Persistencia;

import com.example.Empresa.Persistencia.Crud.FacturaCrudRepositorio;
import com.example.Empresa.Persistencia.Entity.Factura;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FacturaRepositorio {
    FacturaCrudRepositorio facturaCrudRepositorio;

    public List <Factura> ConsultaGeneral(){
        return (List<Factura>) facturaCrudRepositorio.findAll();
    }

    public Optional<Factura> ConsultaIndividual(String cod_factura){

        return facturaCrudRepositorio.findById(cod_factura);
    }

    public Factura Guardar(Factura factura){
        return facturaCrudRepositorio.save(factura);
    }

    public void Eliminar (String cod_factura){
        facturaCrudRepositorio.deleteById(cod_factura);
    }
}
