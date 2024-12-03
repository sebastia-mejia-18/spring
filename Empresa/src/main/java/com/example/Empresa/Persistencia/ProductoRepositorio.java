package com.example.Empresa.Persistencia;

import com.example.Empresa.Persistencia.Crud.ProductoCrudRepositorio;
import com.example.Empresa.Persistencia.Entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepositorio {
    ProductoCrudRepositorio productoCrudRepositorio;

    public List <Producto> ConsultaGeneral(){
        return (List<Producto>)  productoCrudRepositorio.findAll();
    }

    public Optional<Producto> ConsultaIndividual(String Cod_Poducto){
        return productoCrudRepositorio.findById(Cod_Poducto);
    }

    public Producto Guardar (Producto producto){
        return  productoCrudRepositorio.save(producto);
    }

    public void Eliminar(String Cod_Factura){
        productoCrudRepositorio.deleteById(Cod_Factura);
    }
}
