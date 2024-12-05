package com.example.Empresa.Dominio.Repository;

import com.example.Empresa.Dominio.Client;
import com.example.Empresa.Dominio.SellerId;

import java.util.List;

public interface SellerIdRepository {

    List<SellerId> getAll();

    SellerId getByClient(String SellerId);

    SellerId save(SellerId sellerId);

    boolean delete(String SellerId);

}
