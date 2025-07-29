package com.richim.repository.entity;

import java.time.LocalDateTime;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Shareholder {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long shareholderId;

	    @NotBlank(message = "Name is mandatory")
	    @Size(max = 100)
	    @Column(nullable = false, length = 100)
	    private String name;

	    @Email(message = "Invalid email format")
	    @NotBlank(message = "Email is required")
	    @Column(unique = true, nullable = false)
	    private String email;

	    @NotBlank(message = "Phone is mandatory")
	    @Size(min = 10, max = 10, message = "Phone must be 10 digits")
	    @Column(nullable = false, unique = true, length = 10)
	    private String phone;



	    @Column(length = 10)
	    private String pan_number;
	    
	    @OneToMany(cascade = CascadeType.ALL)
	    private Share share;

	    @Column(name = "created_at", nullable = false)
	    private LocalDateTime createdAt;

	   public Shareholder(){}
	    
		public Long getShareholderId() {
			return shareholderId;
		}

		public void setShareholderId(Long shareholderId) {
			this.shareholderId = shareholderId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getPan_number() {
			return pan_number;
		}

		public void setPan_number(String pan_number) {
			this.pan_number = pan_number;
		}

		public Share getShare() {
			return share;
		}

		public void setShare(Share share) {
			this.share = share;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		public Shareholder(Long shareholderId, @NotBlank(message = "Name is mandatory") @Size(max = 100) String name,
				@Email(message = "Invalid email format") @NotBlank(message = "Email is required") String email,
				@NotBlank(message = "Phone is mandatory") @Size(min = 10, max = 10, message = "Phone must be 10 digits") String phone,
				String pan_number, Share share, LocalDateTime createdAt) {
			super();
			this.shareholderId = shareholderId;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.pan_number = pan_number;
			this.share = share;
			this.createdAt = createdAt;
		}
	    
	    
	    
}
