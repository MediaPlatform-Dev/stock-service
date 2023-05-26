package com.k1m743hyun.stockservice.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockDto {

    private Long stockNum;
    private String itemName;
    private Long itemPrice;
    private int stockQuantity;
}
