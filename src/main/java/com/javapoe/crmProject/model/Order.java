package com.javapoe.crmProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String typePresta;
	private String designation;
	private int nbDays;
	private double unitPrice;
	private boolean state;
	private double totalExcludeTaxe;
	private double totalWithTaxe;
	
	@ManyToOne
	private Client client;

	public Order() {
		
	}
	
	public Order(String typePresta, String designation, int nbDays, double unitPrice, boolean state,
			double totalExcludeTaxe, double totalWithTaxe, Client client) {
		this.typePresta = typePresta;
		this.designation = designation;
		this.nbDays = nbDays;
		this.unitPrice = unitPrice;
		this.state = state;
		this.totalExcludeTaxe = totalExcludeTaxe;
		this.totalWithTaxe = totalWithTaxe;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypePresta() {
		return typePresta;
	}

	public void setTypePresta(String typePresta) {
		this.typePresta = typePresta;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getNbDays() {
		return nbDays;
	}

	public void setNbDays(int nbDays) {
		this.nbDays = nbDays;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public double getTotalExcludeTaxe() {
		return totalExcludeTaxe;
	}

	public void setTotalExcludeTaxe(double totalExcludeTaxe) {
		this.totalExcludeTaxe = totalExcludeTaxe;
	}

	public double getTotalWithTaxe() {
		return totalWithTaxe;
	}

	public void setTotalWithTaxe(double totalWithTaxe) {
		this.totalWithTaxe = totalWithTaxe;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", typePresta=" + typePresta + ", designation=" + designation + ", nbDays=" + nbDays
				+ ", unitPrice=" + unitPrice + ", state=" + state + ", totalExcludeTaxe=" + totalExcludeTaxe
				+ ", totalWithTaxe=" + totalWithTaxe + ", client=" + client + "]";
	}
	
	
	
}
