package com.k1m743hyun.stockservice.controller;

import com.k1m743hyun.stockservice.domain.dto.StockDto;
import com.k1m743hyun.stockservice.service.StockService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/stocks")
public class StockController {

    private final StockService service;

    @PostMapping
    public void createItem(@RequestBody StockDto requestDto) {
        service.createItem(requestDto);
    }

    @GetMapping("/{stockNum}")
    public StockDto getItem(@PathVariable Long stockNum) {
        return service.getItem(stockNum);
    }

    @GetMapping
    public List<StockDto> getItems() {
        return service.getItems();
    }

    @DeleteMapping
    public void deleteItem(@RequestBody StockDto requestDto) {
        service.deleteItem(requestDto);
    }
}
