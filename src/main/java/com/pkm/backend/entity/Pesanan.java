package com.pkm.backend.entity;

import com.pkm.backend.model.StatusPesanan;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Pesanan implements Serializable {

    @Id
    private String id;

    private String nomor;

    @Temporal(TemporalType.DATE)
    private Date tanggal;

    @JoinColumn
    @ManyToOne
    private Pengguna pengguna;

    private String alamatPengiriman;

    private BigDecimal jumlah;

    private BigDecimal ongkir;

    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    private StatusPesanan statusPesanan;

    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuPesan;
}
