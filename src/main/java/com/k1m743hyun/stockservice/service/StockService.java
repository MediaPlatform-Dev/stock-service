package com.k1m743hyun.stockservice.service;

import com.k1m743hyun.stockservice.domain.dto.StockDto;
import com.k1m743hyun.stockservice.domain.mapper.StockMapper;
import com.k1m743hyun.stockservice.repository.StockRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StockService {

    private final StockRepository repository;
    private final StockMapper mapper;

    public void newItem(StockDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public List<StockDto> getItems() {
        return repository.findAll()
            .stream()
            .map(mapper::toDto)
            .toList();
    }

    public void deleteItem(StockDto dto) {
        repository.delete(mapper.toEntity(dto));
    }
}
