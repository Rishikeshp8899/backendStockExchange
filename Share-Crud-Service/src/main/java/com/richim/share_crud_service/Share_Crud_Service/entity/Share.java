package com.richim.share_crud_service.Share_Crud_Service.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Share")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Share {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long shareId;
	  
	  @NotBlank(message = "id is mandatory")
	  @Column(name = "company_id", nullable = false)
	  private Long companyId;
	  
	  @NotBlank(message = "amount is mandatory")
	  private Double shareAmount;
	  
	  @NotBlank(message = "share holder is mandatory")
	  @ManyToOne(cascade = CascadeType.ALL)
	  private Shareholder shareholder;
	  
	  @NotNull(message = "Quantity is required")
	  @Min(value = 1, message = "Quantity must be greater than 0")
	  private Integer quantity;
	  
}
