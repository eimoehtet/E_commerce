package com.code2.adminportal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@ManyToOne
	@JoinColumn(name="appuser_id")
	private  AppUser user;
	@Column(name="address")
	private String address;
	@Column(name="total")
	private double total;
	@Column(name="delivered")
	private boolean delivered;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<OrderItems>orderItems;
	public List<OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	public Orders() {
		
	}
	
	
	public Orders(Long id, AppUser user, String address, double total, boolean delivered) {
	
		this.id = id;
		this.user = user;
		this.address = address;
		this.total = total;
		this.delivered = delivered;
	}
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
