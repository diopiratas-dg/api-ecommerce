package br.com.digitalhouse.apiecommerce.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categoria")
public class Category {

    @Id
    private Integer id;

    @Column(nullable = false, length = 50, name = "descricao")
    private String description;

    public Category(){}

    public Category(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
