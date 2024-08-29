package com.food.model;

import java.util.List;
import java.util.Objects;

public class Order {

	private String id;
	private Customer customer;
	private Restaurant restaurant;
	private List<Dish> dishes;
	private Double price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String id, Customer customer, Restaurant restaurant, List<Dish> dishes, Double price) {
		super();
		this.id = id;
		this.customer = customer;
		this.restaurant = restaurant;
		this.dishes = dishes;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customer, dishes, id, price, restaurant);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(dishes, other.dishes)
				&& Objects.equals(id, other.id) && Objects.equals(price, other.price)
				&& Objects.equals(restaurant, other.restaurant);
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", restaurant=" + restaurant + ", dishes=" + dishes
				+ ", price=" + price + "]";
	}
	
	
	
}
