package br.com.digitalhouse.apiecommerce.model;

public class Category {
    private String id;
    private String description;

    public Category(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
