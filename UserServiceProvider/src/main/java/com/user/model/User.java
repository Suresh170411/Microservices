package com.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "micro_users")
public class User {

	@Id
	private String userId;
	private String userName;
	private String email;
	private String about;
	
}
