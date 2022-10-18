package com.hbnt.onetomany.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "TBL_ORDER")
public class OrderEntity {

	@Id
	private Integer id;
	private LocalDate localdate;
	private String orderStatus;
	private Integer orderId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getLocaldate() {
		return localdate;
	}
	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", localdate=" + localdate + ", orderStatus=" + orderStatus + ", orderId="
				+ orderId + "]";
	}
	
	
	
}
