package com.example.Empresa.Dominio.Repository;

import com.example.Empresa.Dominio.Buy;

import java.util.List;

public interface BuyRepository {

    List<Buy> getAll();

    Buy getByBuy(String code);

    Buy save(Buy buy);

    boolean delete(String code);
}
