package com.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "micro_hotel")
public class Hotel {

	@Id
	private String id;
	private String name;
	private String location;
	private String about;
}
