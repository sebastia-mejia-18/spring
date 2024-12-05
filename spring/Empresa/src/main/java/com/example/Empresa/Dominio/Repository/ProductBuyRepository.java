package com.example.Empresa.Dominio.Repository;

import com.example.Empresa.Dominio.ProductBuy;

import java.util.List;

public interface ProductBuyRepository {

    List<ProductBuy> getAll();

    ProductBuy getByProductBuy(String ProductoBuyId);

    ProductBuy save(ProductBuy productBuy);

    boolean delete (String ProductBuy);

}
