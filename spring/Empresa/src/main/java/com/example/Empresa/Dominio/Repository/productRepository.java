package com.example.Empresa.Dominio.Repository;

import com.example.Empresa.Dominio.Product;

import java.util.List;

public interface productRepository {

    List<Product> getAll();

    Product getByProduct(String ProductId);

    Product save (Product product);

    boolean delete (String ProdeuctId);
}
