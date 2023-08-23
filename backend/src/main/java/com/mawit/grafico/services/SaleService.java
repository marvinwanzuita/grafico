package com.mawit.grafico.services;

import com.mawit.grafico.dto.SaleDto;
import com.mawit.grafico.dto.SaleSuccessDto;
import com.mawit.grafico.dto.SaleSumDto;
import com.mawit.grafico.entities.Sale;
import com.mawit.grafico.repository.SaleRepository;
import com.mawit.grafico.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDto::new);
    }

    @Transactional(readOnly = true)
    public List<SaleSumDto> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDto> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }

}
