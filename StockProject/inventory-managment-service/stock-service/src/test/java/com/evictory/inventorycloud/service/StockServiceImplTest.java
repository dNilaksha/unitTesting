package com.evictory.inventorycloud.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.evictory.inventorycloud.modal.Stock;
import com.evictory.inventorycloud.modal.StockDetails;
import com.evictory.inventorycloud.repository.StockRepository;
class StockServiceImplTest {
	@InjectMocks
	StockServiceImpl stockServiceImpl;
	
	@Mock
	StockRepository stockRepository;
	
	@BeforeEach
	void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	void testFetchAll() {
		List<StockDetails> stockDetails = new ArrayList<>();
		List<Stock> list = new ArrayList<Stock>();
		
		Stock s=new Stock();
		//s.getId();
		s.setId(4);
		s.setDate(ZonedDateTime.now(ZoneId.of("UTC-4")));
		s.setReason("ABC");
		s.setUser(5);
		s.setStockDetails(stockDetails);
		list.add(s);
	
		when(stockRepository.findAll()).thenReturn(list);
		
		List<Stock> stlist=stockServiceImpl.fetchAll();
		assertNotNull(stlist);
		assertEquals(0,stlist.get(0));
	}

}
