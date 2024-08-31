package com.food.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.model.Restaurant;
import com.food.utils.CsvReader;

@Repository
public class RestaurantRepository {

	@Autowired
	private CsvReader csvReader;
	
	public List<Restaurant>getAllRestarant(){
		return csvReader.readRestaurantFromCsv();
	}
}
