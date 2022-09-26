package com.navs.foxhole.logi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "torder" )
public class Order {

	@Id
	private int id;

	@Column
	private String amount;
	
	@Column
	private String pedido;

	@Column
	private String description;
	
	@Column
	private String region;

	@Column
	private String area;

/*  // orientation N, S, W, E, Center
	@Column
	private String orientation;
*/
	
	@JoinColumn( name = "creatorId" )
	@OneToOne
	private User creator;

	@OneToOne
	@JoinColumn( name = "responsableId" )
	private User responsable;
	
	public Order() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public User getResponsable() {
		return responsable;
	}

	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}
	
	
}
