package com.example.Empresa.Dominio;

import java.util.Date;

public class Buy {

    private String code ;

    private Date date;

    private String ClientId;
    private String SellerId ;

    private boolean Active;

    Client client;
    SellerId sellerId;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    public String getSellerId() {
        return SellerId;
    }

    public void setSellerId(com.example.Empresa.Dominio.SellerId sellerId) {
        this.sellerId = sellerId;
    }

    public void setSellerId(String sellerId) {
        SellerId = sellerId;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
