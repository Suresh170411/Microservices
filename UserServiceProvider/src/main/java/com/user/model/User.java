package com.user.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
}
