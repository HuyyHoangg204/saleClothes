package com.sale_clothes.nhom11.service.impl;

import com.sale_clothes.nhom11.dto.GioHangDTO;
import com.sale_clothes.nhom11.entity.GioHang;
import com.sale_clothes.nhom11.mapper.GioHangMapper;
import com.sale_clothes.nhom11.repository.GioHangRepository;
import com.sale_clothes.nhom11.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangServiceImpl implements GioHangService {
    @Autowired
    private GioHangRepository gioHangRepository;
    @Override
    public GioHangDTO createGioHang(GioHangDTO gioHangDTO) {
        return null;
    }

    @Override
    public List<GioHangDTO> getAllGioHang() {
        return null;
    }

    @Override
    public GioHangDTO getGioHangId(Integer id) {
        return null;
    }

    @Override
    public GioHangDTO updateGioHang(Integer id, GioHangDTO gioHangDTO) {
        return null;
    }

    @Override
    public void deleteGioHang(GioHangDTO gioHangDTO) {

    }
}
