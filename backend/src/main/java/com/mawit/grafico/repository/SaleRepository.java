package com.mawit.grafico.repository;

import com.mawit.grafico.dto.SaleSuccessDto;
import com.mawit.grafico.dto.SaleSumDto;
import com.mawit.grafico.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.mawit.grafico.dto.SaleSumDto(obj.seller, SUM(obj.amount))" +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDto> amountGroupedBySeller();

    @Query("SELECT new com.mawit.grafico.dto.SaleSuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals))" +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDto> successGroupedBySeller();


}
