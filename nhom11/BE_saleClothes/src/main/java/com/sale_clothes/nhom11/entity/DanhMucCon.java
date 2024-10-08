package com.sale_clothes.nhom11.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "danh_muc_con")
public class DanhMucCon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dmc_ma")
    private Integer dmcMa;

    @Column(name = "dmc_ten")
    private String dmcTen;

    @ManyToOne
    @JoinColumn(name = "dm_ma")
    private DanhMuc dmMa;
}
