package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.HotelException;
import com.hotel.model.Hotel;
import com.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel getHotelById(String id) throws HotelException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelList() throws HotelException {
		// TODO Auto-generated method stub
		return null;
	}

}
