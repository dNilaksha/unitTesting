package com.evictory.inventorycloud;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.validation.constraints.Size;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.evictory.inventorycloud.modal.Stock;
import com.evictory.inventorycloud.repository.StockRepository;
import com.evictory.inventorycloud.service.StockServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceApplicationTests {

	
	/*
	 * @Autowired private StockServiceImpl stockServiceImpl;
	 * 
	 * @MockBean private StockRepository stockRepository;
	 * 
	 * public void fetchAllServicesTest() {
	 * when(stockRepository.findAll()).thenReturn(Stream. of(new
	 * Stock(1,"2019-02-16",3,"fdglcs",1,3,4)).collect(Collectors.toList()));
	 * assertEquals(1, stockServiceImpl.fetchAll().size());
	 * 
	 * }
	 */
	 
	/*
	 * @Test public void contextLoads() { }
	 */

}
