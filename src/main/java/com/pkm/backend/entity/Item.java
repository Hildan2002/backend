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
public class Item implements Serializable {

    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Product product;

    private String deskripsi;

    private Double kuantitas;

    private BigDecimal harga;

    private BigDecimal jumlah;

    @JoinColumn
    @ManyToOne
    private Pesanan pesanan;
}
