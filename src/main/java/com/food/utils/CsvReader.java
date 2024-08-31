package com.food.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.food.model.Customer;
import com.food.model.Dish;
import com.food.model.Restaurant;

public class CsvReader {

	public List<Customer> readCustomerFromCsv(){
		List<Customer> customerList=new ArrayList<>();
		String customerCsvPath="C:\\Users\\Jithendar\\Workspace\\SpringBoot\\foodile-cli-app\\src\\main\\resources\\templates\\customers.csv";
		try(BufferedReader read=new BufferedReader(new FileReader(customerCsvPath))){
			String line;
		     read.readLine();
     		while((line=read.readLine()) !=null) {
     			String[] data=line.split(",");
     			Customer customer=new Customer();
     			customer.setId(data[0]);
                customer.setName(data[1]);
                customer.setEmail(data[2]);
                customer.setPassword(data[3]);
                customerList.add(customer);
     		}
		}catch (IOException e) {
			System.out.println("file not found");
			System.exit(0);
			e.printStackTrace();
		}
		return customerList;
	}
	
	public List<Dish> readDishesFromCsv(){
		String dishesCsvPath="C:\\Users\\Jithendar\\Workspace\\SpringBoot\\foodile-cli-app\\src\\main\\resources\\templates\\dishes.csv";
		List<Dish> dishList=new ArrayList<>();
		try(BufferedReader read=new BufferedReader(new FileReader(dishesCsvPath))){
			String line;
			read.readLine();
			while((line=read.readLine())!=null) {
				String[] data=line.split(",");
				Dish dish=new Dish();
				dish.setId(data[0]);
				dish.setName(data[1]);
				dish.setDescription(data[2]);
				dish.setPrice(Double.parseDouble(data[3]));
				dishList.add(dish);
			}
			
		}catch (IOException e) {
			System.exit(0);
			System.out.println("file not found");
			e.printStackTrace();
		}
		return dishList;
	}
	
	public List<Restaurant> readRestaurantFromCsv(){
		List<Restaurant> restaurantsList=new ArrayList<>();
		String restaurtentCsvPath="C:\\Users\\Jithendar\\Workspace\\SpringBoot\\foodile-cli-app\\src\\main\\resources\\templates\\restaurants.csv";
		try(BufferedReader read=new BufferedReader(new FileReader(restaurtentCsvPath))){
			read.readLine();
			String line;
			while((line=read.readLine())!=null) {
				String[] data=line.split(",");
				String[] menu=data[3].split(":");
				Restaurant restaurant=new Restaurant();
				restaurant.setId(data[0]);
				restaurant.setName(data[1]);
				restaurant.setMenu(Arrays.asList(menu));
				restaurant.setAddress(data[2]);
				restaurantsList.add(restaurant);
			}
			}catch (IOException e) {
				System.exit(0);
				System.out.println("File not found");
				e.printStackTrace();
			}
		return restaurantsList;
	}
}
