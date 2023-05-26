package com.k1m743hyun.stockservice.domain.mapper;

import com.k1m743hyun.stockservice.domain.dto.StockDto;
import com.k1m743hyun.stockservice.domain.entity.Stock;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StockMapper {

    Stock toEntity(StockDto dto);

    StockDto toDto(Stock entity);
}
