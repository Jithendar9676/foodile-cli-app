package com.food.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.model.Dish;
import com.food.utils.CsvReader;

@Repository
public class DishRepository {

	@Autowired
	private CsvReader csvReader;
	
	public List<Dish>getAllDishes(){
		return csvReader.readDishesFromCsv();
	}
}
