package com.example.Empresa.Persistencia.Mapeador;

import com.example.Empresa.Dominio.Client;
import com.example.Empresa.Persistencia.Entity.Cliente;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClienteMapeador {
    @Mappings({
            @Mapping(source ="IdenCliente" ,target = "ClientId"),
            @Mapping(source ="NomCliente" ,target = "name"),
            @Mapping(source ="DirCliente" ,target = "address"),
            @Mapping(source ="TelCliente" ,target = "Phone"),
            @Mapping(source ="activo" ,target = "Active")



            })
    Client toCliente(Cliente cliente);

    @InheritConfiguration



}
