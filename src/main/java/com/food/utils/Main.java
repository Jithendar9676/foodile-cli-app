package com.food.utils;

public class Main {
public static void main(String[] args) {
	CsvReader csvReader=new CsvReader();
	System.out.println(csvReader.readRestaurantFromCsv());
}
}
