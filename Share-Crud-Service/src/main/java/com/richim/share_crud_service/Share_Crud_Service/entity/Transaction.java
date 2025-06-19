package com.richim.share_crud_service.Share_Crud_Service.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long TransactionId;
	    
		  @NotBlank(message = "amount is mandatory")
		  private Double shareAmount;
		  
		  @NotBlank(message = "Seller shareholder is mandatory")
		  private Shareholder sellerShareholder;
		  
		  @NotNull(message = "Quantity is required")
		  @Min(value = 1, message = "Quantity must be greater than 0")
		  private Integer quantity;
		  
		  @NotBlank(message = "Buyer Shareholder is mandatory")
		  private Shareholder buyerShareholder;


}
