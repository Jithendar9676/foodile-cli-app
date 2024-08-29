package com.food.model;

import java.util.List;
import java.util.Objects;

public class Restaurant {

	private String id;
	private String name;
	private String address;
	private List<String> menu;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(String id, String name, String address, List<String> menu) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.menu = menu;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getMenu() {
		return menu;
	}
	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, id, menu, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(menu, other.menu) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + ", menu=" + menu + "]";
	}
	
}
