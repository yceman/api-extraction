package com.agro.api_extraction.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCT_EXTRACT")
public class ProductExtractModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true)
    private String productName;
    @Column(nullable = false, unique = true)
    private String productRegion;

    public UUID getId() {
        return id;
    }

    void setId(UUID id){
        this.id = id;
    }

    public String getProductName() {
        return getProductName();
    }
    void setProductName(String productName){
        this.productName = productName;
    }
}
