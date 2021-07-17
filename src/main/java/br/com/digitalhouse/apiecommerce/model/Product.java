package br.com.digitalhouse.apiecommerce.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "produto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_produto")
    private Integer idProduto;

    @Column(nullable = false, name = "descricao")
    private String description;

    @Column(nullable = false, name = "codigo")
    private String code;

    @Column(nullable = false, name = "preco")
    private double price;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_categoria")
    private Category category;

    @Column(nullable = false, name = "nome")
    private String nameProduct;

    public Product(){};

    public Product(String codigo, String description, double price, Category category, String nomeProduto) {
        this.code = codigo;
        this.description = description;
        this.price = price;
        this.category = category;
        this.nameProduct = nomeProduto;
    }

    public String getNameProduct() {
        return nameProduct;
    }
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto){
        this.idProduto = idProduto;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }

    public Category getCategory() {
        return category;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

}

