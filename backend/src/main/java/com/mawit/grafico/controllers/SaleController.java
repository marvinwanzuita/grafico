package com.mawit.grafico.controllers;

import com.mawit.grafico.dto.SaleDto;
import com.mawit.grafico.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        Page<SaleDto> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

}
