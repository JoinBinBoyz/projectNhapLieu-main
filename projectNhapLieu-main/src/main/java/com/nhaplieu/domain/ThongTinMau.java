package com.nhaplieu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "thongtin")
public class ThongTinMau {

    @Id
    @Column(name = "id_thong_tin_mau")
    private Long id_thong_tin_mau;

    @Column(name = "username")
    private String username;

    @Column(name = "xuat_xu")
    private String xuat_xu;

    @Column(name = "ngay_lay_mau")
    private String ngay_lay_mau;

    @Column(name = "ngay_nhan_mau")
    private String ngay_nhan_mau;

    @Column(name = "ly_do_thi_nghiem")
    private String ly_do_thi_nghiem;

    @Column(name = "phu_trach_lay_mau")
    private String phu_trach_lay_mau;

    @Column(name = "don_vi_yeu_cau")
    private String don_vi_yeu_cau;

    @Column(name = "yeu_cau_xe")
    private boolean yeu_cau_xe;

    @Column(name = "khi")
    private boolean khi;

    @Column(name = "dien")
    private boolean dien;

    @Column(name = "tang")
    private boolean tang;

    @Column(name = "nuoc")
    private boolean nuoc;

    @Column(name = "tri_so_acid")
    private boolean tri_so_acid;

    @Column(name = "chop_chay")
    private boolean chop_chay;

    @Column(name = "khang")
    private boolean khang;

    @Column(name = "nhot")
    private boolean nhot;

    @Column(name = "acid_bazo_hoa_tang")
    private boolean acid_bazo_hoa_tang;

    @Column(name = "can_lang")
    private boolean can_lang;

    @Column(name = "ty_trong")
    private boolean ty_trong;

    @Column(name = "luu_huynh_an_mon")
    private boolean luu_huynh_an_mon;

    @Column(name = "pcbs")
    private boolean pcbs;



    @Column(name = "furfural")
    private boolean furfural;


    @Column(name = "dien_ap_choc_thung1")
    private String dien_ap_choc_thung1;

    @Column(name = "dien_ap_choc_thung2")
    private String dien_ap_choc_thung2;

    @Column(name = "dien_ap_choc_thung3")
    private String dien_ap_choc_thung3;


    @Column(name = "tg_goc_ton_that_dien_moi1")
    private String tg_goc_ton_that_dien_moi1;

    @Column(name = "tg_goc_ton_that_dien_moi2")
    private String tg_goc_ton_that_dien_moi2;

    @Column(name = "tg_goc_ton_that_dien_moi3")
    private String tg_goc_ton_that_dien_moi3;


    @Column(name = "ham_luong_nuoc1")
    private String ham_luong_nuoc1;

    @Column(name = "ham_luong_nuoc2")
    private String ham_luong_nuoc2;

    @Column(name = "ham_luong_nuoc3")
    private String ham_luong_nuoc3;


    @Column(name = "tri_so_acid1")
    private String tri_so_acid1;

    @Column(name = "tri_so_acid2")
    private String tri_so_acid2;

    @Column(name = "tri_so_acid3")
    private String tri_so_acid3;


    @Column(name = "nhiet_do_chop_chay1")
    private String nhiet_do_chop_chay1;

    @Column(name = "nhiet_do_chop_chay2")
    private String nhiet_do_chop_chay2;

    @Column(name = "nhiet_do_chop_chay3")
    private String nhiet_do_chop_chay3;


    @Column(name = "do_nhot_o_401")
    private String do_nhot_o_401;

    @Column(name = "do_nhot_o_402")
    private String do_nhot_o_402;

    @Column(name = "do_nhot_o_403")
    private String do_nhot_o_403;


    @Column(name = "acid_bazo_hoa_tan1")
    private String acid_bazo_hoa_tan1;

    @Column(name = "acid_bazo_hoa_tan2")
    private String acid_bazo_hoa_tan2;

    @Column(name = "acid_bazo_hoa_tan3")
    private String acid_bazo_hoa_tan3;


    @Column(name = "can_lang1")
    private String can_lang1;

    @Column(name = "can_lang2")
    private String can_lang2;

    @Column(name = "can_lang3")
    private String can_lang3;


    @Column(name = "ty_trong_o_201")
    private String ty_trong_o_201;

    @Column(name = "ty_trong_o_202")
    private String ty_trong_o_202;

    @Column(name = "ty_trong_o_203")
    private String ty_trong_o_203;


    @Column(name = "luu_huynh_an_mon1")
    private String luu_huynh_an_mon1;

    @Column(name = "luu_huynh_an_mon2")
    private String luu_huynh_an_mon2;

    @Column(name = "luu_huynh_an_mon3")
    private String luu_huynh_an_mon3;


    @Column(name = "ham_luong_pcb1")
    private String ham_luong_pcb1;

    @Column(name = "ham_luong_pcb2")
    private String ham_luong_pcb2;

    @Column(name = "ham_luong_pcb3")
    private String ham_luong_pcb3;

    @Column(name = "do_on_dinh_oxy_hoa_dau1")
    private String do_on_dinh_oxy_hoa_dau1;

    @Column(name = "do_on_dinh_oxy_hoa_dau2")
    private String do_on_dinh_oxy_hoa_dau2;

    @Column(name = "do_on_dinh_oxy_hoa_dau3")
    private String do_on_dinh_oxy_hoa_dau3;

    @Column(name = "ham_luong_2_furfural1")
    private String ham_luong_2_furfural1;

    @Column(name = "ham_luong_2_furfural2")
    private String ham_luong_2_furfural2;

    @Column(name = "ham_luong_2_furfural3")
    private String ham_luong_2_furfural3;

    @Column(name = "tong_luong_khi_hoa_tan1")
    private String tong_luong_khi_hoa_tan1;

    @Column(name = "tong_luong_khi_hoa_tan2")
    private String tong_luong_khi_hoa_tan2;

    @Column(name = "tong_luong_khi_hoa_tan3")
    private String tong_luong_khi_hoa_tan3;

    @Column(name = "datecreate")
    private LocalDateTime dateCreate;

    @Column(name = "dateupdate")
    private LocalDateTime dateUpdate;

    @Column(name = "flag")
    private boolean flag;


}
