package com.richim.share_crud_service.Share_Crud_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ShareCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareCrudServiceApplication.class, args);
	}

}
