package com.pkm.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Product implements Serializable {

    @Id
    private String id;

    private String nama;

    private String deskripsi;

    private String gambar;

    @JoinColumn
    @ManyToOne
    private Category category;

    private BigDecimal harga;

    private Double stock;
}
