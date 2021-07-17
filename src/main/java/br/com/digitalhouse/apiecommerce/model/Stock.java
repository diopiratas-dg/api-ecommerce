package br.com.digitalhouse.apiecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "estoque")
public class Stock {

    @Id
    @Column(name = "codigo")
    private String code;

    @OneToOne(fetch = FetchType.LAZY)
    private Product product;

    @Column(nullable = false, name = "quantidade")
    private int quantity;

    public Stock(){};

    public Stock(String code, Product product, int quantity) {
        this.code = code;
        this.product = product;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
