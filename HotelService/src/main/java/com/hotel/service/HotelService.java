package com.hotel.service;

import java.util.List;

import com.hotel.exception.HotelException;
import com.hotel.model.Hotel;

public interface HotelService {

	public Hotel addHotel(Hotel hotel);
	
	public Hotel getHotelById(String id) throws HotelException;
	
	public List<Hotel> getHotelList() throws HotelException;
}
