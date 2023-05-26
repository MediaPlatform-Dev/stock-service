package com.k1m743hyun.stockservice.controller;

import com.k1m743hyun.stockservice.domain.dto.StockDto;
import com.k1m743hyun.stockservice.service.StockService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/stocks")
public class StockController {

    private final StockService service;

    @PostMapping
    public void create(@RequestBody StockDto requestDto) {
        service.newItem(requestDto);
    }

    @GetMapping
    public List<StockDto> getItems() {
        return service.getItems();
    }

    @DeleteMapping
    public void delete(@RequestBody StockDto requestDto) {
        service.deleteItem(requestDto);
    }
}
