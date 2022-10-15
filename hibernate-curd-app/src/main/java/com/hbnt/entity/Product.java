package com.hbnt.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
@Table(name = "TBL_PRODUCT" ,schema = "hbntjpa")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PID")
	private Integer pid;
	@Column(name = "PNAME")
	private String productName;
	@Column(name = "PDESC")
	private String description;
	@Column(name = "PQTY")
	private Integer quantity;
	@Column(name = "PRICE")
	private Double price;
	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private LocalDateTime createdDate;
	@Column(name = "UPDATED_DATE")
	@UpdateTimestamp
	private LocalDateTime updatedDate;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
