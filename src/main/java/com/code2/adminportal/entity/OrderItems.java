package com.code2.adminportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderitems")
public class OrderItems {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	@Column(name="quantity")
	private int quantity;
	@Column(name="subtotal")
	private double subtotal;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders order;

	
	public OrderItems() {
		
	}

	public OrderItems(Long id, Product product, int quantity, double subtotal, Orders order) {
		
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.subtotal = subtotal;
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	

}
