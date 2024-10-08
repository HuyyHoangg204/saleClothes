package com.sale_clothes.nhom11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sale_clothes.nhom11.entity.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String> {

    boolean existsByKhUserName(String userName);

    boolean existsByKhEmail(String email);
}
