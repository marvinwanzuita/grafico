package com.mawit.grafico.dto;

import com.mawit.grafico.entities.Seller;

import java.io.Serializable;

public class SaleSumDto implements Serializable {

    private String sallerName;
    private Double sum;

    public SaleSumDto(){}

    public SaleSumDto(Seller seller, Double sum) {
        this.sallerName = seller.getName();
        this.sum = sum;
    }

    public String getSallerName() {
        return sallerName;
    }

    public void setSallerName(String sallerName) {
        this.sallerName = sallerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
