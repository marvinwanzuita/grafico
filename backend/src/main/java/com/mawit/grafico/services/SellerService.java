package com.mawit.grafico.services;

import com.mawit.grafico.dto.SellerDto;
import com.mawit.grafico.entities.Seller;
import com.mawit.grafico.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDto> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(SellerDto::new).collect(Collectors.toList());
    }



}
