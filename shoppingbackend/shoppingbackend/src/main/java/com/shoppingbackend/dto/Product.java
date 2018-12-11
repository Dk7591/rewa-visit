package com.shoppingbackend.dto;


import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Component
@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// private fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	//@NotBlank(message = "Please enter the product name!")
	private String name;
	//@NotBlank(message = "Please enter the brand name!")
	private String brand;
	//@NotBlank(message = "Please enter the discription!")
	private String discription;
	@Column(name = "unit_price")
	//@Min(value = 1, message="Please select at least one value!")
	private double unitPrice;
	private int quantity;
	@Column(name = "is_active")	
	private boolean active;
	@Column(name = "cetegory_id")
	@JsonIgnore
	private int cetegoryId;
	@Column(name = "supplier_id")
	@JsonIgnore
	private int supplierId;
	private int purchases;
	private int views;
	
	
	@Transient
	private MultipartFile file;
			
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}


	// default constructor
	public Product() {
		
		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
		
	}
	
	
	// setters and getters	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getdiscription() {
		return discription;
	}
	public void setdiscription(String discription) {
		this.discription = discription;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getcetegoryId() {
		return cetegoryId;
	}
	public void setcetegoryId(int cetegoryId) {
		this.cetegoryId = cetegoryId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	
	// toString for debugging
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", brand=" + brand + ", discription="
				+ discription + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", active=" + active
				+ ", cetegoryId=" + cetegoryId + ", supplierId=" + supplierId + ", purchases=" + purchases + ", views="
				+ views + "]";
	}
}
