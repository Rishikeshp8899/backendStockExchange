package com.richim.repository.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name="Share")

public class Share {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long shareId;
	  
	  @NotBlank(message = "id is mandatory")
	
	  @ManyToOne
	  private Company company;
	  
	  @NotBlank(message = "amount is mandatory")
	  private Double shareAmount;
	  
	  @NotBlank(message = "share holder is mandatory")
	  @ManyToOne(cascade = CascadeType.ALL)
	  private Shareholder shareholder;
	  
	  @NotNull(message = "Quantity is required")
	  @Min(value = 1, message = "Quantity must be greater than 0")
	  private Integer quantity;

	public Long getShareId() {
		return shareId;
	}

	public void setShareId(Long shareId) {
		this.shareId = shareId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Double getShareAmount() {
		return shareAmount;
	}

	public void setShareAmount(Double shareAmount) {
		this.shareAmount = shareAmount;
	}

	public Shareholder getShareholder() {
		return shareholder;
	}

	public void setShareholder(Shareholder shareholder) {
		this.shareholder = shareholder;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Share(Long shareId, Company company, Double shareAmount, Shareholder shareholder, Integer quantity) {
		super();
		this.shareId = shareId;
		this.company = company;
		this.shareAmount = shareAmount;
		this.shareholder = shareholder;
		this.quantity = quantity;
	}
	
	public Share() {}
}
