package com.pkm.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Cart implements Serializable {

    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Product product;

    @JoinColumn
    @ManyToOne
    private Pengguna pengguna;

    private Double kuantitas;

    private BigDecimal harga;

    private BigDecimal jumlah;

    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuDibuat;
}
