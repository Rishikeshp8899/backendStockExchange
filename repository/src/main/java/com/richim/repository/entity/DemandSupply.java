package com.richim.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class DemandSupply {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Company getComapany() {
		return comapany;
	}

	public void setComapany(Company comapany) {
		this.comapany = comapany;
	}

	public int getDemand() {
		return demand;
	}

	public void setDemand(int demand) {
		this.demand = demand;
	}

	public int getSupply() {
		return supply;
	}

	public void setSupply(int supply) {
		this.supply = supply;
	}

	public float getAtPrice() {
		return atPrice;
	}

	public void setAtPrice(float atPrice) {
		this.atPrice = atPrice;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Company comapany;
	
	private int demand;
	
	private int supply;
	
	private float atPrice;

	public DemandSupply(Long id, Company comapany, int demand, int supply, float atPrice) {
		super();
		this.id = id;
		this.comapany = comapany;
		this.demand = demand;
		this.supply = supply;
		this.atPrice = atPrice;
	}
	
	public DemandSupply() {}
}
