package com.k1m743hyun.stockservice.service;

import com.k1m743hyun.stockservice.domain.mapper.StockMapper;
import com.k1m743hyun.stockservice.repository.StockRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StockServiceTest {

    @InjectMocks
    StockService service;

    @Mock
    StockRepository repository;

    @Mock
    StockMapper mapper;

    @Test
    @DisplayName("")
    void createItem() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("")
    void getItem() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("")
    void getItems() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("")
    void deleteItem() {

        // given

        // when

        // then
    }
}