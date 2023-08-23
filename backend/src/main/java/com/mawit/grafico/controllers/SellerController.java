package com.mawit.grafico.controllers;

import com.mawit.grafico.dto.SellerDto;
import com.mawit.grafico.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService service;


    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll(){
        List<SellerDto> list = service.findAll();
        return ResponseEntity.ok(list);
    }

}
