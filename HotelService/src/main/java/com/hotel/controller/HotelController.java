package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.exception.HotelException;
import com.hotel.model.Hotel;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/register")
	public ResponseEntity<Hotel> addHotelHandler(@RequestBody Hotel hotel){
		return new ResponseEntity<>(hotelService.addHotel(hotel), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotelByIdHandler(@PathVariable String id) throws HotelException{
		return new ResponseEntity<Hotel>(hotelService.getHotelById(id), HttpStatus.OK);
	}
}
