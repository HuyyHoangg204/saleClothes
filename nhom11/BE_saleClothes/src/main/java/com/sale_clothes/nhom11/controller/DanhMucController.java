package com.sale_clothes.nhom11.controller;

import java.util.List;

import com.sale_clothes.nhom11.dto.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sale_clothes.nhom11.dto.DanhMucDTO;
import com.sale_clothes.nhom11.service.impl.DanhMucServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class DanhMucController {
    @Autowired
    private DanhMucServiceImpl danhMucServiceImpl;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add-danhmuc")
    public ApiResponse<DanhMucDTO> createDanhMuc(@RequestBody DanhMucDTO danhMucDTO) {
        DanhMucDTO saveDanhMuc = danhMucServiceImpl.createDanhMucDTO(danhMucDTO);
        return ApiResponse.<DanhMucDTO>builder()
                .result(saveDanhMuc)
                .build();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/danhmucs")
    public ApiResponse<List<DanhMucDTO>> getAllDanhMuc() {
        List<DanhMucDTO> danhMucDTOS = danhMucServiceImpl.findALLDanhMucDTOs();
        return ApiResponse.<List<DanhMucDTO>>builder()
                .result(danhMucDTOS)
                .build();
    }
}
