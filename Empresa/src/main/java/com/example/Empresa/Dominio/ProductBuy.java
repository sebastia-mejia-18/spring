package com.example.Empresa.Dominio;

public class ProductBuy {

    private String  ProductoBuyId;
    private String ProducBuyName;
    private String Price;
    private int amount;
    private boolean Active;

    public String getProductoBuyId() {
        return ProductoBuyId;
    }

    public void setProductoBuyId(String productoBuyId) {
        ProductoBuyId = productoBuyId;
    }

    public String getProducBuyName() {
        return ProducBuyName;
    }

    public void setProducBuyName(String producBuyName) {
        ProducBuyName = producBuyName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }
}
