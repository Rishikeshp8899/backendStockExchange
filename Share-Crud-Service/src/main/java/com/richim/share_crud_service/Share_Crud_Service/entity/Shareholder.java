package com.richim.share_crud_service.Share_Crud_Service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
